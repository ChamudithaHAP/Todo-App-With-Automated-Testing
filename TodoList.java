import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoItem> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(new TodoItem(taskName));
    }

    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getTaskName().equals(taskName));
    }

    public void displayTasks() {
        for (TodoItem task : tasks) {
            System.out.println(task);
        }
    }
}
