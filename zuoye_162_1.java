class Student
{
  String name;
  int age;
  public Student(String name,int age)
  {
    this.name = name;
    this.age = age;
  }
  public Student()
  {

  }
  public void show()
  {
    System.out.println("name="+name);
    System.out.println("age="+age);
  }
}
class Undergraduate extends Student
{
  String degree;
  public Undergraduate(String name,int age,String degree)
  {
    this.name = name;
    this.age = age;
    this.degree = degree;
  }
  public Undergraduate()
  {

  }
  public void show()
  {
    System.out.println("名字叫："+name+"成绩："+age+"专业为:"+degree);
  }
}
public class zuoye_162_1
{
public static void main(String[] args)
  {
    Student zhuanke = new Student("王大锤",78);
    Undergraduate benke = new Undergraduate("王小二",52,"博士");
    zhuanke.show();
    benke.show();
  }
}