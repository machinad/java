public class Example5_05
{
  public static void main(String[] args)
  {
    TicketWindow ticketwindow = new TicketWindow();
    new Thread(ticketwindow,"����һ").start();
    new Thread(ticketwindow,"���ڶ�").start();
    new Thread(ticketwindow,"������").start();
    new Thread(ticketwindow,"������").start();
  }
}
class TicketWindow implements Runnable
{
  private int tickets = 100;
  public void run()
  {
    while(true)
    {
      if(tickets>0)
      {
        Thread th = Thread.currentThread();
        String th_name = th.getName();
        System.out.println(th_name+"���ڷ���"+tickets--+"��Ʊ");
      }
    }
  }
}