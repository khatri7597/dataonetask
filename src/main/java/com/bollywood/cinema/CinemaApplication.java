package com.bollywood.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}
	
	/*@Bean
    CommandLineRunner init (MovieService movieService){
		MovieRequestDto dto1 = new MovieRequestDto();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);list1.add(2);
		dto1.setMovieName("Test Movie1");
		dto1.setCoverImageUrl("https://www.baeldung.com/");
		dto1.setGenre("test");
		dto1.setReleaseDate(new Date());
		dto1.setDirector(1);
		dto1.setActors(list1);
		movieService.createMovie(dto1);
		
		MovieRequestDto dto2 = new MovieRequestDto();
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);list2.add(2);
		dto2.setMovieName("Test Movie2");
		dto2.setCoverImageUrl("https://www.baeldung.com/");
		dto2.setGenre("test");
		dto2.setReleaseDate(new Date());
		dto2.setDirector(2);
		dto2.setActors(list2);
		movieService.createMovie(dto2);
		
		MovieRequestDto dto3 = new MovieRequestDto();
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);list3.add(2);
		dto3.setCoverImageUrl("https://www.baeldung.com/");
		dto3.setGenre("test");
		dto3.setReleaseDate(new Date());
		dto3.setDirector(3);
		dto3.setActors(list3);
		movieService.createMovie(dto3);

		MovieRequestDto dto4 = new MovieRequestDto();
		List<Integer> list4 = new ArrayList<>();
		list4.add(1);list4.add(2);
		dto4.setMovieName("Test Movie4");
		dto4.setCoverImageUrl("https://www.baeldung.com/");
		dto4.setGenre("test");
		dto4.setReleaseDate(new Date());
		dto4.setDirector(4);
		dto4.setActors(list4);
		movieService.createMovie(dto4);
		
		MovieRequestDto dto5 = new MovieRequestDto();
		List<Integer> list5 = new ArrayList<>();
		list5.add(1);list5.add(2);
		dto5.setMovieName("Test Movie5");
		dto5.setCoverImageUrl("https://www.baeldung.com/");
		dto5.setGenre("test");
		dto5.setReleaseDate(new Date());
		dto5.setDirector(5);
		dto5.setActors(list5);
		movieService.createMovie(dto5);
		return null;
    }
	*/

	
}
