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
      System.out.println("�������ϢΪ"+e.getMessage());
    }
    System.out.println("�����������ִ��");
  }
  public static int divide(int x,int y)
  {
    int result = x/y;
    return result;
  }
}