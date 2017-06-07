
public class BasePlusCommissionEmployee2 extends CommissionEmployee2{

	private double baseSalary;
	
	public BasePlusCommissionEmployee2(String first, String last, String ssn, double sales, double rate, double salary) {
		
		//explicit call to superclass CommissionEmployee constructor (this is required)
		super(first, last, ssn, sales, rate);
		
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	public double getBaseSalary() {
		
		return baseSalary;
	}
	
	public double earnings() {
		return baseSalary + (commissionRate + grossSales);
	}
	
	public String toString() {
		
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"base salary", baseSalary);
	}
	
}
