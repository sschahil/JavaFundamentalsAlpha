
public class EmployeeTest {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.printf("Employees before instantiation: %d\n", 
				Employee.getCount());
		
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		System.out.println("\nEmployees after instaniation: ");
		System.out.printf("via e1.getCount(): %d\n", e1.getCount() );// poor programming practice
		System.out.printf("via e2.getCount(): %d\n", e2.getCount() );// poor programming practice
		System.out.printf("via Employee.getCount(): %d\n", Employee.getCount() );	
		
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n", 
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName() );
		
		e1 = null;
		e2 = null;
		
		System.gc(); // not a good programming practice 
		
		System.out.printf("\nEmployees after System.gc(): %d\n", Employee.getCount() );
	}
}
