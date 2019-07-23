public class Example5_03
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    Thread thread = new Thread(mythread);
    thread.start();
    while(true)
    {
      System.out.println("main()方法正在运行");
    }
  }
}
class MyThread implements Runnable
{
  public void run()
  {
    while(true)
    {
      System.out.println("MyThread类的run()方法正在运行");
    }
  }
}