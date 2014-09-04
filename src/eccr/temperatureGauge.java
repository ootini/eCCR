package eccr;

public class temperatureGauge {
    
    //Obviously this is only a test, depth will be sampled at a rate of 250ms using a piezo sensor.(MS5541C MINIATURE 14 bar MODULE)
    //For testing purposes I will probably just read a file full of sample data.
    public double getCurrentTemp(){
        double currentTemp;
        currentTemp = 19.50;
        return currentTemp;
    }
    
}
