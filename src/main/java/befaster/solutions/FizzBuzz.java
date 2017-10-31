package befaster.solutions;

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
        	output = addToOutput(output, FIZZ);
        }
        
        if (number % 5 == 0 || numberContainsDigit(number, "5")) {
        	output = addToOutput(output, BUZZ);
        }
        
        if (numberIsDeluxe(number)) {
        	output = addToOutput(output, DELUXE);
        }
        
        if (output.equals("")) {
        	output = number.toString();
        }
        
        return output;
    }
    
    private static String addToOutput(String output, String addition) {
    	if (output.equals("")) {
    		return addition;
    	}
    	
    	return output + " " + addition;
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
    
    public static boolean numberIsDeluxe(Integer number) {
    	if (number < 10) {
    		return false;
    	}
    	
    	char[] nums = number.toString().toCharArray();
    	
    	for (char num : nums) {
    		if (num != nums[0]) {
    			return false;
    		}
    	}
    	
    	return true;
    }

}
