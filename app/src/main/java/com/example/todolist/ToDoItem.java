package com.example.todolist;

public class ToDoItem {

    private String description;
    private boolean isComplete;
    private long id;

    public ToDoItem(String description, boolean isComplete) {
        this(description, isComplete, -1);
    }

    public ToDoItem(String description, boolean isComplete, long id) {

        this.description = description;
        this.isComplete = isComplete;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void toggleComplete() {
        isComplete = !isComplete;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
