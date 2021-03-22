package pl.zzpj2021.solid.isp.contactbook.solution;

class Emailer implements EmailCall {

	public void sendMessage(Contact emailable, String subject, String body) {
		
		String emailAddress = emailable.getEmailAddress();
		sendEmail(emailAddress, subject, body);
	}


	public void sendEmail(String emailAddress, String subject, String body) {
		System.out.println("Do: " + emailAddress + "\n Temat:" + subject + "\n Treść: " + body);
	}
}