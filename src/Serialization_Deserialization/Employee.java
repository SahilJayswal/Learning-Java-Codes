package Serialization_Deserialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String Department;
	Address address;
	public Employee(int id, String name, String department, Address address) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + ", address=" + address + "]";
	}
	

	
}
