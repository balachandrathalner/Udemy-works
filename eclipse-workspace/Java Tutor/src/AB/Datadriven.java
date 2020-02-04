package AB;

import org.apache.logging.log4j.*;
public class Datadriven {


	private static Logger log=LogManager.getLogger(Datadriven.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("balachandra");
log.debug("iam debugging Datadriven  of AB");
log.info("object is present");
log.error("object is not present");
log.fatal("this is fatal");

		
	}

}
