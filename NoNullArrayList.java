import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("null is not valid element");
    }
    else{
      return(super.set(index, element));
    }
  }
}
