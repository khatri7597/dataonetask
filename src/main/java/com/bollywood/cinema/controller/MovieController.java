package com.bollywood.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bollywood.cinema.dto.MovieRequestDto;
import com.bollywood.cinema.model.Movie;
import com.bollywood.cinema.service.MovieService;

@CrossOrigin
@RestController
@RequestMapping("/movie/")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseEntity<Page<Movie>> getMovieList(Pageable pageable){
		return new ResponseEntity<Page<Movie>>(movieService.getMoviePageList(pageable), HttpStatus.OK);
	}
	
	@RequestMapping("create")
	public ResponseEntity<Movie> createMovie(@RequestBody MovieRequestDto dto ) {
		return new ResponseEntity<Movie>(movieService.createMovie(dto), HttpStatus.OK) ;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public ResponseEntity getMovieList(@PathVariable("id") Integer id){
		movieService.deleteMovie(id);
		return new ResponseEntity(HttpStatus.OK);
	}

}
