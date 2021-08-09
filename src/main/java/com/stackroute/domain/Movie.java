package com.stackroute.domain;

public class Movie {
	private String name;
	private String genre;
	private Actor actor;
	private int releaseYear;
	
	public Movie(String name, String genre, Actor actor, int releaseYear) {
		super();
		this.name = name;
		this.genre = genre;
		this.actor = actor;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", actor=" + actor + ", releaseYear=" + releaseYear + "]";
	}
	
	
}
