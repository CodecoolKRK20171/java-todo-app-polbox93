import java.util.*;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    TodoList todoList = new TodoList();


    do {
      System.out.println("\n0) exit\n1) dsiplay list\n2) add item\n3) mark item\n4) archive done");
      System.out.println("Please specify a command [list, add, mark, archive]: ");
      String input = takeInput();

      if (input.equals("1")){
        todoList.listItems();
      }

      else if(input.equals("2")){
        System.out.println("Add item: ");
        String itemName = takeInput();

        TodoItem item = new TodoItem(itemName);

        todoList.addItem(item);
      }

      else if (input.equals("3")){
        todoList.listItems();
        System.out.println("Choose item to mark as done");
        try{
          Integer index = Integer.parseInt(takeInput())-1;
          todoList.getTodoList().get(index).mark();
        } catch (IndexOutOfBoundsException e){
          System.out.println("No such record");
        }
      }

      else if (input.equals("4")){
        todoList.archiveDone();

      }
    } while (!input.equals("0"));

    input.close();
  }

  public static String takeInput(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    return input;
  }

}
