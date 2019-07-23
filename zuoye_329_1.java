import java.io.*;
public class zuoye_329_1
{
  public static void main(String[] args) throws Exception
  {
    InputStream in = new FileInputStream("source\\闪盾.mp4");
    OutputStream out = new FileOutputStream("target\\闪盾.mp4");
    byte[] a = new byte[1024];
    int len;
    long bgtime = System.currentTimeMillis();
    while((len = in.read(a))!=-1)
    {
      out.write(a,0,len);
    }
    long endtime = System.currentTimeMillis();
    System.out.println("文件拷贝时间为："+(endtime-bgtime));
    in.close();
    out.close();
    FileReader reader = new FileReader("source\\ace.txt");
    FileWriter writer = new FileWriter("target\\ace.txt");
    BufferedReader red = new BufferedReader(reader);
    BufferedWriter wri = new BufferedWriter(writer);
    String an;
    long bg2time = System.currentTimeMillis();
    while((an=red.readLine())!=null)
      {
        wri.write(an);
        wri.newLine();
      }
    long end2time = System.currentTimeMillis();
    System.out.println("文件拷贝时间为："+(end2time-bg2time));
    red.close();
    wri.close();
  }
}