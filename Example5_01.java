public class Example5_01
{
  public static void main(String[] args)
  {
    MyThread mythread = new MyThread();
    mythread.run();
    while(true)
    {
      System.out.println("main������������");
    }
  }
}
class MyThread
{
  public void run()
  {
    System.out.println("MyThread������������");
  }
}