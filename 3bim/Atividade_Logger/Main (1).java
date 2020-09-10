
public class Main {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getInstance().createConsoleLogger();
		
		logger.message("Ola");
		
		Logger file = LoggerFactory.getInstance().createFileLogger();
		
		file.message("Boa noite");

	}

}
