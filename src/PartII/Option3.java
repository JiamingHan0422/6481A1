package PartII;

import java.util.*;
//-----------------------------------------------------
//Assignment (1)
//© Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434) & (Jiaming Han 40185367)
//-----------------------------------------------------
public class Option3 {

    public static void findComputersBy() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the brand.");
        String brand;
        brand = sc.nextLine();
        for(int i = 0; i  < Main.computernumber; i++) {

            if(Main.inventory[i].getBrand().equals(brand)) {

                System.out.println(Main.inventory[i]);
            }
            System.out.println();
        }

    }
}
