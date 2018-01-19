package com.ebsco.ebischoff.containerpractice.models;

public class Rake {

    private String size;

    public String use() {
        if (size == null) {
            return "A Broken Rake";
        } else if (size.toLowerCase().equals("small")) {
            return "Hay Straws";
        } else if (size.toLowerCase().equals("medium")) {
            return "Hay Pile";
        } else if (size.toLowerCase().equals("large")) {
            return "Hay Bale";
        } else {
            return "Dirt";
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
