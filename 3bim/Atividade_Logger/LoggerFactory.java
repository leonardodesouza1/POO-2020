
public abstract class LoggerFactory {

	private static LoggerFactory instance;
	
	protected LoggerFactory() {}
	public static synchronized LoggerFactory getInstance() {
		if (instance == null) {
			instance = new ConcreteLoggerFactory();
		}
		return instance;
	}
	public abstract Logger createConsoleLogger();
	public abstract Logger createFileLogger();

}
