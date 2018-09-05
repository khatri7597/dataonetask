package com.bollywood.cinema.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bollywood.cinema.dto.ActorDTO;
import com.bollywood.cinema.service.ActorService;

@CrossOrigin
@RestController
@RequestMapping("/actor/")
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public ActorDTO createActor(@Valid @RequestBody ActorDTO actorDto) {
		return actorService.createActor(actorDto);
	}
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ResponseEntity<List<ActorDTO>> actorsList(){
		return new ResponseEntity<List<ActorDTO>>(actorService.getActorList(), HttpStatus.OK);
	}
}
