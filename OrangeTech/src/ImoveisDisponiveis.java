
import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        array = frase.split("/");

        String tipoImovel = array[0];
        String valorAluguel = array[1];
        String disponibilidade = array[2];

        String saida = String.format("Imovel: %s R$%s %s", tipoImovel, valorAluguel, disponibilidade);

        System.out.println(saida);
    }
}