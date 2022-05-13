package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi: " + message);
		
	}
	//Logger'ı SmsLogger'a uyarla.
	

}
