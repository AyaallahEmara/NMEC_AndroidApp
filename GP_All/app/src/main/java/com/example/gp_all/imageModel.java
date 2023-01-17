package com.example.gp_all;

public class imageModel {
    private int image;
    private String image_name;

    public imageModel(int Image, String name) {
        this.image = Image;
        this.image_name = name;
    }

    public String getText() {
        return image_name;
    }

    public void setText(String text) {
        this.image_name = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}