package models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 1/9/18.
 */
public class Beer {
    private String name;
    private String brewer;
    private String type;
    private String ABV;
    private String IBU;
    private Map<String, String> comments = new HashMap<>();

    public Beer(String name, String brewer, String type, String ABV, String IBU) {
        this.name = name;
        this.brewer = brewer;
        this.type = type;
        this.ABV = ABV;
        this.IBU = IBU;



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

    public String getABV() {
        return ABV;
    }

    public String getIBU() {
        return IBU;
    }

    public Map<String, String> getComments() {
        return comments;
    }

    public void setComments(String name, String comment) {
        comments.put(name, comment);

    }
}
