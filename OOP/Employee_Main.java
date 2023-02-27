public class Employee_Main {
  public static void main(String args[])
  {
      Employee emp1 = new Employee();
      Employee emp2 = new Employee();

      emp1.empID = 1;
      emp1.empName = "Abcd";
      emp1.empSalary = 250000;
      emp1.displayBonus();

      emp2.empID = 2;
      emp2.empName = "Xyz";
      emp2.empSalary = 310000;
      emp2.displayBonus();
  }
}