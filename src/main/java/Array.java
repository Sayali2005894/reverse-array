import java.util.Arrays;
import java.util.Scanner;

class Binary_Search
{
    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);
        int arr[]={374,65,1,6576,76,56,4,6,7,44,7678,97809};
        int j;
        Arrays.sort(arr);
        System.out.println("search number");
                int k=sc.nextInt();

           j=  Arrays.binarySearch(arr,k);



        System.out.println("ascending:  "+j);
    }
}