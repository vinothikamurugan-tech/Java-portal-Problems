import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        int n = sc.nextInt();
        System.out.printf("%."+ n + "f",f);
    }
}