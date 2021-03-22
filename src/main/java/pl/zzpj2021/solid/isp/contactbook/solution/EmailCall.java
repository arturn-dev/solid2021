package pl.zzpj2021.solid.isp.contactbook.solution;

public interface EmailCall {

    public void sendEmail(String emailAddress, String subject, String body);
    public void sendMessage(Contact emailable, String subject, String body);

}
