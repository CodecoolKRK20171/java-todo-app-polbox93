import java.util.*;
/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

  private String name;
  private String isDone;

  public TodoItem(String name){
    this.name = name;
    this.isDone = "Undone";
  }

  public void mark(){
    this.isDone = "Done";
  }


  public String getName(){
    return this.name;
  }

  public String getIsDone(){
    return this.isDone;
  }

}
