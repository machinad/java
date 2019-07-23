import java.io.*;
public class Example8_05
{
  public static void main(String[] args)throws Exception
  {
    InputStream in = new FileInputStream("source\\����.mp4");
    OutputStream out = new FileOutputStream("target\\����.mp4");
    byte[] buff = new byte[1024];
    int len;
    long begintime = System.currentTimeMillis();
    while((len=in.read(buff)) != -1)
    {
      out.write(buff,0,len);
      System.out.println(len);
    }
    long endtime = System.currentTimeMillis();
    System.out.println("�����ļ�ʱ��Ϊ"+(endtime-begintime)+"����");
    in.close();
    out.close();
  }
}