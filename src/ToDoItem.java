/**
 * Created by magnusfinvik on 17.09.2015.
 */
public class ToDoItem implements Comparable<ToDoItem>{
    private String taskDescription;
    private String title;
    private int priority;
    private int defaultPriority = 3;
    public ToDoItem(String title, String task){
        this.taskDescription = task;
        this.title = title;
        this.priority = defaultPriority;
    }

    public ToDoItem(String title, String task, int priority){
        this.taskDescription = task;
        this.title = title;
        this.priority = priority;
    }

    public String getTaskDescription(){
        return taskDescription;
    }


    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(ToDoItem toDoItem) {

        if(this.priority > toDoItem.getPriority()){
            return 1;
        }
        else if(this.priority == toDoItem.getPriority()){
            return 0;
        }
        else
        return -1;
    }
}