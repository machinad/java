public class chengfa_2
{
  public static void main(String[] args)
  {
    int i,j;
    i=1;
    while(i<=9)
    {
      j=1;
      while(j<=i)
      {
	System.out.print(i+"*"+j+"="+i*j+"\t");
	j++;
      }
      i++;
      System.out.print("\n");
    }
  }
}