package com.example.invoicesort.service.templates;

import com.example.invoicesort.storage.TemplateStorage;

import java.io.IOException;
import java.util.List;

public class TemplateDisplay {
    public void DisplayTemplates() throws IOException {
        TemplateStorage storage = new TemplateStorage();
        List<Template> list = storage.loadAllTemplates();
        for( Template template : list){
            System.out.println(template.getName());
        }
    }
}
