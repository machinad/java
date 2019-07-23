import java.io.*;
public class Example8_01
{
  public static void main(String[] args) throws Exception
  {
    FileInputStream in = new FileInputStream("text.txt");
    int b=0;
    while(true)
    {
      b = in.read();
      if(b==-1)
      {
	break;
      }
      System.out.println(b);
    }
    in.close();
  }
}