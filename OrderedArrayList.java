public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  private int findIndex(T element){
    int index = 0;
    while(element.compareTo(get(index + 1)) > 0){
      index++;
    }
    return index;
  }
  public boolean add(T element){
    return false;
  }
}
