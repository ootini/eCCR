package eccr;

public class depthGauge {
    double currentDepthFromSensor, previousDepth, currentDepth, depthDifferential, doubleRate;
    final double[] depthArray1 = {3.00,5.00,7.00,10.00,12.00,15.00,14.00,12.00,11.00,8.00,3.00}; 
    int arrayIndex = 0;
    String velocity;
    int rate, cRate, pRate;
    
    
    //Obviously this is only a test, depth will be sampled at a rate of 250ms using a piezo sensor.(MS5541C MINIATURE 14 bar MODULE)
    //For testing purposes I will probably just read a file full of sample data.
    public double getCurrentDepth(){
        //sample the depth sensor and write the value to double currentDepth.
        //Fake depth descender for testing purposes.

        currentDepthFromSensor = depthArray1[arrayIndex];
        //System.out.println(currentDepthFromSensor);
        return currentDepthFromSensor;
        
    }
    
    public void sampleDepthInDive(){
        
        //Instantiate statusManager
        statusManager newstatusManager = new statusManager();
        String diveStatus = newstatusManager.getStatus(); 
        //System.out.println(diveStatus);
        getCurrentDepth();
        String dynamic;

        while (diveStatus.equals("Diving")){
            //
            //Assign currentDepth value to previousDepth then sample depth using getCurrentDepth to poll the sensor
            //
            previousDepth = currentDepth;
            currentDepth = getCurrentDepth();
            System.out.println("Previous Depth: "+previousDepth);
            System.out.println("Latest Depth: "+currentDepth);
            
            
            //Calculate descent or ascent (including rate)
            depthDifferential = previousDepth - currentDepth;
            //System.out.println("Difference: "+depthDifferential);
            //Rates are calculate assuming depth is sampled every 20 seconds.
            doubleRate = depthDifferential * 3;
            rate = (int) doubleRate;
            System.out.println("Previous rate: "+pRate);
            if (rate < 0){
                rate = -rate;
                cRate = rate;
                System.out.println("Descent rate: "+rate+" meters per minute.");
                System.out.println("Latest rate: "+cRate);
            }
            else
            {
                if (rate > 9){
                    cRate = rate;
                    System.out.println("WARNING - FAST ASCENT!!!");
                }
                System.out.println("Ascent rate: "+rate+" meters per minute.");
                System.out.println("Latest rate: "+cRate);
            }
            
            
            if (cRate > pRate){
                dynamic = "Accelerating";
            }
            else if (cRate < pRate){
                dynamic = "Deccelerating";
            }
            else {
                dynamic = "Same";
            }
            System.out.println(dynamic);
            System.out.println("");
            
            //Depth sample rate using sleep, currently set at 1 second for speed during testing. For practical application set to 20000 or 20 seconds.
            try{ 
                Thread.sleep(100); // Sleep for 1 sec 
            } 
            catch(InterruptedException e){}
            arrayIndex++;
            pRate = cRate;
        }

    }
}
