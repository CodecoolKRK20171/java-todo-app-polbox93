import java.util.*;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {

    boolean programIsOn = true;
    TodoList todoList = new TodoList();


    while (programIsOn){
      System.out.println("Please specify a command [list, add, mark, archive]: ");
      String input = takeInput();

      if (input.equals("list")){
        todoList.listItems();
      }

      else if(input.equals("add")){
        // Scanner scan = new Scanner(System.in);
        System.out.println("Add item: ");
        String itemName = takeInput();

        TodoItem item = new TodoItem(itemName);

        todoList.addItem(item);
      }

      // else if (input.equals("mark")){
      //   todoList.listItems();
      //   System.out.println("Choose item to mark as done");
      //   Integer index = Integer.parseInt(takeInput());
      //   todoList.markItem(index);
      // }

    }

  }

  public static String takeInput(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    return input;
  }
}
