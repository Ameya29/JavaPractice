public class Methods {

  public void myAddition(int num1,double num2)
  {
      System.out.printf("Result Of Addition: %.2f",num1+num2);
  }

  public int myMultiply(int n1,int n2)
  {
      int n3 = n1*n2;
      return n3;
  }

  public static void main(String args[])
  {
      Methods m1 = new Methods();
      m1.myAddition(3,988);

      int product = m1.myMultiply(69,420);
      System.out.println("\nProduct: "+product);
  }
}