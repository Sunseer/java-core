package ru.agrin.tracker;

/**
 * Модель заявки.
 * Created by grin on 15.12.2016.
 */
public class Bid {
    private String name;
    private String description;
    private long create;
    private String id;
    private String[] comments = new String[10];
    private int position = 0;

    public Bid(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getCreate() {
        return create;
    }

    public String getId() {
        return id;
    }

    public String[] getComments() {
        return comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreate(long create) {
        this.create = create;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public void addComment(String comment) {
        this.comments[position++] = comment;
    }
}


