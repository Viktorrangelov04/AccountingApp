package com.example.invoicesort.service;

public class Account {
    private String name;
    private String code;
    public Account() {}
    public Account(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }
    @Override
    public String toString(){
        return code + " " + name;
    }
}
