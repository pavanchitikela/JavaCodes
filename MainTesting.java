package com.deptforJSP;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTesting {

	public static void main(String[] args) {
		Result result= JUnitCore.runClasses(TestingDAO.class);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure);
		}
		System.out.println("status : "+result.wasSuccessful());
	}

}