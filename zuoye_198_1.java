public class zuoye_198_1
{
  public static void main(String[] args)
  {
    Myxc xc = new Myxc();
    Myxc xc_two = new Myxc();
    xc.setName("œﬂ≥Ã“ª");
    xc.start();
    xc_two.start();
  }
}
class Myxc extends Thread
  {
    public void run()
    {
      while(true)
      {
	Thread th = Thread.currentThread();
      	String th_name = th.getName();
	System.out.println(th_name);
      }
    }
  }