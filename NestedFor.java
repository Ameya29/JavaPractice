public class NestedFor {
  public static void main(String args[])
  {
      for(int i=1; i<=10; i++)
          {
              for(int j=1; j<=5; j++)
                  {
                      System.out.println("Value Of j = "+j+" When i = "+i);
                  }
          }
      System.out.println("All Iterations Ended!");
  }
}