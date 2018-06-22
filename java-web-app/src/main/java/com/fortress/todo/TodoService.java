package com.fortress.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Web Application Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn HTML 5 and CSS3"));
		todos.add(new Todo("Learn Database Design"));
	}

	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todoname) {
		todos.add(todoname);
	}
	
	public void deleteTodo(Todo todoname) {
		todos.remove(todoname);
	}
}
