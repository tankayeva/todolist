package com.developer.ToDoList.models;

import javax.persistence.*;

@Entity
@Table(name = "apptasks")
public class AppTasks {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "title")
    public String title;

    @Column(name = "priority")
    public String priority;
    @Column(name = "status")
    public String status;

    public AppTasks() {
    }

    public AppTasks(String title, String priority,String status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
