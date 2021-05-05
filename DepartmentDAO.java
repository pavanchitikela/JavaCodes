package com.deptforJSP;

import java.util.List;

import com.exception.DepartmentAlreadyExistException;
import com.exception.DepartmentCannotDeleted;

public interface DepartmentDAO {

	void addDepartment(Department dRef) throws DepartmentAlreadyExistException;		//	C - add - insert
	Department findDepartment(int dno);			//  R - find - select
	List<Department> findDepartments();			//  R - find - select all
	void modifyDepartment(Department dRef);		//  U - modify - update
	void removeDepartment(Department dRef) throws DepartmentCannotDeleted;     
}
