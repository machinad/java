class Animal
{
  public Animal(String name)
  {
    System.out.println("我是一只"+name);
  }
}
class Dog extends Animal
{
  public Dog()
  {
    super("小脑斧");
  }
}
public class Example4_04
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
  }
}