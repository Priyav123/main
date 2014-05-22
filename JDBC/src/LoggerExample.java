import org.apache.log4j.Logger;


public class LoggerExample {

	private static Logger log = Logger.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		log.debug("Hello Logger");
		log.debug("Hello Logger Again");
		
		log.info("This is just for information");
		log.error("This is error");
		for(int i = 0 ; i < 50; i++){
			log.debug("");
		}
	}
}