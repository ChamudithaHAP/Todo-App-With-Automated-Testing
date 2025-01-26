import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {

    @Test
    public void testAddTask() {
        TodoList list = new TodoList();
        list.addTask("Finish homework");
        assertEquals(1, list.tasks.size());
    }

    @Test
    public void testRemoveTask() {
        TodoList list = new TodoList();
        list.addTask("Finish homework");
        list.removeTask("Finish homework");
        assertEquals(0, list.tasks.size());
    }
}
