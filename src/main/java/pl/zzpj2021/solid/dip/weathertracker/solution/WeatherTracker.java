package pl.zzpj2021.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    Notifier notifier;

    public WeatherTracker(Notifier notifier) {
        this.notifier = notifier;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        notifier.generateWeatherAlert(weatherDescription);
    }
}
