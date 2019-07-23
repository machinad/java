public class zuoye_160_10
{
  public static void main(String[] args)
  {
    B b = new B();
    b.test();
  }
  void test()
  {
    System.out.println("A");
  }
}
class B extends zuoye_160_10
{
  void test()
  {
    super.test();
    System.out.println("B");
  }
}
/*编译可以通过，输出AB*/