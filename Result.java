package Robot_en_Marte;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
        
    public static void main(String[] args) {

         String r = "1"; //R
         String l = "2"; //L
         String u = "3"; //U
         String d = "4"; //D


        
         List<String> instruccion= Arrays.asList(r,u,d,r);

        
         Result.calcularMaximoRetorno(instruccion)
         .stream()
         .map(x -> String.valueOf(x))
         .forEach((x) ->{
            switch (x) {
                case "1":
                    System.out.println("R");
                    break;
                case "2" :
                    System.out.println("L");
                    break;
                case "3" :
                    System.out.println("U");
                    break;
                case "4" :
                    System.out.println("D");
                    break;
                default:
                    break;
            }
         });
     
    }


    public static List<Integer> calcularMaximoRetorno(List<String> instruccion){
        
        List<Integer> ruta = new ArrayList<>();

        instruccion.stream()
        .map(x-> Integer.parseInt(x))
        .forEach(ruta::add);

        return ruta;
    }
}
