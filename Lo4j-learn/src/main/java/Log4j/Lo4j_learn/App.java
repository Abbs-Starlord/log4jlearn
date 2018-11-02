package Log4j.Lo4j_learn;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
	public static void main( String[] args )
    {
        //PropertyConfigurator.configure("log4j.properties");
        
		System.out.println( "Hello World!" );
        
        logger.warn("Warning");
        logger.info("INFO");
        logger.error("ERROR");
        logger.debug("DEBUG");
        logger.fatal("FATAL");
        
    }
}
