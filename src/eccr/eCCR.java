package eccr;

import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dave
 */
public class eCCR {
     
     public static void main(String[] args) throws IOException {  
        //Instantiate cellReaderManager

         cellReaderManager newCellReaderManager = new cellReaderManager();
         newCellReaderManager.manageCells();


                 
         //Instantiate depthGauge

         depthGauge newDepthGauge = new depthGauge();
         newDepthGauge.sampleDepthInDive();
         
         
     }
}
