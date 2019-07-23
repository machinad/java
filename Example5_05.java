public class Example5_05
{
  public static void main(String[] args)
  {
    TicketWindow ticketwindow = new TicketWindow();
    new Thread(ticketwindow,"窗口一").start();
    new Thread(ticketwindow,"窗口二").start();
    new Thread(ticketwindow,"窗口三").start();
    new Thread(ticketwindow,"窗口四").start();
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
        System.out.println(th_name+"正在发售"+tickets--+"张票");
      }
    }
  }
}