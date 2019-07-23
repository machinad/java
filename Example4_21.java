public class Example4_21
{
  public static void main(String[] args)
  {
    try
    {
      int result=divide(4,0);
      System.out.println(result);
    }
    catch(Exception e)
    {
      System.out.println("捕获的信息为"+e.getMessage());
    }
    System.out.println("程序继续向下执行");
  }
  public static int divide(int x,int y)
  {
    int result = x/y;
    return result;
  }
}