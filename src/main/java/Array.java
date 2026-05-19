import java.util.Arrays;

class Array
{
    public static void main(String[] args)

    {
        int arr[]={374,65,1,6576,76,56,4,6,7,44,7678,97809};

        for(int i=0;i<11;i++)
        {
            Arrays.sort(arr);
            System.out.println("ascending:  "+arr[i]);

        }

    }
}