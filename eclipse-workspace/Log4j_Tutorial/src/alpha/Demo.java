package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		log.info("the object is present");
		log.error("the object is not present");
		log.fatal("this is fatal");

	}

}