//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //for
        int numFor;
        numFor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tabla"));
        for(int i = 0; i <= 10; i++){
            System.out.println( (numFor * i) );
        }

        //Selecion simple
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero deseado"));

        //Validar si número es mayor a cero
        if(numero == 0){
            System.out.println("El numero es 0");
        }//seleccion doble
        else if(numero > 0 ){
            System.out.println("El numero es mayor a 0");
        }//Selección multiple
        else{
            System.out.println("El numero es menor a 0");
        }

        //Switch
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del 1 al 5"));
        switch(num){
            case 1:
                System.out.println("El numero es 1");
                break;
                case 2:
                    System.out.println("El numero es 2");
                    break;
                    default:
                        System.out.println("El numero es diferente al 1 al 5");
        }

        System.out.println("Finish program");

        //While
        int numWhile = 1;
        int numeroWhile;
        numeroWhile = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del cual quiere que se cuente"));
        while(numWhile <= numeroWhile){
            System.out.println("El numero es mayor a " + numWhile);
            numWhile++;
        }

        //Do While
        int numeroDoWhile;

        do{
            numeroDoWhile = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del 1 al 5"));
            switch(numeroDoWhile){
                case 1:
                    System.out.println("Hola mundo");
                    break;
                case 2:
                    System.out.println("Good Monrning");
                    break;
                case 3:
                    System.out.println("Good Monrning");
                    break;
                case 4:
                    System.out.println("Good Monrning");
                    break;
                case 5:
                    System.out.println("Good Monrning");
                    break;
            }
        }while(numeroDoWhile!=5);
    }
}