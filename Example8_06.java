class Car
{
  private String carName;
  public Car(String carName)
  {
    this.carName = carName;
  }
  public void show()
  {
    System.out.println("����"+carName+"�����л�������");
  }
}
class RedaCar
{
  public Car myCar;
  public RedaCar(Car myCar)
  {
    this.myCar = myCar;
  }
  public void show()
  {
    myCar.show();
    System.out.println("���е����״﹦��");
  }
}
public class Example8_06
{
  public static void main(String[] args)
  {
    Car benz = new Car("benz");
    System.out.println("==========��װǰ==========");
    benz.show();
    RedaCar decoratedCar_benz = new RedaCar(benz);
    System.out.println("==========��װ��==========");
    decoratedCar_benz.show();
  }
}