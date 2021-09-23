package demo;
import java.util.Scanner;

public class employee {
	int empid;
	String name;
	float salary;
	
	public void getInput() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the empid::");
		empid=in.nextInt();
		System.out.println("enter the name::");
		name=in.next();
		System.out.println("enter the salary::");
		salary=in.nextFloat();
		
	}
    public void display() {
    	System.out.println("employee id=" +empid);
    	System.out.println("employee name=" +name);
    	
    	System.out.println("employee salary=" +salary);
    	
    	
    }
    public void main(String[] args) {
    	employee e[] =new employee[5];
    	for(int i=0;i<5;i++) {
    	e[i]=new employee();
    	e[i].getInput();
    	
    	}
    	System.out.println("data enter");
    	 for(int i=0;i<5;i++) {
        	 e[i].display();
    }  
    	 
    
    	
     }
    
}
