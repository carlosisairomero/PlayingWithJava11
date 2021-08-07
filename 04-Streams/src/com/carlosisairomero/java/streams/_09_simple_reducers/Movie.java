package com.carlosisairomero.java.streams._09_simple_reducers;

public class Movie {

	private String name;
	private Integer likes;
	
	public Movie() {
		super();
	}

	public Movie(String name, Integer likes) {
		super();
		this.name = name;
		this.likes = likes;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [name=");
		builder.append(name);
		builder.append(", likes=");
		builder.append(likes);
		builder.append("]");
		return builder.toString();
	}
	
}
