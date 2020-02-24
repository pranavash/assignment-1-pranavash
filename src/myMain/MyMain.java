package myMain;

import myList.MyList;
import person.Person;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyList obj=new MyList();
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Divyansh's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.print("Press 5 to exit program:-    ");
        int s=sc.nextInt();
        sc.nextLine();
        while (s!=5){
            switch (s){
                case 1:
                    System.out.println("You have chosen to add a new contact:");
                    System.out.println("Please enter the name of the Person");
                    System.out.print("First Name: ");
                    String fname=sc.nextLine();
                    System.out.print("Last Name: ");
                    String lname=sc.nextLine();
                    Person person=new Person(fname,lname);
                    System.out.print("Contact Number: ");
                    String con=sc.nextLine();
                    person.setConNumber(con);

                    System.out.print("Would you like to add another contact number? (y/n):");
                    String w=sc.nextLine();
                    while(!(w.equals("n"))) {
                        System.out.print("Contact Number: ");
                        con = sc.nextLine();
                        person.setConNumber(con);
                        System.out.print("Would you like to add another contact number? (y/n):");
                        w = sc.nextLine();
                    }
                    //sc.nextLine();
                    System.out.print("Would you like to add email address? (y/n): ");
                    w=sc.nextLine();
                    if(!(w.equals("n"))) {
                        System.out.print("Email Address: ");
                        String em = sc.nextLine();
                        person.setEmail(em);
                    }
                    obj.insert(person);
                    break;
                case 2:
                    obj.printList();
                    break;
                case 3:
                    //sc.nextLine();
                    System.out.print("Please enter first name:-");
                    String name=sc.nextLine();
                    boolean res=obj.search(name);
                    if(!(res)){
                        System.out.println("0 match found");
                    }
                    break;
                case 4:
                    System.out.println("Here are all your contacts:");
                    obj.printList();
                    System.out.print("Please enter first name whose contact you want delete:- ");
                    String delfname=sc.nextLine();
                    obj.delete(delfname);
                    break;
                default:
                    System.out.println("!!!! Wrong choice!!!!");
                    System.out.println("Enter correct choice------------>");

            }

            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.print("Press 5 to exi program:-    ");
            s=sc.nextInt();
            sc.nextLine();
        }
    }
}
