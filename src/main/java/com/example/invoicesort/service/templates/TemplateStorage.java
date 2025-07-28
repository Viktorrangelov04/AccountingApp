package com.example.invoicesort.service.templates;

import com.example.invoicesort.service.businesses.Company;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TemplateStorage {
    private Company company;
    public static final String TEMPLATE_STORAGE = "templates";

    public TemplateStorage(Company company){
        this.company = company;
    }

    public void saveTemplate(Template template) throws IOException {
        if (template == null || template.getName() == null || template.getName().isEmpty())
            throw new IllegalArgumentException("Template or template name is null/empty!");

        Files.createDirectories(Path.of(TEMPLATE_STORAGE));
        ObjectMapper mapper = new ObjectMapper();
        File templateFile =  new File(TEMPLATE_STORAGE, template.getName() +".json" );
        mapper.writeValue(templateFile, template);
    }

    public Template loadTemplate(String name) throws IOException {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Template name is null/empty!");

        ObjectMapper mapper = new ObjectMapper();
        File templateFile = new File(TEMPLATE_STORAGE,  name +".json" );
        return mapper.readValue(templateFile, Template.class);
    }

    public List<Template> loadAllTemplates() throws IOException {
        List<Template> templates = new ArrayList<>();
        File folder = new File(TEMPLATE_STORAGE);
        if(folder.exists()&& folder.isDirectory()){
            ObjectMapper mapper = new ObjectMapper();
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".json"));
            if(files!=null){
                Arrays.sort(files, Comparator.comparing(File::getName));
                for(File file:files){
                    Template template = mapper.readValue(file, Template.class);
                    templates.add(template);
                }

            }
        }
        return templates;
    }
}
