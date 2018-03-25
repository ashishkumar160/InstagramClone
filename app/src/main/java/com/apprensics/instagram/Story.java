package com.apprensics.instagram;

/**
 * Created by ashish on 25/3/18.
 */

public class Story {

    private String name;
    private int imageUrl;

    public Story() {
    }

    public Story(String name, int imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
