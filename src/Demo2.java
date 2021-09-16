// passing array as  parameter to a method
// Anonymous array ( name less array
public class Demo2 {
  public static void value(int arr[]) // int arr[] = ar1
  {
    arr[3]= 7000;
//    for (int res:arr) {
//      System.out.println(res);
//    }
  }
  public static void main(String[] args) {
    int ar1[] = {12,67,89,90};
//    for (int i = 0; i <ar1.length ; i++) {
//        ar1[i] = 67;
//    }
// value(new int[]{23,56,78,90});
    value(ar1);
    for (int i = 0; i <ar1.length ; i++) {
      System.out.println(ar1[i]);
    }

  }
}
