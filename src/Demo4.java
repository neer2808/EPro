class Emp1
{
 int id;
 String name;

 public Emp1(int id, String name) {
  this.id = id;
  this.name = name;
 }
}
class Stu1
{
 int rollno;
 int marks;

 public Stu1(int rollno, int marks) {
  this.rollno = rollno;
  this.marks = marks;
 }
}
public class Demo4
{
 public static void main(String[] args) {
  Object arr[] = new Object[5];
  arr[1] = new Stu1(1,45);
  arr[0] = new Emp1(101,"abc");
  //arr[0] = new String("neeraj");
  for (Object res :arr) {
    if(res instanceof Emp1)
    {
     Emp1 tobj = (Emp1)res;
      System.out.println(((Emp1) res).id);
     System.out.println(tobj.id+ "  "+ tobj.name);
    }
    if(res instanceof Stu1)
    {
     Stu1 tobj1 = (Stu1)res;
     System.out.println(tobj1.rollno+ "  "+tobj1.marks);
    }
  }

 }
}
