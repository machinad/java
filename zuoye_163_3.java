public class zuoye_163_3
{
  public static void main(String[] args)
  {
  try
    {
      Player player = new Player();
      player.play(34);
    }
  catch(NoThisSongException e)
    {
      System.out.println("��������쳣"+e.getMessage());
    }
  }
}
class NoThisSongException extends Exception
{
  public NoThisSongException()
  {
    super();
  }
  public NoThisSongException(String ress)
  {
    super(ress);
  }
}
class Player
{
  public void play(int index)throws NoThisSongException
  {
    if(index>10)
    {
      throw new NoThisSongException("�㲥�ŵĸ���������");
    }
    System.out.println("index="+index);
  }
}