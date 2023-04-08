
import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        int qntDoces = dinheiro * 2;

        System.out.println("O cliente obteve " + qntDoces + " doces");
    }
}