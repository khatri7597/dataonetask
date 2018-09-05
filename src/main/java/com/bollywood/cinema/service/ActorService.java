package com.bollywood.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bollywood.cinema.dao.ActorDaoImpl;
import com.bollywood.cinema.dto.ActorDTO;
import com.bollywood.cinema.model.Actor;

@Service
public class ActorService {

	@Autowired
	private ActorDaoImpl actorDaoImpl;
	
	public ActorDTO createActor(ActorDTO actorDTO) {
		try {
			Actor actor = new Actor();
			actor = toEntity(actorDTO, actor);
			actor = actorDaoImpl.saveAndFlush(actor);
			return toDTO(actor, new ActorDTO());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Actor toEntity(ActorDTO actorDTO, Actor actor) {
		actor.setId(actorDTO.getId());
		actor.setName(actorDTO.getName());
		return actor;
	}
	
	public ActorDTO toDTO(Actor actor, ActorDTO actorDTO) {
		actorDTO.setId(actor.getId());
		actorDTO.setName(actor.getName());
		actorDTO.setCreatedDate(actor.getCreatedDate());
		actorDTO.setUpdatedDate(actor.getUpdatedDate());
		return actorDTO;
	}

	public Actor findById(Integer id) {
		try {
			return actorDaoImpl.findActorById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<ActorDTO> getActorList() {
		final List<ActorDTO> actorDTOs = new ArrayList<>();
		List<Actor> actors = new ArrayList<>();
		try {
			actors = actorDaoImpl.findAll();
			if(actors != null && !actors.isEmpty()) {
				actors.forEach(act -> {
					if(act!=null) {
						actorDTOs.add(toDTO(act, new ActorDTO()));	
					}
				});
			}
		}catch(Exception e) {
			return new ArrayList<>();
		}
		return actorDTOs;
	}
}
