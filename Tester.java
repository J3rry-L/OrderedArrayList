public class Tester{
  public static void main(String[] args){
    NoNullArrayList expectNullError = new NoNullArrayList();
    expectNullError.add("bob");
    System.out.println(expectNullError);
    try{
      expectNullError.add(null);
    }
    catch(IllegalArgumentException e){
          System.out.println("IllegalArgumentException");
    }
  }
}
