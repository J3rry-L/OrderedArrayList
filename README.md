# OrderedArrayList

Breakout Group 1

In our group, we first talked about the requirements of the assignment. The first thing that was brought up was whether or not we needed instance variables for the NoNullArrayList class. We decided that it did not and would rather just use the constructors in the ArrayList superclass that were inherited. A small question came up about how to name the file, whether or not to include the <T> in the name of the file. It should not be included.

We looked up JavaDocs to see how the SuperArray class constructors worked, and then used it as an example for our NoNullArrayList.

  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

Then we discussed whether it should be add/set public and we said yes. One other small thing that came up was the JavaDocs used E and we used T, and we said to use T instead of E.

By the end of class, we finished the NoNullArrayList class, but did not start yet on OrderedArrayList.
