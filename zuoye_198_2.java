public class zuoye_198_2
{
  public static void main(String[] args)
  {
    new Thread(new myxc()).start();
    for(int i=0;i<100;i++)
    {
      System.out.println("main"+i);
    }
  }
}
class myxc implements Runnable
{
  public void run()
  {
    for(int i=0;i<50;i++)
    {
      System.out.println("new"+i);
    }
  }
}