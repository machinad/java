public class digui
{
  public static void main(String[] args)
  {
    int sum;
    sum=getSum(4);
    System.out.println("sum="+sum);
  }
  public static int getSum(int n)
  {
    if(n==1)
    {
      return 1;
    }
    int temp=getSum(n-1);
    return temp*n;
  }
}