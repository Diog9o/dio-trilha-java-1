import java.util.Scanner;

public class ContaTerminal {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int numero = 0;
        int agencia =0;
        double saldo = 5100.50;
        

        System.out.println("nome");
        nome=scanner.nextLine();       

        System.out.println("Digite o Numero da conta: ");
        numero=scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        agencia=scanner.nextInt();

        System.out.println("Saldo disponivel para saque: ");
        saldo = scanner.nextDouble();


        System.out.println("Ola, \n "+ nome + "\nObrigado por ser nosso cliente.");
        System.out.println("Sua a conta é: " + numero +"");
        System.out.println("Sua a agencia é: " + agencia +"");
        System.out.println("Seu saldo para saque é: " + saldo +"");           
        


    }
}
