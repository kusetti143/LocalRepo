import java.util.Scanner;
public class Patterns {
    public static void Pattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        for (int i = 1;i <= n; i++){
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;
        for (int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
    }    

public static void Pattern3() {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
                
    }
    
    public static void Pattern4() {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println(); 
        }
    }
    
    
    public static void Pattern5() {
         Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1;i <= n; i++){
            for(int j = 1; j <= i; j++){
                if (((i + j) & 1) == 0){
                    System.out.println(1); 
                } else { 
                    System.out.println(0);
                }
            }
            System.out.println();
        }
    }


    public static void Pattern6() {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j<= n - i + 1; j++) {
                System.out.println(j); 
            }
            System.out.println();
        }
     }    
        

    public static void Pattern7() {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.println(k);
                k++; 
            }
            System.out.println();
        }
     }     


    public static void Pattern8(){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(0;
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern1();
    //    Alphabets
        Pattern2();
        // Numbers
        Pattern3();
        Pattern4();
        Pattern7();
        // 0's and 1's
        Pattern5();
        Pattern6();
        Pattern8();
    }
}
