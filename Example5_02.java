public class Example5_02
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    mythread.start();
    while(true)
    {
      System.out.println("main()������������");
    }
  }
}
class MyThread extends Thread
{
  public void run()
  {
    while(true)
    {
      System.out.println("MyThread���run������������");
    }
  }
}