public class Employee {
  String empName = "Abc";
  int empID;
  double empSalary = 200000;
  public void displayBonus()
  {
      double empBonus = empSalary * 0.2;
      System.out.printf("\nEmployee %s Gets A Bonus Of Rs. %g",empName,empBonus);
  }

}