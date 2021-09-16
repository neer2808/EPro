class Emp
{
  public void show()  // instance method
  {
    System.out.println("welcome");
  }

}
// execution class
public class Demo3 {
  public static void main(String[] args) {
//    Emp obj = new Emp();
//    obj.show();
    new Emp().show();  // anonymous object (used only for single time)
  }
}
