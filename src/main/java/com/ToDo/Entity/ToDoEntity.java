package com.ToDo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ToDos")
public class ToDoEntity {

	@Id
	@GeneratedValue
	private int id;
	private String toDoTitle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToDoTitle() {
		return toDoTitle;
	}

	public void setToDoTitle(String toDoTitle) {
		this.toDoTitle = toDoTitle;
	}

}
