package com.minutetale.browse.domain.model;

/**
 * Created by jbhattacharya on 04/02/17.
 */

public class Story {
    private Long id;
    private Long authorId;
    private String name;
    private String author;
    private Integer readTimeInMinutes;
    private Integer numberOfLoves;
    private Integer numberOfReads;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getAuthorId() { return authorId; }

    public void setAuthorId(Long authorId) { this.authorId = authorId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) { this.author = author; }

    public Integer getReadTimeInMinutes() {
        return readTimeInMinutes;
    }

    public void setReadTimeInMinutes(Integer readTimeInMinutes) { this.readTimeInMinutes = readTimeInMinutes; }

    public Integer getNumberOfLoves() { return numberOfLoves; }

    public void setNumberOfLoves(Integer numberOfLoves) { this.numberOfLoves = numberOfLoves; }

    public Integer getNumberOfReads() { return numberOfReads; }

    public void setNumberOfReads(Integer numberOfReads) { this.numberOfReads = numberOfReads; }
}
