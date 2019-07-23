public class paixv
{
  public static void main(String[] args)
  {
    int[] arr={25,24,12,76,101,96,28};
    System.out.println("排序前的数组：");
    bianli(arr);
    Paixv(arr);
    System.out.println("排序后的数组：");
    bianli(arr);
  }
  public static void bianli(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.print("\n");
  }
  public static void Paixv(int[] arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=0;j<arr.length-i-1;j++)
      {
	int temp;
	if(arr[j]>arr[j+1])
	{
	  temp=arr[j];
	  arr[j]=arr[j+1];
	  arr[j+1]=temp;
	}
	System.out.print(arr[j]+" ");
      }
      System.out.print("\n");
    }
  }
}