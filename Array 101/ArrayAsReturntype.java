public class ArrayAsReturntype {

  public static int[] returnsArray()   //Returntype As Integer Array
  {
      int arr[] = new int[]{1,11,12,13,14,15};
      return arr;
  }

  public static void main(String args[])
  {
    int result[] = returnsArray();
    System.out.print("Array Elements Are: \n");
      for(int x : result)
          {
              System.out.println(x);
          }
  }
}