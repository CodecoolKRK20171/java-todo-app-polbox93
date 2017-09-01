import java.util.*;
/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

  private String name;
  private boolean isDone = false;

  public TodoItem(String name){
    this.name = name;
  }


  public String getName(){
    return name;
  }

  public boolean getIsDone(){
    return isDone;
  }


  public void mark(){
    isDone = true;
  }

  public void unmark(){
    isDone = false;
  }



}
