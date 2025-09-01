import java.util.Scanner;

public class CambioCal {
    String moedaOrigem;
    String moedaDestino;
    double valorCotacao;
    double resultado;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a moeda de origem?");
        moedaOrigem = leitor.nextLine();

        System.out.println("Qual a moeda de destino?");
        moedaDestino = leitor.nextLine();

        System.out.println("Qual o valor do câmbio de um " + moedaOrigem + " em " + moedaDestino + "?");
        valorCotacao = leitor.nextDouble();

        calcularCambio();
    }

    public void calcularCambio(){
        resultado = 1/valorCotacao;

        mostrarResultado();
    }

    public void mostrarResultado(){

        String valorConversaoComDoisDecimais = String.format("%.2f", resultado);
        System.out.println("1 " + moedaDestino + " = " + valorConversaoComDoisDecimais + " " + moedaOrigem);

        System.out.println("********************");
    }
}
