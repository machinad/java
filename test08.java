public class test08
{
  public static void main(String[] args)
  {
    int[] arr = {15,25,24,78,65,29,99};
    System.out.println("≈≈–Ú«∞");
    arrBianli(arr);
    System.out.println("≈≈–Ú∫Û");
    arrPaixv(arr);
    arrBianli(arr);
  }
  public static void arrPaixv(int[] arr)
  {
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=0;j<arr.length-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
	  int x;
          x=arr[j];
          arr[j]=arr[j+1];
	  arr[j+1]=x;
        }
      }
    }
  }
  public static void arrBianli(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}