public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Add a task to the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by taskId
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse the list and print tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by taskId
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();
        taskList.addTask(new Task(1, "Design database schema", "Pending"));
        taskList.addTask(new Task(2, "Implement authentication", "In Progress"));
        taskList.addTask(new Task(3, "Develop UI", "Completed"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task foundTask = taskList.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 1:");
        taskList.deleteTask(1);
        System.out.println("All Tasks after deletion:");
        taskList.traverseTasks();
    }
}
