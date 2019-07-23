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
      System.out.println("程序出现异常"+e.getMessage());
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
      throw new NoThisSongException("你播放的歌曲不存在");
    }
    System.out.println("index="+index);
  }
}