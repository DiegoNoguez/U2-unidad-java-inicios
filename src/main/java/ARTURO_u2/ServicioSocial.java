package ARTURO_u2;
import javax.swing.JOptionPane;
public class ServicioSocial {
    public static void main(String[]arturo){
        float tc;
	double cn=264;
        double b;
	byte  s, s2, s3, s4, s5, s6;
        JOptionPane.showMessageDialog(null,"Ingresa tus creditos por semestre"
        + " teniendo en cuenta que por cada semestre debiste de haber cursado "
        + "un minimo de 18 y un máximo de 34");
        s=Byte.parseByte(JOptionPane.showInputDialog("Primer semestre"));
        s2=Byte.parseByte(JOptionPane.showInputDialog("Segundo semestre"));
        s3=Byte.parseByte(JOptionPane.showInputDialog("Tercer semestre"));
        s4=Byte.parseByte(JOptionPane.showInputDialog("Cuarto semestre"));
        s5=Byte.parseByte(JOptionPane.showInputDialog("Quinto semestre"));
        s6=Byte.parseByte(JOptionPane.showInputDialog("Sexto semestre"));
        tc=s+s2+s3+s4+s5+s6;
        JOptionPane.showMessageDialog(null,"El total de crediitos obtenidos"
        + " hasta este semestre son: "+tc);
        cn=(cn*0.6);
        b=(tc/264)*100;
        JOptionPane.showMessageDialog(null,"Tu porcentaje de creditos es: "+b);
        if(tc>=cn){
            JOptionPane.showMessageDialog(null,"Felicidades cumples con todos"
                    + " los requisitos para realizar servicio social");
        }else{ 
            JOptionPane.showMessageDialog(null,"Lastimosamente no cumples con "
                    + "los requisitos minimos para hacer servicio social");
        }
    }
}
