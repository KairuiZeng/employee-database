/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author home
 */
public class TestHashTable {

	public static void main(String[] args) {
		
		MyHashTable testTable = new MyHashTable(10);
		
		//testTable.displayContents();
		testTable.removeEmployee(0);
		
		EmployeeInfo someEmployee;
		someEmployee = new EmployeeInfo(2, "Kairui", "Zeng", 0, 1, 0.3);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(12, "Gary", "Liu", 1, 1, 0.3);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(10, "Yash", "Malik", 0, 2, 0.2);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(6, "George", "Yu", 0, 1, 0.3);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(34, "Eric", "Zhai", 1, 0, 0);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(9, "Jerry", "Yang", 0, 3, 0.1);
		testTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(7, "David", "Lu", 0, 4, 0.5);
		testTable.addEmployee(someEmployee);
		
		//testTable.displayContents();
		
		testTable.searchNumber(12);
		testTable.searchNumber(2);
		
		testTable.removeEmployee(34);
		testTable.removeEmployee(100);
		testTable.removeEmployee(6);
		testTable.removeEmployee(7);
		testTable.removeEmployee(9);
		testTable.removeEmployee(10);
		
		//testTable.displayContents();
	}
}
