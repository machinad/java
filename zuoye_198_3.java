public class zuoye_198_3
{
  public static void main(String[] args)
  {
    new Thread((new Teacher()),"��ʦһ").start();
    new Thread((new Teacher()),"��ʦ��").start();
    new Thread((new Teacher()),"��ʦ��").start();
  }
}
class Teacher implements Runnable
{
  public void run()
  {
    for(int i=0;i<80;i++)
    {
      Thread th = Thread.currentThread();
      String th_name = th.getName();
      System.out.println(th_name+"���ڷ���"+(i+1)+"�ݱʼ�");
    }
  }
}