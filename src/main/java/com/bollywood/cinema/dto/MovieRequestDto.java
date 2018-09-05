package com.bollywood.cinema.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieRequestDto {
	
	private String movieName;
	private String coverImageUrl;
	private Date releaseDate;
	private String genre;
	private List<Integer> actors = new ArrayList<>();
	private Integer director;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Integer> getActors() {
		return actors;
	}
	public void setActors(List<Integer> actors) {
		this.actors = actors;
	}
	public Integer getDirector() {
		return director;
	}
	public void setDirector(Integer director) {
		this.director = director;
	}

}
