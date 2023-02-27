public class ThisKeyword {

  int num1;
  int num2;
  double result;
  //This Below Function Works Fine Because Of No Variable Name Clash
//  public ThisKeyword(int n1, int n2)
//  {
//      num1 = n1;
//      num2 = n2;
//      result = num1+num2;
//      System.out.printf("\nAddition Of 2 Nos. Is %g",result);
//  }

    //Below Function Now Has Arguments With Same Name As Instance Variables
    public ThisKeyword(int num1, int num2)
    {
        this.num1 = num1;  //LHS Refers To Instance Variable & RHS = Local Variable To Assign Value In Case Of Same Var Name
        this.num2 = num2; //In Case Of Different Local Var Name No Need Of This "this" Keyword
        result = num1+num2; //Just Like Here
        System.out.printf("\nAddition Of 2 Nos. Is %g",result);
    }

  public static void main(String args[])
  {
      ThisKeyword ob1 = new ThisKeyword(55,45);
      System.out.println(ob1.num1);
      System.out.println(ob1.num2);
      System.out.println(ob1.result);

  }
}