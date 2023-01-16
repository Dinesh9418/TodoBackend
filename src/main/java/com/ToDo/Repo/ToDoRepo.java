package com.ToDo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ToDo.Entity.ToDoEntity;

public interface ToDoRepo extends JpaRepository<ToDoEntity, Integer> {

}
