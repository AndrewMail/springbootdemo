package com.data.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String name;

	public User() {
		super();
	}

	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
