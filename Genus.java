package com.mycompany.zoo;

public class Genus {
    private String genusName;

    // Constructor
    public Genus(String genusName) {
        this.genusName = genusName;
    }

    // Accessor
    public String getGenusName() {
        return genusName;
    }

    // toString()
    @Override
    public String toString() {
        return "Genus name: " + genusName;
    }
}
