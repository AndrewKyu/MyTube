package com.example.andrewkyu.mytube;

public class ListItem {
    private String head;
    private String description;
    private String thumbnailUrl;
    private String id;


    public ListItem(String head, String description, String thumbnailUrl, String id) {
        this.head = head;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getId() {
        return id;
    }
}
