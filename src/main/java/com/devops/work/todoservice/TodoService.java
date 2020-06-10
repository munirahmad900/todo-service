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
		
		Todo todo = new Todo("Learning Kubernetes","DevOps learning track", false, new Date(), new Date());
		Todo todo1 = new Todo("Learning Jenkins","DevOps learning track", false, new Date(), new Date());
		Todo todo2 = new Todo("Learning Docker","DevOps learning track", false, new Date(), new Date());
		todoList.add(todo);
		todoList.add(todo1);
		todoList.add(todo2);
	}
	
	public List<Todo> getAllTodo(){
		
		return todoList;
	}
}
