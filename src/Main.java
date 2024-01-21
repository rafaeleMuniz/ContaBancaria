import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dadosBancarios;
        dadosBancarios = """
                ************************************************
                Dados iniciais do cliente:
                                
                Nome: Jacqueline Oliveira
                Tipo de conta: Corrente
                Saldo Inicial: R$2500,00
                ************************************************
                """;
        System.out.println(dadosBancarios);
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        double saldo = 2500.00;

        while (menu != 4) {
            System.out.println("OPERAÇÕES\n");
            System.out.println("1 - Consultar saldos;");
            System.out.println("2 - Receber valor;");
            System.out.println("3 - Transferir valor;");
            System.out.println("4 - Sair.");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("O saldo atual é de R$" + saldo);
            } else if (menu == 2) {
                System.out.println("Informe o valor que deseja receber: ");
                double valorRecebido = scanner.nextDouble();
                saldo = saldo + valorRecebido;
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (menu == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferido = scanner.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                } else {
                    saldo = saldo - valorTransferido;
                    System.out.println("Você transferiu R$ " + valorTransferido + ". Seu saldo é de R$ " + saldo);
                }
            } if (menu > 4){
                  System.out.println("OPÇÃO INVÁLIDA\n");
            }
            }
        }
    }

   //https://github.com/alura-cursos/2858-java-desafio/blob/d351c37a10db3b091100a68b337c8ec2b620b3a3/src/Desafio.java - Resolução ALURA
