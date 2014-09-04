package eccr;

public class configManager {
       
    public void basicGasConfiguration(){
        
        //Instantiate GasManager
        gasManager newGasManager = new gasManager();
        newGasManager.setGasses();
    }
    
    public void basicSacConfiguration(){
        
        //Instantiate GasManager
        gasManager newGasManager = new gasManager();
        newGasManager.setSacRate();
    }


    public void setPointLimitConfiguration(){
         
        //Instantiate setPointManager
        setPointManager newSetPointManager = new setPointManager();
        newSetPointManager.defineMinSetPoint();
        newSetPointManager.defineMaxSetPoint();
        
    }
    
    public void depthLimits(){
        int maxDepthLimit = 100;
    }
}
