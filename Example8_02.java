import java.io.*;
public class Example8_02
{
  public static void main(String[] args)throws Exception
  {
    FileOutputStream out = new FileOutputStream("example.txt");
    String str = "�Ұ�С�Թ�ѽ";
    byte[] b = str.getBytes();
    for(int i=0;i<b.length;i++)
    {
      out.write(b[i]);
    }
    out.close();
    System.out.println("�ֽ����������");
  }
}