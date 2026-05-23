import java.util.Scanner;

class Java
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size");
        int n= sc.nextInt();
        int arr[]=new int[n];

        int max= Integer.MAX_VALUE;
/* i ki value  7 tak chalegi arr[i] kitni bhi dalo+*/
        for(int i=0;i<n;i++)
        {
            System.out.println("enetr number"+(i+1));
            arr[i]
                    = sc.nextInt();
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.print("largest number"+max);


    }
}