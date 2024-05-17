import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {


    public class ParametroInvalidosException extends Exception {
        public ParametroInvalidosException(String message) {
            super(message);
        }
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
        
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws InputMismatchException {
        
        if (parametroUm >= parametroDois) {
            throw new InputMismatchException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
