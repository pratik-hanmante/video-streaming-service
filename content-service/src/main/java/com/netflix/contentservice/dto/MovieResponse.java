package com.netflix.contentservice.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {

    @NotBlank(message = "Title is required here")
    private String title;

    private String description;

    @NotNull(message = "Genre required")
    private String genre;

    private String director;

    private String cast;

    private int releaseYear;

    private double rating;

    private String thumbnailUrl;

    private int durationMinutes;
}
