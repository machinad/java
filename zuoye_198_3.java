public class zuoye_198_3
{
  public static void main(String[] args)
  {
    new Thread((new Teacher()),"老师一").start();
    new Thread((new Teacher()),"老师二").start();
    new Thread((new Teacher()),"老师三").start();
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
      System.out.println(th_name+"正在发第"+(i+1)+"份笔记");
    }
  }
}