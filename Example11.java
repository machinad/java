public class Example11
{
  public static void main(String[] args)
  {
    int week=2;
    switch(week)
    {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("今天是工作日");
        break;
      case 6:
      case 7:
        System.out.println("今天是休息日");
        break;
    }
  }
}