package befaster.solutions;

import org.apache.commons.codec.binary.StringUtils;

public class Hello {
    public static String hello(String friendName) {
    	if (friendName == null || friendName.trim().equals("")) {
    		friendName = "world";
    	} else {
    		friendName = friendName.trim();
    	}
    	
        return "Hello " + friendName;
    }
}
