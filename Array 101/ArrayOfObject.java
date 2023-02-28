public class ArrayOfObject {

    //Can Hold Variables Of Different Datatypes (Use "Object" Keyword)
  public static void main(String args[])
  {
    Object arr[] = {"Ameya",16, 5.11,'M'};  //Array Of Type Object
    for(Object x : arr)
        {
            System.out.println(x);
        }

      Object brr[][] = {
            {"Abc", 18, 5.5, 'F'},
            {"Def", 17, 5.2, 'M'},
            {"Pqr", 19, 6.5, 'F'},
            {"Xyz", 16, 6.2, 'F'}
    };

    for(Object x[] : brr)
        {
            for(Object y : x)
                {
                    System.out.print(y+" ");
                }
            System.out.println();
        }
  }
}