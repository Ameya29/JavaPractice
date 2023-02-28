import java.util.*;
public class ArrayOfObjectAsParam {

    int rollNum;
    String fname;
    double percent;

    public void printStudent(ArrayOfObjectAsParam arr[])
    {
        System.out.print("\nPrinting Student Details.....\n");
        for(int i=0; i<arr.length; i++)  // for(ArrayOfObjectAsParam x : arr) ==> x.rollNum, x.fname .....
        {
            System.out.println("Student "+i+" Details:");
            System.out.println("Roll No.: "+arr[i].rollNum);
            System.out.println("First Name: "+arr[i].fname);
            System.out.println("Percentage: "+arr[i].percent);
        }
    }

  public static void main(String args[])
  {
    //int arr[] = new int[5];  //Normal Array
      Scanner ob = new Scanner(System.in);
      ArrayOfObjectAsParam classArr[] = new ArrayOfObjectAsParam[2];  //className arrName[] = new className[arrSize];

      for(int i=0; i<classArr.length; i++)
          {
              classArr[i] = new ArrayOfObjectAsParam();
              System.out.println("\nEnter Values For Student "+i);
              System.out.print("Enter Roll No.: ");
              classArr[i].rollNum = ob.nextInt();

              System.out.print("Enter First Name: ");
              classArr[i].fname = ob.next();

              System.out.print("Enter Percentage: ");
              classArr[i].percent = ob.nextDouble();
          }

      ArrayOfObjectAsParam classObj = new ArrayOfObjectAsParam();
      classObj.printStudent(classArr);
  }
}