
import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        pessoasNoCamarote = tamanhoDaFila/2;

           if((tamanhoDaFila % 2) != 0 ) {
               pessoasNoCamarote++;
        }
        
        System.out.println(pessoasNoCamarote +" pessoas no camarote");
    }
}