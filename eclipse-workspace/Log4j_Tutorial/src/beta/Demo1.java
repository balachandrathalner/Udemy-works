package beta;


import org.apache.logging.log4j.*;
public class Demo1 {

	private static Logger log=(Logger) LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("iam debugging demo1");
		
		log.info("object is present in demo1");
		
		log.error("object is not present in demo1");
		log.fatal("this is fatal ......demo1");
		

	}

}
