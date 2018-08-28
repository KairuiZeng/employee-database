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
public class PartTimeEmployee extends EmployeeInfo {
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	public PartTimeEmployee (int number, String fN, String lN, int gender, int workplace, double dRate, double wage, double perWeek, double perYear) {
		super(number, fN, lN, gender, workplace, dRate);
		hourlyWage = wage;
		hoursPerWeek = perWeek;
		weeksPerYear = perYear;
	}
	
        public double calcGross(){
            double grossIncome = (hourlyWage * hoursPerWeek * weeksPerYear);
		return grossIncome;
        }
        
	public double calcNet() {
		double netIncome = (hourlyWage * hoursPerWeek * weeksPerYear)*(1-deductionsRate);
		return netIncome;
	}
        
        public double getWage(){
            return hourlyWage;
        }
        
        public double getHours(){
            return hoursPerWeek;
        }
        
        public double getWeeks(){
            return weeksPerYear;
        }
}
