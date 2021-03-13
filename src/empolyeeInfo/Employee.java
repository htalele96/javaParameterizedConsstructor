package empolyeeInfo;

public class Employee {
	
	private int empId;
	private String empName ;
	private int empProjectID;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId,int empProjectID,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		this.empProjectID=empProjectID;
	}
	
	public Employee(int empId,int empProjectID)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public void setEmpID(int empId) {
		this.empId=empId;
		
	}
public int getEmpid() {
	
	return this.empId;
}

public String getEmpName() {
	
	return this.empName;
}

public int getEmpProjectID() {
	
	return this.empProjectID;
}
}
