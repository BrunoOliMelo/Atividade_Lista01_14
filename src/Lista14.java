import java.util.Scanner;

public class Lista14 {
    public static void main(String[] args) {
        double peso, excesso, multa;
        final double LIMITE_PESO = 50.0;
        final double PRECO_MULTA = 4.0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o peso dos peixes: ");
        peso = entrada.nextDouble();
        
        if (peso > LIMITE_PESO) {
            excesso = peso - LIMITE_PESO;
            multa = excesso * PRECO_MULTA;
            System.out.printf("Peso excedente: %.2f kg\n", excesso);
            System.out.printf("Valor da multa: R$ %.2f\n", multa);
        } else {
            System.out.println("Peso dentro do limite.");
        }
        
        entrada.close();
    }
}

