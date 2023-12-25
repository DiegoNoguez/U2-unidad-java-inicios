package ARTURO_u2;
public class Canicas {
    public static void main(String[]arturo){
      byte mo=100;
      byte an=58;
      double tc;
      double r;
      double az;
      double w;
      double p;
      double b;
      tc=(mo+an);
      r=(tc*0.13);
      az=(tc-r)*0.22;
      w=(tc-az)*0.10;
      p=(tc-w)*0.35;
      b=(tc-r-az-w-p);
      System.out.println("Las canicas que tiene Carlitos por color son "
              + "las siguientes");
      System.out.println("Rojas: "+r);
      System.out.println("Azules: "+az);
      System.out.println("Agûitas: "+w);
      System.out.println("Pochitas: "+p);
      System.out.println("Bombochas: "+b);
    }
}
