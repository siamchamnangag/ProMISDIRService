package com.scg.dir.model;

/**
 * Created by khan on 7/13/2017 AD.
 */
public class CreateDirDTO extends Dir{
    private String message;

    public CreateDirDTO() {
    }

    public CreateDirDTO(int docid, String description, String status, String user, String link, String message) {
        this.docid = docid;
        this.description = description;
        this.status = status;
        this.user = user;
        this.link = link;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
