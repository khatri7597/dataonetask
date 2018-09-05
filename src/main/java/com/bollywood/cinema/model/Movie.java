package com.bollywood.cinema.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "movie")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "Name could not be null, please provide name")
	private String name;
	
	private String coverImageUrl;
	
	private Date releaseDate;
	
	private String genre;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_actor", joinColumns = {@JoinColumn	(name = "movie_id")}, inverseJoinColumns = { @JoinColumn(name = "actor_id") })
	@JsonManagedReference
	private List<Actor> actors = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "movie_director", joinColumns = {@JoinColumn	(name = "movie_id")}, inverseJoinColumns = { @JoinColumn(name = "director_id") })
	@JsonManagedReference
	private Director director;
	
	public Movie() {}
	
	public Movie(@NotNull(message = "Name could not be null, please provide name") String name, String coverImageUrl,
			Date releaseDate, String genre, List<Actor> actors, Director director) {
		super();
		this.name = name;
		this.coverImageUrl = coverImageUrl;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.actors = actors;
		this.director = director;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	
}
