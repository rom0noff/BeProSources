package forproject2;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("--------------------------TASK1-----------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("N= ");
        int n = scanner.nextInt();
        String bosh = "";
        if(n <= 0) {
            System.out.println(bosh);
            System.out.println("ERROR: 0 dan katta son kiriting!!!");
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(bosh);
        System.out.println("1 dan n gacha bo'lgan juft sonlar yig'indisi: " + sum);
        System.out.println(bosh);
        System.out.println(bosh);
        System.out.println("--------------------------TASK2-----------------------------");
        sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0){
                sum = sum + i;
            }
        }
        System.out.println(bosh);
        System.out.println("1 dan n gacha bo'lgan sonlarni 3 ga bo'lganda qoldiq qoladigan sonlarning yig'indisi: " + sum);
        System.out.println(bosh);
        System.out.println(bosh);
        System.out.println("--------------------------TASK3-----------------------------");
        System.out.println(bosh);
        int kop = 1;
        for(int i = 1; i <= n; i++){

                kop = kop * i;

        }
        System.out.println("1 dan n gacha bo'lgan sonlarning ko'paytimasi: "+kop);
    }
}
