
import java.util.*;


/**
 * Created by magnusfinvik on 17.09.2015.
 */
public class toDoApp {

    private Map<String,ToDoItem> toDoList = new TreeMap<>();

    public void add(ToDoItem inputTask) {

        toDoList.put(inputTask.getTitle(), inputTask);
    }

    public int getSize() {

        return toDoList.size();
    }

    public void remove(String key) {
        toDoList.remove(key);
    }

    public Map getTasks() {

        return toDoList;
    }

    public void setPriority(String key, int priority) {
        toDoList.get(key).setPriority(priority);
    }

    public int getPriority(String key) {
        return toDoList.get(key).getPriority();
    }

    public List sortAscending() {
        List list = new LinkedList(toDoList.values());
        Collections.sort(list);
        return list;
    }

    public List sortDescending() {
        List list = new LinkedList(toDoList.values());
        Collections.sort(list);
        Collections.reverse(list);
        return  list;
    }

    public void add(List<ToDoItem> taskList) {
        for(ToDoItem item: taskList){
            toDoList.put(item.getTitle(), item);
        }
    }
}