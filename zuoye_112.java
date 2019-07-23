class student
{
  private String name;
  private int grade;
  public String getName()
  {
    System.out.println("getName被调用");
    return name;
  }
  public void putName(String mingzi)
  {
    name=mingzi;
    System.out.println("putName被调用");
  }
  public int getGrade()
  {
    System.out.println("getGrade被调用");
    return grade;
  }
  public void putGrade(int chengji)
  {
    grade=chengji;
    System.out.println("putGrade被调用");
  }
  public student()
  {
    System.out.println("无参构造方法被调用");
  }
  public student(int chengji,String mingzi)
  {
    grade=chengji;
    name=mingzi;
    System.out.println("有参构造方法被调用");
  }
  public void prin()
  {
    System.out.println("大家好，我叫："+name+"我的成绩为："+grade);
  }
}
public class zuoye_112
{
  public static void main(String[] args)
  {
    student a=new student();
    student b=new student(90,"王大锤");
    a.putGrade(80);
    a.putName("神魔恋");
    a.prin();
    b.prin();
  }
}