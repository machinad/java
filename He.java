public class He
{
  public static void main(String[] args)
  {
    int sum=0;
    int i;
    for(i=1;i<=100;i++)
    {
      if(i%2==1)
      {
        continue;
      }
      sum+=i;
    }
    System.out.println("sum="+sum);
  }
}