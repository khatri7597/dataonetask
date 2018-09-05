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

import com.bollywood.cinema.dto.DirectorDTO;
import com.bollywood.cinema.service.DirectorService;

@CrossOrigin
@RestController
@RequestMapping("/director/")
public class DirectorController {

	@Autowired
	private DirectorService directorService;
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public DirectorDTO createActor(@Valid @RequestBody DirectorDTO directorDto) {
		return directorService.createDirector(directorDto);
	}	
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ResponseEntity<List<DirectorDTO>> actorsList(){
		return new ResponseEntity<List<DirectorDTO>>(directorService.getDirectorList(), HttpStatus.OK);
	}
	
}
