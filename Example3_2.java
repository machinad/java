class Person2
{
  void say()
  {
    System.out.println("我是一个人，很皮。");
  }
}
public class Example3_2
{
  public static void main(String[] args)
  {
    Person2 p2 = new Person2();
    p2.say();
    p2 = null;
    p2.say();
  }
}