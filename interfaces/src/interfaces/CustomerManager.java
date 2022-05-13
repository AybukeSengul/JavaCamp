package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	//loosly-tightly coupled
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi. " + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " veri tabanına loglandı");
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//for(Logger logger : loggers) {
			//logger.log(customer.getFirstName());
		//}
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi." +customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
	}
	

}
