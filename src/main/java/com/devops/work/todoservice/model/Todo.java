package com.devops.work.todoservice.model;

import java.util.Date;

public class Todo {

	private Long id;
	private String todoname;
	private String description;
	private boolean isCompleted;
	private Date startDate;
	private Date endDate;
	
	public Todo() {
		
	}

	public Todo(Long id, String todoname, String description, boolean isCompleted, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.todoname = todoname;
		this.description = description;
		this.isCompleted = isCompleted;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getTodoname() {
		return todoname;
	}

	public void setTodoname(String todoname) {
		this.todoname = todoname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
