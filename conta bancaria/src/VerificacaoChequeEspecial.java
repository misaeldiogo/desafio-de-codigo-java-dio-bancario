import java.util.Scanner;

public class VerificacaoChequeEspecial{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("digite o valor do saque:");
        double saque = scanner.nextDouble();

        double cheque_especial = 500;
        double limite_total = (saldo + cheque_especial);

        if (saque > saldo){

            double diferenca_saque = (saque - saldo);
            if (diferenca_saque <= cheque_especial){
            cheque_especial -= diferenca_saque;

            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            System.out.println("Saldo Cheque Especial: " + "R$ " + cheque_especial);
            }else{
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");}
   
        }else if(saque > limite_total){
            
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");

        }else{
            System.out.println("Transação realizada com sucesso.");
        } 
       
    }
}