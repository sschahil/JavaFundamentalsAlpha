
public class LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional AND (&&)", 
				"false && false", (false && false),
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true", (true && true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional OR (||)", 
				"false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true", (true || true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logical AND (&)", 
				"false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true", (true & true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logical inclusive OR (|)", 
				"false && false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true", (true | true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logical exclusive OR (^)", 
				"false ^ false", (false ^ false),
				"false ^ true", (false ^ true),
				"true ^ false", (true ^ false),
				"true ^ true", (true ^ true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n\n",
				"Logical NOT (!)", "!false", (!false), "!true", (!true) );
	}

}
