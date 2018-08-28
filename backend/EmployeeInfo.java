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
public class EmployeeInfo {
	
	/*** Attributes  ***/
    protected int employeeNum;
    protected String employeeFN;
    protected String employeeLN;
    protected int sex;				//	0 for males, 1 for females
    protected int workLocation;			//	Based off of regions in GTA.
						//	0 for Toronto, 1 for Peel, 2 for York, 3 for Durham, 4 for Halton.
    protected double deductionsRate;		//	Deductions rate will be in decimals
	
	/***  Constructor  ***/

    public EmployeeInfo (int number, String fN, String lN, int gender, int workplace, double dRate) {
	employeeNum = number;
	employeeFN = fN;
	employeeLN = lN;
	sex = gender;
	workLocation = workplace;
	deductionsRate = dRate;
		
    }
	
	/***  Methods  ***/
	
    public int getNumber() {
	return employeeNum;
    }
	
    public String getFN() {
	return employeeFN;
    }

    public String getLN() {
	return employeeLN;
    }
	
    public int getSex() {
    	return sex;
    }
	
    public int getPlace() {
	return workLocation;
    }
    
    public double getRate(){
        return deductionsRate;
    }
    
    public String getStringSex(int genderVal){
        if (genderVal == 0) {
            return "Male";
        }
        else if (genderVal == 1) {
            return "Female";
        } else {
            return "Other";
        }
    }
    
    public String getStringPlace(int location){
        String place;
	
        switch(location){
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
            default:
                place = "Not defined";
                break;
        }
        return (place);
    }
}

