import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {

        int num1,num2,totalSuma,totalResta,totalMultiplicacion,totalDivision;
        double nm1,nm2,totalS,totalR,totalM,totalD;

        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el dato 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el dato 2"));

        totalSuma=num1+num2;
        totalResta=num1-num2;
        totalMultiplicacion=num1*num2;
        totalDivision=num1/num2;

        System.out.println("la suma es: "+ totalSuma );
        System.out.println("la resta es: "+ totalResta );
        System.out.println("la multiplicación es: "+ totalMultiplicacion );
        System.out.println("la división es: "+ totalDivision );

        nm1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para el dato 1"));
        nm2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para el dato 2"));

        totalS=nm1+nm2;
        totalR=nm1-nm2;
        totalM=nm1*nm2;
        totalD=nm1/nm2;

        System.out.println("la suma es: "+ totalS );
        System.out.println("la resta es: "+ totalR );
        System.out.println("la multiplicación es: "+ totalM );
        System.out.println("la división es: "+ totalD );
    }
}