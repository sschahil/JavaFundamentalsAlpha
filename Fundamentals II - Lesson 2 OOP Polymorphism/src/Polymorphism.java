
public class Polymorphism {
	
	public static void main(String[] args) {
		
		CommissionEmployee3 commissionEmployee = new CommissionEmployee3(
				"Sue", "Jones", "222-22-2222", 10000, .06 );
		
		BasePlusCommissionEmployee4 basePlusCommissionEmployee = new BasePlusCommissionEmployee4(
				"Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		System.out.printf("%s %s:\n\n%s\n\n",
				 "Call CommissionEmployee3's toString with superclass reference ", 
				 "to superclass object", commissionEmployee.toString() );
		
		System.out.printf("%s %s:\n\n%s\n\n",
				 "Call BasePlusCommissionEmployee4's toString with subclass", 
				 "refeerence to subclass object", basePlusCommissionEmployee.toString() );
		
		CommissionEmployee3 commissionEmployee2 = basePlusCommissionEmployee;
		
		System.out.printf("%s %s:\n\n%s\n\n",
				 "Call BasePlusCommissionEmployee4's toString with superclass ", 
				 "reference to subclass object", commissionEmployee2.toString() );
		
	}
	
}
