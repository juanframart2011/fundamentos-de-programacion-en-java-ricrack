//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //declarar variabñes
        int numeroEntero;
        String cadenaCaractereres;

        numeroEntero = 10;
        cadenaCaractereres = "Hola mundo";

        numeroEntero = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Ingresa un valor númerico entero")
        );

        cadenaCaractereres = JOptionPane.showInputDialog(null,"Ingresa un valor String");

        System.out.println("El número de entero es: " + numeroEntero);
        System.out.println("La cadena de caráctereres es: " + cadenaCaractereres);

    }
}