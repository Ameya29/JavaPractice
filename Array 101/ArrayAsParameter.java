public class ArrayAsParameter {
    public static void showArray(int a[])
    {
        for(int x: a)
            {
                System.out.println("Array Element: "+x);
            }
    }
  public static void main(String args[])
  {
      int arr[] = new int[]{10,20,30,40,50};
      showArray(arr);
  }
}