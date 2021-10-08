package PartII;

import java.util.Scanner;
//-----------------------------------------------------
//Assignment (1)
//© Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434) & (Jiaming Han 40185367)
//-----------------------------------------------------
public class Option4 {

    public static void findCheaperThan() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the price.");
        double price;
        price = sc.nextDouble();
        for(int i = 0; i  < Main.computernumber; i++) {

            if(Main.inventory[i].getPrice() < price) {

                System.out.println(Main.inventory[i]);
            }
            System.out.println();
        }
    }
}
