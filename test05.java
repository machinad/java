interface Animal
{
  void shout();
}
class Cat implements Animal
{
  public void shout()
  {
    System.out.println("����������������");
  }
}
class Dog implements Animal
{
  public void shout()
  {
    System.out.println("����������������");
  }
}
public class test05
{
  public static void main(String[] args)
  {
    Animal an1 = new Cat();
    Animal an2 = new Dog();
    an1.shout();
    an2.shout();
  }
}
