package eccr;
import javax.swing.JOptionPane;

public class gasManager{
    public double dil_o2, dil_n, dil_he;
    public final int o2 = 100;
    public int sacRate;

    public void setGasses(){
        //Mix details, user input. Pure O2 is obviously hard coded as 100%.
        dil_o2 = Integer.parseInt(JOptionPane.showInputDialog("Diluent o2 percentage in use?"));
        
        dil_he = Integer.parseInt(JOptionPane.showInputDialog("Diluent He percentage in use?"));
        
        dil_n = 100 - (dil_o2 + dil_he);
        
        System.out.println("Oxygen content: "+dil_o2+". Helium content: "+dil_he+". Nitrogen content: "+dil_n);    
    }
    
    public void setSacRate(){
        sacRate = Integer.parseInt(JOptionPane.showInputDialog("SAC Rate in litres / minute?"));
    }

}