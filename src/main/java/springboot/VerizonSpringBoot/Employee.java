package springboot.VerizonSpringBoot;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Employee {
	//private @Id @GeneratedValue Long id;
    private int userid;
	private String name;
    
    Employee(){}
    public int getUserid()
    {
    	return this.userid;
    }
    public String getName()
    {
    	return this.name;
    }


    Employee(String name) {
    	this.name = name;
    	this.userid = userid;

    }
    Employee(String name, int id) {
    	this.name = name;
    	this.userid = userid;

    }
    public void test()
     {
    	System.out.println("Test  Method");    
     }
    ArrayList<String>getCatalogList(){
    	
    	ArrayList<String> data= new ArrayList<String>();
    	data.add("cloths");
    	data.add("shoes");
    	return data;
    	
    }

}
