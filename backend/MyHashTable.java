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

import java.util.*;

public class MyHashTable {
	
    //Attributes
    private ArrayList<EmployeeInfo>[] buckets;
    private int storedEmployees = 0;

    //Constructor
    public MyHashTable(int howManyBuckets) {

	buckets = new ArrayList[howManyBuckets];
	for (int i = 0; i < howManyBuckets; i++) {
		buckets[i] = new ArrayList();
	}
    }

    //Methods
    public int chooseBucket(int keyValueNum) {
	return(keyValueNum % buckets.length);
    }
	
    public boolean addEmployee(EmployeeInfo theEmployee) {
	int place = chooseBucket(theEmployee.getNumber());
	buckets[place].add(theEmployee);
	storedEmployees ++;
	return true;
    }
	
    public EmployeeInfo searchNumber(int employeeNum) {
	int place = chooseBucket(employeeNum);
	int bucketSize = buckets[place].size();
	for (int i = 0; i < bucketSize; i++) {
		int number = buckets[place].get(i).getNumber();
		if (number == employeeNum) {
                    return buckets[place].get(i);
		}
	}
        return null;
    }

    public boolean removeEmployee(int employeeNum) {
	int place = chooseBucket(employeeNum);
	int bucketSize = buckets[place].size();
	for (int i = 0; i < bucketSize; i++) {
            int number = buckets[place].get(i).getNumber();
            if (number == employeeNum) {
		buckets[place].remove(i);
		System.out.println("The employee with ID: " + employeeNum + " has been removed from bucket # " + place + ".");
		storedEmployees --;
		return true;
            } 
        }
        return false;
    }

    public String displayEmployee(EmployeeInfo employee){
	String place;
	
        switch(employee.getPlace()){
            case 0:
                place = "Toronto";
                break;
            case 1:
                place = "Peel";
                break;
            case 2:
                place = "Toronto";
                break;
            case 3:
                place = "York";
                break;
            case 4: 
                place = "Durham";
                break;
            case 5:
                place = "Halton";
                break;
        }
        return ("Employee " + employee.getNumber() + ": " + employee.employeeFN + " " + employee.employeeLN + " works in the " + employee.workLocation + " region.");
    }
    
    public int getCount(){
        return storedEmployees;
    }

    public ArrayList<EmployeeInfo> getBuckets(int bucketNum) {
        return buckets[bucketNum];
    }
	
}

