public class Reverse
{
  public static void main(String[] args)
  {
    System.out.println("一维数组转置前为");
    int[] arr={1,2,3,4,5,6,7,8,9};
    bianli(arr);
    dataReverse(arr);
    System.out.print("\n");
    System.out.println("一维数组转置后为");
    bianli(arr);
  }
  public static void dataReverse(int[] arr)
  {
    int TheNumberOf;
    if(arr.length%2==0)
    {
      TheNumberOf=arr.length/2;
    }
    else
    {
      TheNumberOf=(arr.length-1)/2;
    }
    int y=arr.length-1;
    int box;
    for(int i=0;i<TheNumberOf;i++)
    {
      box=arr[i];
      arr[i]=arr[y];
      arr[y]=box;
      y--;
    }
  }
  public static void bianli(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" "); 
    }
  }
}