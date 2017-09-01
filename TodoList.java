import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

  private Scanner input = new Scanner(System.in);
  private ArrayList <TodoItem> todoList;

  public TodoList(){
    todoList = new ArrayList<TodoItem>();
  }

  public ArrayList<TodoItem> getTodoList(){
    return todoList;
  }


  public void listItems(){
    Integer counter = 1;
    String status;

    for(TodoItem item : todoList){
      status = (item.getIsDone()) ? " [X]" : " [ ]";

      System.out.println(counter + ") " + status + " " + item.getName());
      counter++;
    }
  }

  public void addItem(TodoItem item){
    todoList.add(item);
  }

  public void archiveDone(){
    Iterator<TodoItem> iter = todoList.iterator();
    while (iter.hasNext()) {
      TodoItem item = iter.next();
      if(item.getIsDone()){
        todoList.remove(item);
      }
    }
  }

}
