/*
Creating a menu program with the following options:
    a. Add Element
    b. Remove Element
    c. Display Elements
    d. Exit
*/

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("This is a Menu Program with the following options");
        System.out.println("a. Add Element");
        System.out.println("b. Remove Element");
        System.out.println("c. Display Elements");
        System.out.println("d. Exit");

        ArrayList<Integer> integers = new ArrayList<>();

        while(true){
            System.out.print("Enter Option: ");
            String option = s.next();

            if (option.equals("a"))
            {
                System.out.print("Enter number of elements to be added: ");
                int n = s.nextInt();

                while(n>0){
                    System.out.println("Enter number: ");
                    int x = s.nextInt();
                    integers.add(x);
                    System.out.println("Added "+x);
                    n--;
                    }
            }

            else if (option.equals("b"))
            {
                System.out.print("Enter number of elements to be removed: ");
                int n = s.nextInt();

                while(n>0){
                    System.out.println("Enter number: ");
                    int x = s.nextInt();
                    try{
                        integers.remove(x);
                        System.out.println("Removed "+x);
                        n--;
                    }catch(Exception e){
                        System.out.println("Number not in list, try again");
                        continue;
                    }
                }
            }

            else if(option.equals("c"))
            {
                for(int x:integers){
                    System.out.print(x + " ");
                }
            }

            else if(option.equals("d"))
            {
                break;
            }

            else
            {
                System.out.println("Invalid Option, Try Again.");
            }
        }

    }






}