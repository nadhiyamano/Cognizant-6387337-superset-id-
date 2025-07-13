package com.cognizant.springlearn;

public class Country {
    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Getter: getCode()");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Setter: setCode()");
        this.code = code;
    }

    public String getName() {
        System.out.println("Getter: getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter: setName()");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
