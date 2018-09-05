package com.bollywood.cinema.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bollywood.cinema.model.Movie;

public interface MoviePaginationRepository extends PagingAndSortingRepository<Movie, Integer> {

}
