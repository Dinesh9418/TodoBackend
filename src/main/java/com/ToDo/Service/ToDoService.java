package com.ToDo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDo.Entity.ToDoEntity;
import com.ToDo.Repo.ToDoRepo;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepo toDoRepo;

	public ToDoEntity saveToDO(ToDoEntity toDoEntity) {
		System.out.print("Saved...");
		return toDoRepo.save(toDoEntity);
	}

	public List<ToDoEntity> listTodos(List<ToDoEntity> toDoEntities) {
		return toDoRepo.saveAll(toDoEntities);
	}

	public List<ToDoEntity> getAllTodos() {
		return toDoRepo.findAll();
	}

	public ToDoEntity getAllTodosByID(int id) {
		return toDoRepo.findById(id).orElse(null);
	}

	public String deleteById(int id) {
		toDoRepo.deleteById(id);
		return " Product delete successfully...! " + id;
	}

	public ToDoEntity updateTodo(ToDoEntity toDoEntity) {
		ToDoEntity existingProduct = toDoRepo.findById(toDoEntity.getId()).orElse(null);
		existingProduct.setToDoTitle(toDoEntity.getToDoTitle());
		return toDoRepo.save(existingProduct);
	}

}
