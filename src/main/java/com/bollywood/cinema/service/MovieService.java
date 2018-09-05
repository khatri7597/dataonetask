package com.bollywood.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bollywood.cinema.dao.MovieDaoImpl;
import com.bollywood.cinema.dao.MoviePaginationRepository;
import com.bollywood.cinema.dto.MovieRequestDto;
import com.bollywood.cinema.model.Actor;
import com.bollywood.cinema.model.Director;
import com.bollywood.cinema.model.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieDaoImpl daoImpl;
	
	@Autowired
	private MoviePaginationRepository moviePaginationRepository;
	
	@Autowired 
	private ActorService actorService;
	
	@Autowired
	private DirectorService directorService;

	public Movie createMovie(MovieRequestDto dto) {
		List<Actor> actors = new ArrayList<>();
		for (Integer i : dto.getActors()) {
			Actor e = actorService.findById(i);
			actors.add(e);
		}
		Director director = directorService.findById(dto.getDirector());
		Movie movie = new Movie(dto.getMovieName(), dto.getCoverImageUrl(), dto.getReleaseDate(), dto.getGenre(), actors, director);
		movie = daoImpl.saveAndFlush(movie);
		return movie;
	}

	public Page<Movie> getMoviePageList(Pageable pageable) {
		return moviePaginationRepository.findAll(pageable);
	}

	public void deleteMovie(Integer id) {
		Movie movie = daoImpl.findByMovieId(id);
		if(movie!=null && movie.getId()>0) {
			daoImpl.deleteByMovieId(id);
		}
	}

}
