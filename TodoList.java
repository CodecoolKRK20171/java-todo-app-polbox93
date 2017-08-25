import java.util.*;
/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

  private ArrayList <TodoItem> todoList = new ArrayList <>();

  public TodoList(){
    this.todoList = todoList;
  }

  public void listItems(){
    Integer counter = 1;
    String status;
    for(TodoItem item : this.todoList){
      if (item.getIsDone().equals("Undone")){
        status = "[ ]";
      }
      else{
        status = "[X]";
      }
      System.out.println(counter + ". " + " " + status +" " + item.getName());
      counter +=1;
    }
  }

  public void addItem(TodoItem item){
    this.todoList.add(item);
  }

  // public void markItem(Integer input){
  //   for(int i = 0; i < this.todoList.size(); i++){
  //     todoList.get(i+1).mark();
  //   }
  // }

}
