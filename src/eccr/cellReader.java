package eccr;

public class cellReader {
        
        double cellReading;
        int index;
        final String cArray = "cellArray";
        final double[] cellArray1 = {1.1,1.2,1.2,1.3,1.4,1.3,1.2,1.2};        
        final double[] cellArray2 = {1.2,1.2,1.3,1.4,1.4,1.3,1.1,1.1};        
        final double[] cellArray3 = {1.2,1.3,1.3,1.3,1.3,1.2,1.2,1.1};        
        
        final double[] cellArray;
        
        public cellReader(int arrayNum){
            index = 0;
            switch(arrayNum){
                   
                case 2:
                    this.cellArray = cellArray2.clone();
                    break;
                case 3:
                    this.cellArray = cellArray3.clone();
                    break;
                default: this.cellArray = cellArray1.clone();
            }
        }
        
        public double readCell(){
            return cellArray[index++];
        }

        
        public boolean hasNext(){
            return index <= cellArray.length-1;
        }

            
}