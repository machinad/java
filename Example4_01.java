class Animal
{
  String name;
  void shout()
  {
    System.out.println("动物发出叫声");
  }
}
class Dog extends Animal
{
  public void printName()
  {
    System.out.println("name="+name);
  }
}
public class Example4_01
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
    dog.name = "舔狗";
    dog.printName();
    dog.shout();
  }
}