package com.bollywood.cinema.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bollywood.cinema.dao.DirectorDaoImpl;
import com.bollywood.cinema.dto.DirectorDTO;
import com.bollywood.cinema.model.Director;

@Service
public class DirectorService {

	@Autowired
	private DirectorDaoImpl daoImpl;
	
	public DirectorDTO createDirector(DirectorDTO directorDTO) {
		Director director = new Director();
		director = toEntity(directorDTO, director);
		director = daoImpl.saveAndFlush(director);
		return toDTO(director, new DirectorDTO());
	}
	
	public Director toEntity(DirectorDTO directorDTO, Director director) {
		director.setId(directorDTO.getId());
		director.setName(directorDTO.getName());
		return director;
	}
	
	public DirectorDTO toDTO(Director director, DirectorDTO directorDTO) {
		directorDTO.setId(director.getId());
		directorDTO.setName(director.getName());
		return directorDTO;
	}

	public Director findById(Integer id) {
		
		return daoImpl.findDirectorById(id);
	}

	public List<DirectorDTO> getDirectorList() {
		final List<DirectorDTO> directorDTOs = new ArrayList<>();
		List<Director> directors = new ArrayList<>();
		try {
			directors = daoImpl.findAll();
			if(directors != null && !directors.isEmpty()) {
				directors.forEach(act -> {
					if(act!=null) {
						directorDTOs.add(toDTO(act, new DirectorDTO()));	
					}
				});
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
			return new ArrayList<>();
		}
		return directorDTOs;
	}
	
}
