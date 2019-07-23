interface Shape
{
  abstract double area(double a);
}
class Square implements Shape
{
  public double area(double a)
  {
  double S;
  S = a*a;
  return S;
  }
}
class Circle implements Shape
{
  public double area(double r)
  {
    double S;
    double p = 3.1415927;
    S = p*r*r;
    return S;
  }
}
public class zuoye_162_2
{
  public static void main(String[] args)
  {
  Square Square = new Square();
  Circle Circle = new Circle();
  double s=Square.area(2);
  double r=Circle.area(3);
  System.out.println("正方形的面积为："+s);
  System.out.println("圆的面积为："+r);
  }
}
