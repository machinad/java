public class test06
{
  public static void main(String[] args)
  {
    int m = 0;
    for(int i=0;i<100;i++)
    {
    if(i%2==0)
    {
      continue;
    }
    m=m+i;
    }
    System.out.println(m);
  }
}