package com.scg.dir.model;

/**
 * Created by khan on 7/12/2017 AD.
 */
public class Dir {
    private int docid;
    private String description;
    private String status;
    private String user;
    private String link;

    public Dir() {
    }

    public Dir(int docid, String description, String status, String user, String link) {
        this.docid = docid;
        this.description = description;
        this.status = status;
        this.user = user;
        this.link = link;
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dir dir = (Dir) o;

        if (docid != dir.docid) return false;
        if (description != null ? !description.equals(dir.description) : dir.description != null) return false;
        if (status != null ? !status.equals(dir.status) : dir.status != null) return false;
        if (user != null ? !user.equals(dir.user) : dir.user != null) return false;
        return link != null ? link.equals(dir.link) : dir.link == null;
    }

    @Override
    public int hashCode() {
        int result = docid;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }
}
