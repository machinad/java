class Father
{
  private String name = "zhangjun";
  public class Child
  {
    public void introFather()
    {
      System.out.println(name);
    }
  }
}
public class zuoye_112_2
{
  public static void main(String[] args)
  {
    Father.Child a = new Father().new Child();
    a.introFather();
  }
}