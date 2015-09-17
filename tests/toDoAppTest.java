import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class toDoAppTest {
    toDoApp app;
    ToDoItem item1;
    ToDoItem item2;
    ToDoItem item3;
    List<ToDoItem> taskList;

    @Before
    public void setUp() {
        app = new toDoApp();
        item1 = new ToDoItem("one", "shop");
        item2 = new ToDoItem("two", "wash car");
        item3 = new ToDoItem("three", "kill president");
        taskList = new ArrayList<>();
    }

    @Test
    public void add_addAnItemIntoAArrayList() {
        app.add(new ToDoItem("not null", "wasssssup"));
        assertNotNull(app);
    }

    @Test
    public void add_addTwoItems(){
        app.add(item1);
        app.add(item2);
        assertEquals(2, app.getSize());
    }

    @Test
    public void remove_removeOneItem(){
        app.add(item1);
        app.add(item2);
        app.remove(item2);
        assertEquals(1, app.getSize());
    }

    @Test
    public void remove_removeItemInTheMiddle(){
        app.add(item1);
        app.add(item2);
        app.add(item3);
        app.remove(item2);
        assertTrue(app.getTasks().get(1).equals(item3));
    }

    @Test
    public void remove_removeItem(){
        app.add(item1);
        app.add(item2);
        app.add(item3);
        app.remove(item3);
        assertFalse(app.getTasks().contains(item3));
    }

    @Test
    public void addFromTaskList_addAtleast100000Items() {
        taskList.add(item1);
        app.addFromTaskList(taskList.get(0));
        assertEquals(100000, app.getSize());
    }

    @Test
    public void removeSpecificItem_removeTaskThree(){
        app.add(item1);
        app.add(item2);
        app.add(item3);
        app.add(new ToDoItem("four", "go to schooool, or be coool"));
        app.removeSpecific(item3.getTitle());
        assertFalse(app.getTasks().contains(item3));
    }

    @Test
    public void givePriority_item2PriorityOne() {
        app.add(item1);
        app.add(item2);
        app.add(item3);
        app.setPriority(item2, 1);
        assertEquals(1, app.getPriority(item2));
    }

    @Test
    public void checkDeafaultPriority(){
        app.add(item1);
        assertEquals(3, app.getPriority(item1));
    }

    @Test
    public void sortItems_sortItemsListBasedOnPriority_ascending(){
        app.add(item1);
        app.setPriority(item1, 2);
        app.add(item2);
        app.add(item3);
        app.setPriority(item3, 1);
        app.sortAscending();
        assertEquals(item3, app.getTasks().getFirst());
    }

    @Test
    public void sortItems_sortItemsListBasedOnPriority_descending(){
        app.add(item1);
        app.setPriority(item1, 2);
        app.add(item2);
        app.add(item3);
        app.setPriority(item3, 1);
        app.sortDescending();
        assertEquals(item2, app.getTasks().getFirst());
    }
}