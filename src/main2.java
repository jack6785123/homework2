import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%4==0){
            System.out.println("Bissextile  Year");
        }
        if(a%4!=0){
            System.out.println("Common  Year");
        }
        if(a%4==0&&a%100!=0){
            System.out.println("Bissextile  Year");
        }
        if(a%100==0&&a%400!=0){
            System.out.println("Common  Year");
        }
    }
}
