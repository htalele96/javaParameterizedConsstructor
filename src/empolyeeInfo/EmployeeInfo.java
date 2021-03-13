package empolyeeInfo;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp=new Employee(5051365,5,"Hirkani");
	
    int empID=emp.getEmpid();
	System.out.println(empID);
	
	emp.setEmpID(65);
	 int empID2=emp.getEmpid();
		System.out.println(empID2);
		
	
	}

}
