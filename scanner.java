import java.io.*;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the age of one?:-");
        int ram = sc.nextInt();
        System.out.println("What is the age of two?:-");
        int shyam = sc.nextInt();
        int total = ram + shyam;
        System.out.println("Total Age:-"+ total);
    }
}
