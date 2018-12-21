package com.minutetale.browse.domain.model;

/**
 * Created by jbhattacharya on 14/03/17.
 */

public class Author {
    private Long id;
    private String name;
    private Integer numberOfFollowers;
    private String artPath;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(Integer numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public String getArtPath() {
        return artPath;
    }

    public void setArtPath(String artPath) {
        this.artPath = artPath;
    }
}
