package com.carlosisairomero.java.streams._04_filtering;

public class Movie {

	private String name;
	private int likes;
	
	public Movie() {
		super();
	}

	public Movie(String name, int likes) {
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
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
