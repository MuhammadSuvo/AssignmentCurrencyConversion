package currencyCalculations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Class {
	
	private static Logger logger = LogManager.getLogger(log4j2Class.class);
	
	public static void implementlog4j() {
		
		logger.info("This is information messages");
		logger.error("This is Error Message");
		logger.warn("This is Warning Message");
	}

}
