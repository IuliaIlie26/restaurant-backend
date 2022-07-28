package com.ibm.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component //pentru ca ele sa fie utilizate de spring in creearea Application Content
public class book {
    private Integer nrOfPages;

    @Autowired
    private Author author;
    private String title;

    public Integer getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(Integer nrOfPages) {
        this.nrOfPages = nrOfPages;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
