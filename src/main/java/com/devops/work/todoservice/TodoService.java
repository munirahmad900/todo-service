package com.devops.work.todoservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devops.work.todoservice.model.Todo;

@Service
public class TodoService {

	public static List<Todo> todoList= new ArrayList<>();
	
	public TodoService() {
		
		Todo todo = new Todo(1L,"Learning Kubernetes","DevOps learning track", false, new Date(), new Date());
		Todo todo1 = new Todo(2L,"Learning Jenkins","DevOps learning track", false, new Date(), new Date());
		Todo todo2 = new Todo(3L,"Learning Docker","DevOps learning track", false, new Date(), new Date());
		todoList.add(todo);
		todoList.add(todo1);
		todoList.add(todo2);
	}
	
	public List<Todo> getAllTodo(){
		
		return todoList;
	}

	public Todo getTodo(Long id){

		for(Todo todo: todoList){
			if(todo.getId() == id){
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		
		todoList.add(todo);
		return todo;
	}

	public Todo update(Todo todo) {
		for(Todo t: todoList) {
			if(t.getId() == todo.getId()) {
				todoList.remove(todo);
				todoList.add(todo);
				break;
			}
			
		}
		return todo;
	}
}
