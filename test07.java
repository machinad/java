public class test07
{
  public static void main(String[] args)
  {
    int y = jisuan(-5);
    System.out.println("y="+y);
  }
  public static int jisuan(int x)
    {
      int y;
      if(x>0)
      {
        y = x+3;
      }
      else if(x==0)
      {
        y=0;
      }
      else
      {
        y = (x*x)-1;
      }
      return y;
    }
}