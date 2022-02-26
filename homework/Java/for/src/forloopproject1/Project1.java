package forloopproject1;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N= ");
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.println("ERROR: 0 dan katta bo'lgan son kiriting!!!");
        }
        String sum="";

            for(int j =n; j >=1; j--) {

                for(int i = 1; i <= j; i++) {
                    sum = sum + "*" +  " ";

             }
                System.out.println(sum);
                sum="";
        }





    }
}
