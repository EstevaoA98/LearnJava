package Desafio;

import com.sun.source.tree.WhileLoopTree;

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
        🔹 Arrays → Para armazenar os nomes dos clientes.
        🔹 Switch Case → Para criar um menu interativo de opções.
        🔹 Loops → Para permitir a navegação no menu e percorrer os clientes cadastrados.
        🔹 Condicionais → Para validar cadastros e evitar ultrapassar o limite da lista.
        🔹 Scanners → Para ler entradas do usuário via teclado ou outras fontes, como arquivos e strings.*/

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Define o tamanho da Array caso queira colocar mais clientes
        int NUM_MAX = 10;
        String [] CadastroCliente = new String [NUM_MAX];

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
                    if (ClientesCadastrado < NUM_MAX) {
                        System.out.println("Digite o nome do Cliente: ");
                        String NomeCliente = scanner.nextLine();

                        //Código armazena o nome de um cliente no array CadastroCliente, em uma posição específica definida pela variável ClientesCadastrado.
                        CadastroCliente[ClientesCadastrado] = NomeCliente;

                        // somando +1 sempre que tiver um novo cadastro
                        ClientesCadastrado ++;
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
                        for (int i = 0; i < CadastroCliente.length ; i++) {
                            System.out.println(CadastroCliente [i]);
                        }
                    }
                    break;
                }

                case 3:{
                    System.out.println("Saindo...");
                    break;
                }

                default:
                    System.out.println("Ésta opção é inválida.");
                }

            }


        }







    }

