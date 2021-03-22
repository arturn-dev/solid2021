package pl.zzpj2021.solid.isp.contactbook.solution;

class Dialler implements PhoneCall {

    public void makeCall(Contact dialable) {

    	String telephone = dialable.getTelephone();
        phoneCall(telephone);
    }

    @Override
    public void phoneCall(String telephone) {
        System.out.println("Calling to... " + telephone);
    }
}