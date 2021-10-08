package PartII;

import java.util.Scanner;
//-----------------------------------------------------
//Assignment (1)
//© Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434) & (Jiaming Han 40185367)
//-----------------------------------------------------
public class Option1 {

    Scanner p_sc = new Scanner(System.in);
    public void Passwordvaild(){


        String password = "password";
        String input;
        boolean result = false;

        for(int i = 0; i < 3 ; i++) {
            System.out.println("Please enter the password.");
            input = p_sc.nextLine();

            if(password.equals(input)) {
                System.out.println("Login success!");
                result = true;
                break;
            }
            else {
                System.out.println("The password is not correct.");
                continue;
            }
        }

        if(result) {
            System.out.println("How many computer do you want to input?");
            int addnumber = p_sc.nextInt();
            p_sc.nextLine();
            check(addnumber);
        }

    }
    public void check(int addnumber) {

        int expectspace = 0;

        boolean result = false;

        expectspace = addnumber + Main.computernumber;

        if(Main.computerspace - expectspace > 0) {

            System.out.println("Enough space to add a computer!");
            addComputer(addnumber);
            result = true;
        }
        else {


            System.out.println("Sorry, the database is full.");
        }
    }

    public void addComputer(int addnumber) {

        String brand;
        String model;
        double price;

        for(int i = 0; i < addnumber ; i++) {

            System.out.println("Please enter your " + (i+1) + " computer:");
            System.out.println("Please enter the brand(String): ");

            brand = p_sc.nextLine();
            System.out.println("Please enter the model(String): ");

            model = p_sc.nextLine();
            System.out.println("Please enter the price(double): ");
            price = p_sc.nextDouble();
            p_sc.nextLine();
            Computer addcomputer = new Computer(brand, model, price);
            add(addcomputer);
        }

    }

    public boolean add(Computer c) {

        Main.inventory[Main.computernumber] = c;

        if(Main.inventory[Main.computernumber].equals(c)) {
            System.out.println("Input success! ");
            System.out.println(Main.inventory[Main.computernumber]);

            Main.computernumber++;
            return true;
        }
        else {
            System.out.println("Input failed! ");
            return false;
        }

    }

}
