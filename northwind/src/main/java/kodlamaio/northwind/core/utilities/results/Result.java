package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;	
	}
	public Result(boolean success,String message) {
		this.success = success;	
		this.setMessage(message);
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

