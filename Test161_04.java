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
//�����޷�ͨ����Animal�ӿ��������ȫΪ���󷽷�����eat������{}�����ڳ��󷽷�
//Dog����û��ʵ��run���󷽷����ӿ���ĳ��󷽷�����ȫ����ʵ��