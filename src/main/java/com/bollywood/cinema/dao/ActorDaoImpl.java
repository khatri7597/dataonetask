package com.bollywood.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bollywood.cinema.model.Actor;

@Repository
public interface ActorDaoImpl extends JpaRepository<Actor, Integer> {

	@Query("select a from Actor a where a.id = :id")
	Actor findActorById(@Param("id") Integer id);
	
}
