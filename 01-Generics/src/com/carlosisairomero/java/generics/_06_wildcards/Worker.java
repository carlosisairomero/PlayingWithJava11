package com.carlosisairomero.java.generics._06_wildcards;

public class Worker extends Person {

	private String job;

	public Worker() {
		super();
	}

	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Worker [job=");
		builder.append(job);
		builder.append("]");
		return builder.toString();
	}
	
}
