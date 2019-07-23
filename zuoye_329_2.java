import java.io.*;
public class zuoye_329_2
{
  public static void main(String[] args)throws Exception
  {
    BufferedReader du = new BufferedReader(new InputStreamReader(System.in));
    
    for(int i=0;i<=5;i++)
    {
      String passa = du.readLine();
      if(passa.equals("123456"))
      {
        System.out.println("¹§Ï²¼ÓÈëÓÎÏ·");
        break;
      }
      if(i==5)
      {
        System.out.println("ÃÜÂë´íÎó");
        System.exit(0);
      }
    }
  }
}