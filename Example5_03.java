public class Example5_03
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    Thread thread = new Thread(mythread);
    thread.start();
    while(true)
    {
      System.out.println("main()������������");
    }
  }
}
class MyThread implements Runnable
{
  public void run()
  {
    while(true)
    {
      System.out.println("MyThread���run()������������");
    }
  }
}