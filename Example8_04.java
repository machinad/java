import java.io.*;
public class Example8_04
{
  public static void main(String[] args)throws Exception
  {
    InputStream in = new FileInputStream("source\\ÉÁ¶Ü.mp4");
    OutputStream out = new FileOutputStream("target\\ÉÁ¶Ü.mp4");
    int len;
    long begintime = System.currentTimeMillis();
    while((len=in.read())!=-1)
    {
       out.write(len);
    }
    long endtime = System.currentTimeMillis();
    System.out.println("¿½±´Ê±¼äÏûºÄÎª"+(endtime - begintime)+"ºÁÃë");
    in.close();
    out.close();
  }
}