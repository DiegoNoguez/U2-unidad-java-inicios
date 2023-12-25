package ARTURO_u2;
import javax.swing.JOptionPane;
public class NumeroMayor {
    public static void main(String[]arturo){
        short a;
        short b;
        short c;
        System.out.println("Ingresa tres numeros por favor");
        a=Short.parseShort(JOptionPane.showInputDialog("Ingresa el "
                + "primer número"));
        b=Short.parseShort(JOptionPane.showInputDialog("Ingresa el numero"
                + " segundo número"));
        c=Short.parseShort(JOptionPane.showInputDialog("Ingresa número "
                + " el tercer número"));
        if (a>b){
            if (b<a){
                System.out.println("El nùmero mayor es: "+a);
            }
        }
        if (b>a){
            if (b>c){
                System.out.println("El nùmero mayor es: "+b);
            }
        }
        if (c>a){
            if (c>b){
                System.out.println("El nùmero mayor es: "+c);
            }
        }
        if(a==b){
                if(b==c){
                    System.out.println("Los tres numeros son iguales");
                }
            }
    }
}
