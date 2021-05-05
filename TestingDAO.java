package com.deptforJSP;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.exception.DepartmentAlreadyExistException;

public class TestingDAO {
	DepartmentDAOImpl daoObj= new DepartmentDAOImpl();
	Department dpt = new Department();
	    @Test
        public void insertTest() {
        	dpt.setDepartmentNumber(80);
        	dpt.setDepartmentName("CODING");
        	dpt.setDepartmentLocation("SYDNEY");
        	try {
				daoObj.addDepartment(dpt);
			} catch (DepartmentAlreadyExistException e) {
				System.out.println(e.getMessage());
			}
        	dpt=daoObj.findDepartment(80);
        	assertEquals("CODING", dpt.getDepartmentName());
        	assertEquals("SYDNEY", dpt.getDepartmentLocation());
        	assertEquals(80, dpt.getDepartmentNumber());
   }

	    	    @Test
	            public void selectTest() {
	            	dpt=daoObj.findDepartment(80);
	            	assertEquals("CODING", dpt.getDepartmentName());
	            	assertEquals("SYDNEY", dpt.getDepartmentLocation());
	            	assertEquals(80, dpt.getDepartmentNumber());
	       }
}
