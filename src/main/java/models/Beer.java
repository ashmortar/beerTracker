package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Beer {
    private String name;
    private String brewer;
    private String type;
    private String abv;
    private String ibu;
    private Map<String, String> comments = new HashMap<>();
    private static ArrayList<Beer> instances = new ArrayList<>();


    public Beer(String name, String brewer, String type, String ABV, String IBU) {
        this.name = name;
        this.brewer = brewer;
        this.type = type;
        this.abv = ABV;
        this.ibu = IBU;
        instances.add(this);


    }


    public String getName() {
        return name;
    }

    public String getBrewer() {
        return brewer;
    }

    public String getType() {
        return type;
    }

    public String getAbv() {
        return abv;
    }

    public String getIbu() {
        return ibu;
    }

    public Map<String, String> getComments() {
        return comments;
    }

    public void setComments(String name, String comment) {
        comments.put(name, comment);

    }

    public static ArrayList getAll() {
        return instances;
    }
}