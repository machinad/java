class student
{
  private String name;
  private int grade;
  public String getName()
  {
    System.out.println("getName������");
    return name;
  }
  public void putName(String mingzi)
  {
    name=mingzi;
    System.out.println("putName������");
  }
  public int getGrade()
  {
    System.out.println("getGrade������");
    return grade;
  }
  public void putGrade(int chengji)
  {
    grade=chengji;
    System.out.println("putGrade������");
  }
  public student()
  {
    System.out.println("�޲ι��췽��������");
  }
  public student(int chengji,String mingzi)
  {
    grade=chengji;
    name=mingzi;
    System.out.println("�вι��췽��������");
  }
  public void prin()
  {
    System.out.println("��Һã��ҽУ�"+name+"�ҵĳɼ�Ϊ��"+grade);
  }
}
public class zuoye_112
{
  public static void main(String[] args)
  {
    student a=new student();
    student b=new student(90,"����");
    a.putGrade(80);
    a.putName("��ħ��");
    a.prin();
    b.prin();
  }
}