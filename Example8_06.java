class Car
{
  private String carName;
  public Car(String carName)
  {
    this.carName = carName;
  }
  public void show()
  {
    System.out.println("我是"+carName+"，具有基本功能");
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
    System.out.println("具有倒车雷达功能");
  }
}
public class Example8_06
{
  public static void main(String[] args)
  {
    Car benz = new Car("benz");
    System.out.println("==========包装前==========");
    benz.show();
    RedaCar decoratedCar_benz = new RedaCar(benz);
    System.out.println("==========包装后==========");
    decoratedCar_benz.show();
  }
}