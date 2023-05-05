/*
Creating a menu program with the following options:
    a. Add Element
    b. Remove Element
    c. Display Elements
    d. Exit
*/

import java.util.Scanner;
public class ArrayList_2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("This is a Menu Program with the following options");
        System.out.println("a. Add Element");
        System.out.println("b. Remove Element");
        System.out.println("c. Display Elements");
        System.out.println("d. Exit");

        while(True){
            System.out.println("Enter Option: ");
            char option = s.next().charAt(0);

            ArrayList<Integers> integers = new ArrayList<>();

            if (option.equals("a")){
                addElement(integers);
            }
            else if (option.equals("b")){
                removeElement(integers);
            }
            else if(option.equals("c")){
                displayElements(integers);
            }
            else if(option.equals("d")){
                break;
            }
            else{
                System.out.println("Invalid Option, Try Again.");
            }
        }

    }

    public static void addElement(ArrayList<>() integers){
        System.out.print("Enter number of elements to be added: ");
        n = s.nextInt();

        while(n>0){
            System.out.println("");
        }

    }
}