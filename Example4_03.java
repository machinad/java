class Animal
{
  String name = "����";
  void shout()
  {
    System.out.println("���﷢������");
  }
}
class Dog extends Animal
{
  String name = "Ȯ��";
  void shout()
  {
    super.shout();
  }
  void printName()
  {
    System.out.println("name="+super.name);
  }
}
class Example4_03
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
    dog.shout();
    dog.printName();
  }
}