package test;

import java.util.Scanner;

public class StudentList {
	Scanner scan = new Scanner(System.in);
	protected Student[] student; 
	
	public StudentList() {
		student = new Student[0];
		
	}
	public void add(Student s) {
		Student[] tmpArr = new Student[student.length];
		for(int i=0;i<student.length;i++) {
			tmpArr[i] =student[i];
		}
		tmpArr[student.length] =s;
		student = tmpArr;
		
		System.out.println("추가되었습니다.");
	}
	public void delete(String delete) {
		
		String name  =scan.next();
		boolean isDelted = false;
		
		Student[] tmpArr = new Student[student.length-1];
		int j=0;
		for(int i=0;i<student.length;i++) {
			isDelted =true;
		if(student[i].getName().equals(name)&&!isDelted) {
		}
		
		
		
		
	}
	}}
