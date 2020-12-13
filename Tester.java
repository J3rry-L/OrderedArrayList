public class Tester{
  public static void main(String[] args){
    NoNullArrayList<String> expectNullError = new NoNullArrayList<String>();
    expectNullError.add("bob");
    System.out.println(expectNullError);
    try{
      expectNullError.add(null);
    }
    catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException");
    }
    NoNullArrayList<Integer> numbers = new NoNullArrayList<Integer>();
    System.out.println(numbers.add((Integer) 111));
    System.out.println(numbers);
    System.out.println(numbers.add((Integer) 11));
    System.out.println(numbers);
    System.out.println(numbers.add((Integer) 1111));
    System.out.println(numbers);
    numbers.add(2, (Integer) 111);
    System.out.println(numbers);
    System.out.println(numbers.set(0, (Integer) 1));
    System.out.println(numbers);

    OrderedArrayList<Integer> A = new OrderedArrayList<Integer>();
    A.add(12, (Integer)90);
    System.out.println(A);
    System.out.println(A.add((Integer)100));
    System.out.println(A);
    System.out.println(A.add((Integer)101));
    System.out.println(A);
    System.out.println(A.set(2, (Integer) 85));
    System.out.println(A);
    OrderedArrayList<String> B = new OrderedArrayList<String>();
    System.out.println(B.add("apple"));
    System.out.println(B);
    B.add(35, "banana");
    System.out.println(B);
    System.out.println(B.add("cantaloupe"));
    System.out.println(B);
    System.out.println(B.add("fig"));
    System.out.println(B);
    System.out.println(B.add("elderberry"));
    System.out.println(B);
    System.out.println(B.add("dates"));
    System.out.println(B);
    System.out.println(B.set(1, "zebra"));
    System.out.println(B);
    try{
      B.set(1, null);
    }
    catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException");
    }
  }
}
