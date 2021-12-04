package Robot_en_Marte;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Result {
        
    public static void main(String[] args) {

         String r = "1"; //R
         String l = "2"; //L
         String u = "3"; //U
         String d = "4"; //D


        
         List<String> instruccion= new LinkedList<String>();

        instruccion.add(u);
        instruccion.add(r);
        instruccion.add(r);
        instruccion.add(u);

        for (Integer list : Result.calcularMaximoRetorno(instruccion)) {
          switch(list){
              case 1:
              System.out.println(list + " = R");
              break;
              case 2:
              System.out.println(list + " = l");
              break;
              case 3:
              System.out.println(list + " = U");
              break;
              case 4:
              System.out.println(list + " = D");
              break;
          }
        }
           
    }


    public static List<Integer> calcularMaximoRetorno(List<String> instruccion){
        
        List<Integer> ruta = new ArrayList<>();

        for (String list : instruccion) {
            ruta.add(Integer.parseInt(list));
        }
        return ruta;
    }
}
