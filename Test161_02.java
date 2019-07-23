final class Animal
{
  public final void shout()
  {
    
  }
}
class Dog extends Animal
{
  public void shout()
  {

  }
}
public class Test161_02
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
  }
}
//不能编译通过，Animal类有final修饰符，无法被Dog类继承