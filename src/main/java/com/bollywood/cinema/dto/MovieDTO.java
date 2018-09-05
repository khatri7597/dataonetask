package com.bollywood.cinema.dto;

import java.io.Serializable;
import java.util.Date;

public class MovieDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String coverImageUrl;
	private Date releaseDate;
	private String genre;
	
}
