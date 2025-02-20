package PrimeiroNivelJava.Desafio;

import java.util.Scanner;

public class SistemaDeCadastro {
    public static void main(String[] args) {

        /*
        * Sistema de Cadastro de Clientes para um Negócio Local
        Imagine que você foi contratado para gerenciar o cadastro de clientes de uma loja de eletrônicos. Sua missão é criar um sistema simples em Java para:
        ✅ Cadastrar novos clientes (armazenando seus nomes).
        ✅ Listar todos os clientes cadastrados.
        ✅ Gerenciar o fluxo do sistema por meio de um menu interativo.

        Tópicos utilizados:
        🔹 PimeiroNivel.PimeiroNivel.TipoDeDado.TipoDeDado.Arrays → Para armazenar os nomes dos clientes.
        🔹 Switch Case → Para criar um menu interativo de opções.
        🔹 Loops → Para permitir a navegação no menu e percorrer os clientes cadastrados.
        🔹 Condicionais → Para validar cadastros e evitar ultrapassar o limite da lista.
        🔹 Scanners → Para ler entradas do usuário via teclado ou outras fontes, como arquivos e strings.*/

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Define o tamanho da Array caso queira colocar mais clientes
        int NUM_MAX = 3;
        String[] CadastroCliente = new String [NUM_MAX];
        String[] NumeroCliente = new String[NUM_MAX];
        boolean[] menssagem = new boolean[NUM_MAX];

        //Contadores
        int ClientesCadastrado = 0;
        int opcao = 0;

        while (opcao !=3) {
            //Menu
            System.out.println("\n----- Menu de usuarios -----");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuário");
            System.out.println("3 - Sair");

            // Captura a opção
            opcao = scanner.nextInt();

            // Consome a quebra de linha
            scanner.nextLine();

            switch (opcao){

                case 1:
                    //Cadastra até o limite da array
                    if (ClientesCadastrado < NUM_MAX) {
                        System.out.println("Digite o nome do Cliente: ");
                        String NomeCliente = scanner.nextLine();

                        //Código armazena o nome de um cliente no array CadastroCliente, em uma posição específica definida pela variável ClientesCadastrado.
                        CadastroCliente[ClientesCadastrado] = NomeCliente;

                        System.out.println("Digite o número de celular: ");
                        NumeroCliente[ClientesCadastrado] = scanner.nextLine();

                        System.out.println("Deseja receber avisos de oferta por mensagem?  \n1 - Sim\n2 - Não ");
                        int opcaoMenssagem = scanner.nextInt();
                        scanner.nextLine();

                        // Usa um ternário mais compreensível com mensagens extraídas para variáveis
                        menssagem[ClientesCadastrado] = (opcaoMenssagem == 1);

                        ClientesCadastrado++;
                        System.out.println("Cadastro realizado com sucesso!");
                    }
                    else {
                        System.out.println("Numero de clientes máximo cadastrados atingidos");
                        break;
                    }
                    break;

                case 2: {
                    if (ClientesCadastrado == 0) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        System.out.println("---------- Lista de Cliente Cadastrados ----------");

                        //Percorre todo array listando todos nomes guardados, se nao houver vai aparecer null.
                        for (int i = 0; i < CadastroCliente.length ; i++) {
                            // Verifica se há um valor válido
                            if (CadastroCliente[i] != null) {
                            System.out.println("Cliente: " + CadastroCliente[i]);
                            System.out.println("Telefone: " + NumeroCliente[i]);
                            System.out.println("Cliente deseja receber ofertas: " + (menssagem[i] ? "Sim" : "Não"));
                            System.out.println("-----------------------------------------------");
                            }
                        }
                    }
                    break;
                } 
                //Sai da lista
                case 3:{
                    System.out.println("Saindo...");
                    break;
                }
                // Se o usuário nao digitar diferente das opções propostas
                default:
                    System.out.println("Ésta opção é inválida.");
                }

            }


        }







    }

