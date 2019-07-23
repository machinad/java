public class fangfa
{
  public static void main(String[] args)
  {
    int sum;
    sum=Getsum(-5);
    System.out.println("sum="+sum);
  }
  public static int Getsum(int x)
  {
    int y;
    if(x>0)
    {
      y=x+3;
    }
    else if(x==0)
    {
      y=0;
    }
    else
    {
      y=x*x-1;
    }
    return y;
  }
}