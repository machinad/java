public class Example5_02
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    mythread.start();
    while(true)
    {
      System.out.println("main()方法正在运行");
    }
  }
}
class MyThread extends Thread
{
  public void run()
  {
    while(true)
    {
      System.out.println("MyThread类的run方法正在运行");
    }
  }
}