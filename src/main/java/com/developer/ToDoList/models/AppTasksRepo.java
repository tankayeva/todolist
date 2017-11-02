package com.developer.ToDoList.models;

import org.springframework.data.repository.CrudRepository;

public interface AppTasksRepo extends CrudRepository<AppTasks,Integer> {
}