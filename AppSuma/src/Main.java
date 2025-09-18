//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Sumas
        int a,b;

        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b"));
        System.out.println("la suma da: "+ (a+b) );

        double x,y;

        x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x"));
        y=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de y"));
        System.out.println("la suma da: "+ (x+y) );
    }
}