package com.bollywood.cinema.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bollywood.cinema.model.Movie;

@Repository
public interface MovieDaoImpl extends JpaRepository<Movie, Integer> {

	@Query("select a from Movie a where a.id = :id")
	Movie findByMovieId(@Param("id") Integer id);

	 @Transactional
	 @Modifying
	@Query("delete from Movie a where a.id = :id")
	void deleteByMovieId(@Param("id") Integer id);
	
	/*@PersistenceContext
	private EntityManager entityManager;
		
	public Movie create(Movie movie) {
		entityManager.persist(movie);
		return movie;
	}*/
	
	
	

}
