class Animal
{
  public Animal(String name)
  {
    System.out.println("����һֻ"+name);
  }
}
class Dog extends Animal
{
  public Dog()
  {
    super("С�Ը�");
  }
}
public class Example4_04
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
  }
}