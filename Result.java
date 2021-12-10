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


        
         List<String> instruccion= Arrays.asList(u,r,r,u);


         Result.calcularMaximoRetorno(instruccion)
         .stream()
         .forEach(System.out::println);

          
    }


    public static List<Integer> calcularMaximoRetorno(List<String> instruccion){
        
        List<Integer> ruta = new ArrayList<>();

        instruccion.stream()
        .map(x-> Integer.parseInt(x))
        .forEach(ruta::add);

        return ruta;
    }
}
