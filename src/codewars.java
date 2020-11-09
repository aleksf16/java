import java.util.Scanner;

public class codewars {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
 int number = 0;
 number = in.nextInt();
        int arr[] = new int[number];

        for (int i = 0 ; i < arr.length; i++)
        { int b;
            b = in.nextInt();
            arr[i] = b;
        }

        for(int i = arr.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }

        for(int i = 0; i < arr.length-1; i++)
        {
            if( arr[i+1]- arr[i] > 1)
            {
                for(int j = 0; j < arr[i+1]-arr[i] - 1; j++)
                    System.out.println(arr[i]+j + 1);

            }
        }



    }
}