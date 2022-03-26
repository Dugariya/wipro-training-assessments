class Employee extends Person{


	private double annualSalary;
    private	int yearOfJoining;
	private String nationalIn;
	
	Employee( String name,double annualSalary,int yearOfJoining,String nationalIn){
		 super(name);
		 this.annualSalary=annualSalary;
		 this.yearOfJoining=yearOfJoining;
		 this.nationalIn=nationalIn;
	}

	public double getAnnualSalary(){
		return annualSalary;
	}	
	public int getYearOfJoining(){
		return yearOfJoining;
	}
	public String getNationalInsuranceNo(){
		return nationalIn;
	}
	@Override
	public String getName(){
		return name;
	}

	public String toString(){
		return "Employee [ annualSalary = "+ annualSalary +", yearOfJoining= "
		                  + yearOfJoining +" , nationalInsuranceNo = "+ nationalIn 
		                  + ", name  = "+ name +"]";
	}
} 