package com.bollywood.cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bollywood.cinema.dto.ActorDTO;
import com.bollywood.cinema.dto.DirectorDTO;
import com.bollywood.cinema.dto.MovieRequestDto;
import com.bollywood.cinema.service.ActorService;
import com.bollywood.cinema.service.DirectorService;
import com.bollywood.cinema.service.MovieService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CinemaApplicationTests {

	@Autowired
	private MovieService movieService;
	@Autowired
	private ActorService actorService;
	@Autowired
	private DirectorService directorService;
	
	@Test
	public void Test() {
		System.out.println("start here");
		try {
			ActorDTO actorDTO1 = new ActorDTO();
			actorDTO1.setName("actor1");
			ActorDTO actorDTO2 = new ActorDTO();
			actorDTO2.setName("actor2");
			ActorDTO actorDTO3 = new ActorDTO();
			actorDTO3.setName("actor3");
			ActorDTO actorDTO4 = new ActorDTO();
			actorDTO4.setName("actor4");
			ActorDTO actorDTO5 = new ActorDTO();
			actorDTO5.setName("actor5");
			actorService.createActor(actorDTO1);
			actorService.createActor(actorDTO1);
			actorService.createActor(actorDTO1);
			actorService.createActor(actorDTO1);
			actorService.createActor(actorDTO1);
			
			DirectorDTO directorDTO1 = new DirectorDTO();
			directorDTO1.setName("director1");
			DirectorDTO directorDTO2 = new DirectorDTO();
			directorDTO2.setName("director2");
			DirectorDTO directorDTO3 = new DirectorDTO();
			directorDTO3.setName("director3");
			DirectorDTO directorDTO4 = new DirectorDTO();
			directorDTO4.setName("director4");
			DirectorDTO directorDTO5 = new DirectorDTO();
			directorDTO5.setName("director5");
			
			directorService.createDirector(directorDTO1);
			directorService.createDirector(directorDTO2);
			directorService.createDirector(directorDTO3);
			directorService.createDirector(directorDTO4);
			directorService.createDirector(directorDTO5);
			
			
			Thread.sleep(5000);
			
			MovieRequestDto dto1 = new MovieRequestDto();
			dto1.setMovieName("test movie1");
			dto1.setCoverImageUrl("test");
			dto1.setReleaseDate(new Date());
			dto1.setGenre("romantic");
			Integer values1[] = {1,2};
			dto1.setActors(new ArrayList<>(Arrays.asList(values1)));
			dto1.setDirector(1);
			
			MovieRequestDto dto2 = new MovieRequestDto();
			dto2.setMovieName("test movie1");
			dto2.setCoverImageUrl("test");
			dto2.setReleaseDate(new Date());
			dto2.setGenre("romantic");
			Integer values2[] = {2,3};
			dto2.setActors(new ArrayList<>(Arrays.asList(values2)));
			dto2.setDirector(2);
			
			MovieRequestDto dto3 = new MovieRequestDto();
			dto3.setMovieName("test movie1");
			dto3.setCoverImageUrl("test");
			dto3.setReleaseDate(new Date());
			dto3.setGenre("romantic");
			Integer values3[] = {3,4};
			dto3.setActors(new ArrayList<>(Arrays.asList(values3)));
			dto3.setDirector(3);
			
			movieService.createMovie(dto1);
			movieService.createMovie(dto2);
			movieService.createMovie(dto3);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end here");

	}
	
	
	@Test
	public void contextLoads() {
	}

}
