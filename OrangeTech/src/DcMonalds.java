
import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        listaIngredientes = ingredientes.split(";");

        String ingrediente1 = listaIngredientes[0];
        String ingrediente2 = listaIngredientes[1];
        String ingrediente3 = listaIngredientes[2];
        String ingrediente4 = listaIngredientes[3];

        String saida = String.format("%s\n%s\n%s\n%s", ingrediente1, ingrediente2, ingrediente3, ingrediente4);

        System.out.println(saida);



    }
}