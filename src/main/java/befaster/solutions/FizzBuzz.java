package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
	
	public static final String FIZZ = "fizz";
	public static final String BUZZ = "buzz";
	public static final String FIZZBUZZ = "fizz buzz";

    public static String fizzBuzz(Integer number) {
    	String output = "";
    	
        if (number % 3 == 0) {
        	output += FIZZ;
        }
        
        if (number % 5 == 0) {
        	output += BUZZ;
        }
        
        if (output.equals(FIZZ+BUZZ)) {
        	output = FIZZBUZZ;
        } else if (output.equals("")) {
        	output = number.toString();
        }
        
        return output;
    }

}
