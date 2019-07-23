public class Example5_04
{
  public static void main(String[] args)
  {
    TicketWindow ticketwindow = new TicketWindow();
    ticketwindow.start();
    ticketwindow.start();
    ticketwindow.start();
    ticketwindow.start();
  }
}
class TicketWindow extends Thread
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
	System.out.println(th_name+"正在发售第"+tickets--+"张票");
      }
    }
  }
}