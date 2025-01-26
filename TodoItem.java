public class TodoItem {
    private String taskName;
    private boolean isCompleted;

    public TodoItem(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public void markAsNotCompleted() {
        isCompleted = false;
    }

    @Override
    public String toString() {
        return taskName + (isCompleted ? " (Completed)" : " (Not Completed)");
    }
}
