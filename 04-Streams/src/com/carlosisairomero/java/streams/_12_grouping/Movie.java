package com.carlosisairomero.java.streams._12_grouping;

public class Movie {

	private String name;
	private Integer likes;
	private Genre genre;
	
	public Movie() {
		super();
	}

	public Movie(String name, Integer likes, Genre genre) {
		super();
		this.name = name;
		this.likes = likes;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [name=");
		builder.append(name);
		builder.append(", likes=");
		builder.append(likes);
		builder.append(", genre=");
		builder.append(genre);
		builder.append("]");
		return builder.toString();
	}

}
