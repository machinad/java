interface Animal
{
  void breathe();
  void run();
  void eat(){};
}
class Dog implements Animal
{
  public void breathe()
  {
    System.out.println("I'am breathe");
  }
  public void eat()
  {
    System.out.println("I'am eathing");
  }
}
public class Test161_04
{
  public static void main(String[] args)
  {
  Dog dog = new Dog();
  dog.breathe();
  dog.eat();
  }
}
//编译无法通过，Animal接口里面必须全为抽象方法，而eat方法有{}不属于抽象方法
//Dog类中没有实现run抽象方法，接口里的抽象方法必须全部都实现