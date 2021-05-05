package com.deptforJSP;

import com.exception.DepartmentAlreadyExistException;

public class DAOTest {

	public static void main(String args[]) {
	Department deptObj1 = new Department();
	
	deptObj1.setDepartmentNumber(55);
	deptObj1.setDepartmentName("CODING");
	deptObj1.setDepartmentLocation("New Delhi");
	
	DepartmentDAOImpl ddiObj = new DepartmentDAOImpl(); // driver loaded, connected too
	
	try {
		ddiObj.addDepartment(deptObj1);
	} catch (DepartmentAlreadyExistException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // insert query is hidden inside it
	
	/*
	System.out.println("--------------------------");
	
	Department deptObj1 = new Department();
	
	deptObj1.setDepartmentNumber(55);
	deptObj1.setDepartmentName("Quality");
	deptObj1.setDepartmentLocation("Pune");
	
	DepartmentDAOImpl ddiObj = new DepartmentDAOImpl(); // driver loaded, connected too
	
	ddiObj.modifyDepartment(deptObj1); // udpate query is hidden inside it
	*/
	/*
	Department deptObj1 = new Department();

	deptObj1.setDepartmentNumber(55); //just fill the primary key
	
	DepartmentDAOImpl ddiObj = new DepartmentDAOImpl();
	ddiObj.removeDepartment(deptObj1); // delete is hidden inside it
	*/
	
	/*
	Department deptObj = null;
	DepartmentDAOImpl ddiObj = new DepartmentDAOImpl();
	deptObj = ddiObj.findDepartment(20); // select query hidden in it
	System.out.println("dept number   : "+deptObj.getDepartmentNumber());
	System.out.println("dept name     : "+deptObj.getDepartmentName());
	System.out.println("dept location : "+deptObj.getDepartmentLocation());
	*/
	
	/*
	List<Department> deptList = null;
	
	DepartmentDAOImpl ddiObj = new DepartmentDAOImpl();
	
	deptList = ddiObj.findDepartments(); // select * from dept hidden in it

	Iterator<Department> iter = deptList.iterator();
	
	while(iter.hasNext()) {
		Department deptObj = iter.next();
		System.out.println("dept number   : "+deptObj.getDepartmentNumber());
		System.out.println("dept name     : "+deptObj.getDepartmentName());
		System.out.println("dept location : "+deptObj.getDepartmentLocation());
		System.out.println("--------------------");
	}
	*/
}

}
