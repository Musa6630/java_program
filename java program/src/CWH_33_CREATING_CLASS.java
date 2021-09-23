class Employee{
    int id;
    int salary;
    String name;
    String address;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
    public String getaddress(){
        return address;
    }
}

public class CWH_33_CREATING_CLASS {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();  // Instantiating a new Employee Object
        Employee musabbir=new Employee();
        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34000;
        harry.name = "CodeWithHarry";
        harry.address="maharana pratap nagar";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12000;
        john.name = "John Khandelwal";
        john.address="kajiyana";

        // Setting Attributes for musabbir
        musabbir.id = 212;
        musabbir.salary = 212000;
        musabbir.name = "MD MUSABBIR AFQUE";
        musabbir.address="kajiyana in islampur";

        // Printing the Attributes
        harry.printDetails();
        int salary = harry.getSalary();
        System.out.println("my salary is: "+salary);
        String address = harry.getaddress();
        System.out.println("my address is: "+ address);


        john.printDetails();
        salary = john.getSalary();
        System.out.println("my salary is: "+salary);
        address= john.getaddress();
        System.out.println("my address is: "+address);

        musabbir.printDetails();
        salary= musabbir.getSalary();
        System.out.println("my salary is: "+salary);
        address= musabbir.getaddress();
        System.out.println("My address is: "+address);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
