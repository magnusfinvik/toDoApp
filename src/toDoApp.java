
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


/**
 * Created by magnusfinvik on 17.09.2015.
 */
public class toDoApp {

    LinkedList<ToDoItem> toDoList = new LinkedList();

    public void add(ToDoItem inputTask) {

        toDoList.add(inputTask);
    }

    public int getSize() {

        return toDoList.size();
    }

    public void remove(ToDoItem removeInput) {

        int index = toDoList.indexOf(removeInput);
        toDoList.remove(index);
    }

    public LinkedList getTasks() {

        return toDoList;
    }

    public void addFromTaskList(ToDoItem inputItem) {
        while(getSize()!= 100000){
            toDoList.add(inputItem);
        }
    }

    public void removeSpecific(String title) {
        for(int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i).getTitle().equals(title)){
                toDoList.remove(i);
            }
        }
    }

    public void setPriority(ToDoItem item, int priority) {
        int index = toDoList.indexOf(item);
        toDoList.get(index).setPriority(priority);
    }

    public int getPriority(ToDoItem item) {
        return item.getPriority();
    }

    public void sortAscending() {

            Collections.sort(toDoList);
    }

    public void sortDescending() {

            Collections.sort(toDoList);
            Collections.reverse(toDoList);
    }
}