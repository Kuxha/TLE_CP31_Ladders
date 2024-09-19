//package TLE_Ladders.l1_800;//package TLE_Ladders.l1_800;//package TLE_Ladders.l1_800;

import java.util.HashMap;
import java.util.Scanner;

public class a14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a>b){


                if(a-b == 1){
                    if(c%2 != 0 ){
                        System.out.println("Second");
                    }else{
                        System.out.println("First");
                    }
                }else{
                    System.out.println("First");
                }

            }else if (b>a){
                System.out.println("Second");
            }else{
                // if same


                    if(c%2 == 0 ){
                        System.out.println("Second");
                    }else{
                        System.out.println("First");
                    }


            }



        }

    }
}