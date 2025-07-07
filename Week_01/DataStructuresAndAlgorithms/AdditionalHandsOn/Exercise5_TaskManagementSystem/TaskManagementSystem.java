class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

class TaskList {
    Task head;
    
    //add
    void add(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newTask;
    }

    // Search for a task by ID
    Task search(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // delete
    void delete(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task prev = head;
        while (prev.next != null) {
            if (prev.next.taskId == id) {
                prev.next = prev.next.next;
                return;
            }
            prev = prev.next;
        }
    }

    // display
    void showAll() {
        Task current = head;
        System.out.println("All Tasks:");
        while (current != null) {
            System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Status: " + current.status);
            current = current.next;
        }
    }
}

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.add(1, "Design DB", "Pending");
        taskList.add(2, "Frontend", "In Progress");
        taskList.add(3, "Backend", "Pending");

        // Show all tasks
        taskList.showAll();

        // Search
        System.out.println("\nSearching for Task ID 2:");
        Task result = taskList.search(2);
        if (result != null) {
            System.out.println("Found: " + result.taskName + " status: " + result.status);
        } else {
            System.out.println("Task not found");
        }

        // Delete a task
        System.out.println("\nDeleting Task ID 1...");
        taskList.delete(1);

        // Show updated list
        taskList.showAll();
    }
}