package myList;

import Node.Node;
import person.Person;

public class MyList {
    private Node head;
    public MyList(){
        head=null;
    }
    public Node getHead(){
        return head;
    }

    public void insert(Person p){
        Node node=new Node(p);
        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void printList(){
        System.out.println("---Here are all your contacts---");
        System.out.println("-------- * -------- * -------- * --------");
        Node temp=head;
        if(head!=null) {
            while (temp != null) {
                Person e = temp.getData();
                System.out.println("First Name: " + e.getFname());
                System.out.println("Last Name: " + e.getLname());
                System.out.print("Contact Number(s): ");
                String[] no = e.getConNumber();
                for (int i = 0; i < no.length; i++) {
                    if (no[i] != null) {
                        System.out.print(no[i]);
                        if (no[i + 1] != null) {
                            System.out.print(", ");
                        }
                    }
                }
                System.out.println();
                if (e.getEmail() != null) {
                    System.out.println("Email address: " + e.getEmail());
                }
                System.out.println("-------- * -------- * -------- * --------");
                temp = temp.getNext();

            }
        }
        else{
            System.out.println("||        Contact List is Empty         ||");
            System.out.println("-------- * -------- * -------- * --------");
        }
    }

    public boolean search(String fname) {
        boolean response = false;
        Node temp = head;
        if(head!=null) {
            while (temp != null) {
                Person temp1 = temp.getData();
                if (temp1.getFname().equals(fname)) {
                    response = true;
                    System.out.println("1 match found!");
                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("First Name: " + temp1.getFname());
                    System.out.println("Last Name: " + temp1.getLname());
                    System.out.print("Contact Number(s): ");
                    String[] no = temp1.getConNumber();
                    for (int i = 0; i < no.length; i++) {
                        if (no[i] != null) {
                            System.out.print(no[i]);
                            if (no[i + 1] != null) {
                                System.out.print(", ");
                            }
                        }
                    }
                    System.out.println();
                    if (temp1.getEmail() != null) {
                        System.out.println("Email address: " + temp1.getEmail());
                    }
                    temp = temp.getNext();
                    System.out.println("-------- * -------- * -------- * --------");
                    response = true;
                    break;
                }
                // updating temp
                temp = temp.getNext();


            }

        }
        else{
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("||        Contact List is Empty         ||");
            System.out.println("-------- * -------- * -------- * --------");
        }

        return response;
    }

    public void delete(String delfname) {
        Node temp = head;
        if (head != null) {
            if(head.getData().getFname().equals(delfname)){
                head=head.getNext();
                temp=head;
                System.out.println(delfname + "'s contact deleted from list!3");
            }
            else if (head.getNext() != null){
                while (temp != null) {

                    Person temp1 = temp.getData();
                    if (temp.getNext().getData().getFname().equals(delfname) && temp.getNext()!=null) {
                        Node temp7 = temp.getNext().getNext();
                        temp.setNext(temp7);
                        System.out.println(delfname + "'s contact deleted from list!2");
                        break;
                    }
                    else if(temp.getNext().getData().getFname().equals(delfname)&& temp.getNext().getNext()==null){
                        temp.setNext(null);
                        break;
                    }
                    temp = temp.getNext();
                }
            } else {
                Person tempu = head.getData();
                if (tempu.getFname().equals(delfname)) {
                    head = null;
                    System.out.println(delfname + "'s contact deleted from list!1");
                }
            }

        }
        else{
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("||        Contact List is Empty         ||");
            System.out.println("-------- * -------- * -------- * --------");
        }
    }
}
