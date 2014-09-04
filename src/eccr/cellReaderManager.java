package eccr;

class cellReaderManager{
    public static void manageCells(){
       
        cellReader cellReader1 = new cellReader(1);
        cellReader cellReader2 = new cellReader(2);
        cellReader cellReader3 = new cellReader(3);

        while(cellReader1.hasNext() && cellReader2.hasNext() && cellReader3.hasNext()){
            System.out.println("cell 1:"+cellReader1.readCell());
            System.out.println("cell 2:"+cellReader2.readCell());
            System.out.println("cell 3:"+cellReader3.readCell());
            try{ 
                Thread.sleep(1000); // Sleep for 1 sec 
            } 
            catch(InterruptedException e){}
        }
    }
}