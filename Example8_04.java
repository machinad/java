import java.io.*;
public class Example8_04
{
  public static void main(String[] args)throws Exception
  {
    InputStream in = new FileInputStream("source\\����.mp4");
    OutputStream out = new FileOutputStream("target\\����.mp4");
    int len;
    long begintime = System.currentTimeMillis();
    while((len=in.read())!=-1)
    {
       out.write(len);
    }
    long endtime = System.currentTimeMillis();
    System.out.println("����ʱ������Ϊ"+(endtime - begintime)+"����");
    in.close();
    out.close();
  }
}