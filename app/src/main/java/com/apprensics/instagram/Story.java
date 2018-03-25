package com.apprensics.instagram;

/**
 * Created by ashish on 25/3/18.
 */

public class Story {

    private String name, imageUrl;

    public Story() {
    }

    public Story(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
