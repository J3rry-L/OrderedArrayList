public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  private int findIndex(T element){
    if (element == null){
      throw new IllegalArgumentException("null is not valid element");
    }
    int index = 0;
    while(index < size() && element.compareTo(get(index)) > 0){
      index++;
    }
    return index;
  }
  public boolean add(T element){
    super.add(findIndex(element), element);
    return true;
  }
  public void add(int index, T element){
    super.add(findIndex(element), element);
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("null is not valid element");
    }
    T temp = super.get(index);
    super.remove(index);
    add(element);
    return(temp);
  }
}
