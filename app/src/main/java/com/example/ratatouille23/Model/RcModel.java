package com.example.ratatouille23.Model;

public class RcModel {
    String title;
    int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public RcModel(String title, int image) {
        this.title = title;
        this.image = image;
    }
}
