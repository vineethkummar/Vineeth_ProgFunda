package com.gradedproject.q1;

public class Main {
	public static void main(String[] args) {
		
		AdminDepartment admindept = new AdminDepartment();
		HrDepartment hrdept = new HrDepartment();
		TechDepartment techdept = new TechDepartment();
		
		System.out.println("Welcome to " + admindept.departmentName());
		System.out.println(admindept.getTodayWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday()+"\r\n");
		
		System.out.println("Welcome to " + hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday()+"\r\n");
		
		System.out.println("Welcome to " + techdept.departmentName());
		System.out.println(techdept.getTodayWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday()+"\r\n");
		
	}

}
