package com.ToDo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ToDo.Entity.ToDoEntity;
import com.ToDo.Service.ToDoService;

@RestController
@CrossOrigin
public class ToDoController {

	@Autowired
	private ToDoService toDoService;

	@CrossOrigin
	@PostMapping("/addTodo")
	public ToDoEntity addTodo(@RequestBody ToDoEntity toDoEntity) {
		return toDoService.saveToDO(toDoEntity);
	}

	@GetMapping("/findAllTodos")
	public List<ToDoEntity> FindAllTodos(ToDoEntity toDoEntity) {
		return toDoService.getAllTodos();
	}

	@GetMapping("/findTodosBy/{id}")
	public ToDoEntity findProductById(@PathVariable int id) {
		return toDoService.getAllTodosByID(id);
	}

	@PutMapping("/updateTodo")
	public ToDoEntity updateToDo(@RequestBody ToDoEntity toDoEntity) {
		return toDoService.updateTodo(toDoEntity);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTodo(@PathVariable int id) {
		return toDoService.deleteById(id);
	}
}
