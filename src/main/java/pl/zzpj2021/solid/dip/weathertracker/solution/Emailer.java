package pl.zzpj2021.solid.dip.weathertracker.solution;


public class Emailer implements Notifier{
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
