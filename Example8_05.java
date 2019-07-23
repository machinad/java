import java.io.*;
public class Example8_05
{
  public static void main(String[] args)throws Exception
  {
    InputStream in = new FileInputStream("source\\闪盾.mp4");
    OutputStream out = new FileOutputStream("target\\闪盾.mp4");
    byte[] buff = new byte[1024];
    int len;
    long begintime = System.currentTimeMillis();
    while((len=in.read(buff)) != -1)
    {
      out.write(buff,0,len);
      System.out.println(len);
    }
    long endtime = System.currentTimeMillis();
    System.out.println("拷贝文件时间为"+(endtime-begintime)+"毫秒");
    in.close();
    out.close();
  }
}