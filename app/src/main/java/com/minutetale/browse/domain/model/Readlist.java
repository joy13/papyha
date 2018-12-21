package com.minutetale.browse.domain.model;

/**
 * Created by jBhattacharya on 02/02/17.
 */

public class Readlist {
    private Long id;
    private String name;
    private String description;
    private int storyCount;
    private int readTimeInMinutes;
    //private String artPath;
    private int artPath;
    private Integer numberOfLoves;
    private Integer numberOfReads;

    public Readlist(String name, String description, int storyCount, int readTimeInMinutes, int artPath) {
        this.name = name;
        this.description = description;
        this.storyCount = storyCount;
        this.readTimeInMinutes = readTimeInMinutes;
        this.artPath = artPath;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStoryCount() {
        return storyCount;
    }

    public void setStoryCount(int storyCount) {
        this.storyCount = storyCount;
    }

    public int getReadTimeInMinutes() {
        return readTimeInMinutes;
    }

    public void setReadTimeInMinutes(int readTimeInMinutes) {
        this.readTimeInMinutes = readTimeInMinutes;
    }

//    public String getArtPath() {
//        return artPath;
//    }
//
//    public void setArtPath(String readlistArt) {
//        this.artPath = artPath;
//    }

    public Integer getNumberOfLoves() { return numberOfLoves; }

    public void setNumberOfLoves(Integer numberOfLoves) { this.numberOfLoves = numberOfLoves; }

    public Integer getNumberOfReads() { return numberOfReads; }

    public void setNumberOfReads(Integer numberOfReads) { this.numberOfReads = numberOfReads; }

}
