package Task_Management_System;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Implement Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Not Started"));

        System.out.println("All Tasks:");
        manager.showAllTasks();

        System.out.println("\nSearching for Task ID 2:");
        System.out.println(manager.searchTask(2));

        System.out.println("\nDeleting Task ID 1...");
        manager.deleteTask(1);

        System.out.println("\nTasks After Deletion:");
        manager.showAllTasks();
    }
}

