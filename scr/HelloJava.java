import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("HelloWorld Yub!");
        Scanner Obi= new Scanner(System.in);
        int x;
        System.out.print("Enter x:");
        x = Obi.nextInt();
        for(int n=1;n<=x;n++){
            for(int i=1;i+n<=x;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}