import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        double inch = 0.0254*f;
        System.out.printf("%.0f inch is %.2f meters",f ,inch);
    }
}