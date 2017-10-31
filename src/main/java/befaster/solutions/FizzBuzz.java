package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
	
	public static final String FIZZ = "fizz";
	public static final String BUZZ = "buzz";
	public static final String DELUXE = "deluxe";
	public static final String FIZZBUZZ = "fizz buzz";
	public static final String FIZZDELUXE = "fizz deluxe";
	public static final String BUZZDELUXE = "buzz deluxe";
	public static final String FIZZBUZZDELUXE = "fizz buzz deluxe";

    public static String fizzBuzz(Integer number) {
    	String output = "";
    	
        if (number % 3 == 0 || numberContainsDigit(number, "3")) {
        	output += FIZZ;
        }
        
        if (number % 5 == 0 || numberContainsDigit(number, "5")) {
        	output += BUZZ;
        }
        
        if (output.equals(FIZZ+BUZZ)) {
        	output = FIZZBUZZ;
        } else if (output.equals("")) {
        	output = number.toString();
        }
        
        return output;
    }
    
    public static boolean numberContainsDigit(Integer number, String digit) {
    	char[] nums = number.toString().toCharArray();
    	char[] digits = digit.toCharArray();
    	
    	for (char num : nums) {
    		if (num == digits[0]) {
    			return true;
    		}
    	}
    	
    	return false;
    }

}
