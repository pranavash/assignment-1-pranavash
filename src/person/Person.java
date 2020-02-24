package person;

public class Person {
    private String fname;
    private String lname;
    private String[] conNumber;
    private String email;
    private int headC;


    public Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
        email=null;
        conNumber= new String[10];
        headC=0;

    }
    public void setConNumber(String i){
        this.conNumber[headC]=i;
        headC++;
    }

    public String[] getConNumber(){
        return  conNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

}
