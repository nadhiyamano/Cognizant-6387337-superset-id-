package Task_Management_System;

public class TaskManager {
    Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public Task searchTask(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == id)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    public void showAllTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.taskId == id) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node curr = head;
        while (curr != null && curr.task.taskId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
    }
}

