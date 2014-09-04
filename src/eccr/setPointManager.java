package eccr;
import javax.swing.JOptionPane;

public class setPointManager {
    public double maxSetPoint, minSetPoint, setPoint1, setPoint2, setPoint3, setPoint4, setPoint5;
    
        public double defineMaxSetPoint(){
        maxSetPoint = Double.parseDouble(JOptionPane.showInputDialog("Max set point? (rec 1.4)"));
        return maxSetPoint;
    }
    
        public double defineMinSetPoint(){
        minSetPoint = Double.parseDouble(JOptionPane.showInputDialog("Min set point? (rec 0.6)"));
        return minSetPoint;
    }

        public double defineSetPoint1(){
        setPoint1 = Double.parseDouble(JOptionPane.showInputDialog("Set point 1?"));
        return setPoint1;
    }
        public double defineSetPoint2(){
        setPoint2 = Double.parseDouble(JOptionPane.showInputDialog("Set point 2?"));
        return setPoint2;
    }
        public double defineSetPoint3(){
        setPoint3 = Double.parseDouble(JOptionPane.showInputDialog("Set point 3?"));
        return setPoint3;
    }
        public double defineSetPoint4(){
        setPoint4 = Double.parseDouble(JOptionPane.showInputDialog("Set point 4?"));
        return setPoint4;
    }
        public double defineSetPoint5(){
        setPoint5 = Double.parseDouble(JOptionPane.showInputDialog("Set point 5?"));
        return setPoint5;
    }
}