package com.devops.work.todoservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devops.work.todoservice.TodoService;
import com.devops.work.todoservice.model.Todo;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodo(){
		return todoService.getAllTodo();
	}
	@GetMapping(value="/todo/id/{id}")
	public Todo getMethodName(@PathVariable Long id) {
		System.out.println("Id-> "+id);
		return todoService.getTodo(id);
	}
	
	
	@PostMapping("/todo")
	public Todo saveTodo(@RequestBody Todo todo) {
		
		Todo todo1 = todoService.save(todo);
		return todo1;
	}
	
	@PutMapping("/todo")
	public Todo updateTodo(@RequestBody Todo todo) {
		
		Todo todo1 = todoService.update(todo);
		return todo1;
	}
}
