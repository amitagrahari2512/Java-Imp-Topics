package static_serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass1 {
	public static void main(String[] args) {
	    Employee1 emp = null;
	    try {
	      FileInputStream fileIn = new FileInputStream("./employee.txt");
	      ObjectInputStream in = new ObjectInputStream(fileIn);
	      emp = (Employee1) in.readObject();
	      in.close();
	      fileIn.close();
	    } catch (IOException i) {
	      i.printStackTrace();
	      return;
	    } catch (ClassNotFoundException c) {
	      System.out.println("Employee class not found");
	      c.printStackTrace();
	      return;
	    }
	    System.out.println("Deserializing Employee...");
	    //System.out.println("First Name of Employee: " + emp.firstName);
	    System.out.println("Last Name of Employee: " + emp.lastName);
	    System.out.println("Company Name static : "+emp.companyName);
	    System.out.println("Company Address transient: "+emp.address);
	    System.out.println("Company CEO static transient: "+emp.companyCEO);
	  }
}
