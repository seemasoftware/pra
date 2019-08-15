import java.util.Scanner;

public class ArrayInScanner {
    public static void main(String[] args){
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of array: ");
        int l =scanner.nextInt();
        int a[]=new int[l];

        for(i=0;i<a.length;i++) {
            System.out.println("Enter Number :");
            int b = scanner.nextInt();
            a[i] = b;
        System.out.println("Number " + b + " is in " + "position "+i);
        }
    }
}
