import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String str = sc.nextLine();
        String[] numbers = str.split("\\+");
        int [] arr = new int[numbers.length];
        for (int i=0 ; i< numbers.length;i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length;i++)
            if (i == arr.length-1)
                System.out.print(arr[i] + "=" + sum);
            else
                System.out.print(arr[i] + "+");
        }
    }
