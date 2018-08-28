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
public class FullTimeEmployee extends EmployeeInfo{
	private double yearlySalary;
	
	public FullTimeEmployee (int number, String fN, String lN, int gender, int workplace, double dRate, double salary) {
		super(number, fN, lN, gender, workplace, dRate);
		yearlySalary = salary;
	}
	
        public double calcGross(){
            return yearlySalary;
        }
        
	public double calcNet() {
		double netIncome = yearlySalary*(1-deductionsRate);
		return netIncome;
	}
        
        public double getSalary(){
            return yearlySalary;
        }
}
