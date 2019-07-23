public class Example5_01
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    mythread.run();
    while(true)
    {
      System.out.println("main方法正在运行");
    }
  }
}
class MyThread
{
  public void run()
  {
    System.out.println("MyThread方法正在运行");
  }
}