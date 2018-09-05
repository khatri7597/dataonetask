package com.bollywood.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bollywood.cinema.model.Director;

@Repository
public interface DirectorDaoImpl extends JpaRepository<Director, Integer>{

	@Query("select a from Director a where a.id = :id")
	Director findDirectorById(@Param("id") Integer id);
		
}

