package com.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 1000)
    private String description;
    @Column(length = 1000)
    private String overview;
    @Column(name = "mainProject", nullable = false)
    private boolean mainProject;
    private String githubUrl;
    private String liveUrl;
    private String tools;

    private String backgroundImagePath;

    public Project(
            String title,
            String description,
            String overview,
            boolean mainProject,
            String githubUrl,
            String liveUrl,
            String tools,
            String backgroundImagePath,
            String imagePath
    ) {
        this.title = title;
        this.description = description;
        this.overview = overview;
        this.mainProject = mainProject;
        this.githubUrl = githubUrl;
        this.liveUrl = liveUrl;
        this.tools = tools;
        this.backgroundImagePath = backgroundImagePath;
        this.imagePath = imagePath;
    }

    private String imagePath;
}
