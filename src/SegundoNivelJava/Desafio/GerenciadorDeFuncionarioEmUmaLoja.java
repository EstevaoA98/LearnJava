package SegundoNivelJava.Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeFuncionarioEmUmaLoja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Cria um array de funcionarios>
        ArrayList<Funcionario> CadastroFuncionario = new ArrayList<Funcionario>();

        //Contadores
        int funcionariosCadastrado = 0;
        int opcao = 0;

        while (opcao != 4) {
            //Menu
            System.out.println("\n----- Menu de Funcionários -----");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar informações de um funcionário");
            System.out.println("3 - Listar informações de todos os funcionários");
            System.out.println("4 - Sair");

            // Captura a opção
            opcao = scanner.nextInt();

            // Consome a quebra de linha
            scanner.nextLine();

            switch (opcao) {

                case 1: {
                    System.out.println("Qual a hierarquia do funcionário? \n1 - Funcionário\n2 - Gerente");
                    int opcaoCargo = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoCargo == 1) {
                        System.out.println("Digite o nome do funcionário: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a idade do funcionário: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o cargo do funcionário: ");
                        String cargo = scanner.nextLine();


                        System.out.println("Digite o setor do funcionário: ");
                        String setor = scanner.nextLine();


                        System.out.println("Estatus de atividade: \n1 - Ativo\n2 - Não Ativo");
                        String statusOpcao = scanner.nextLine();
                        scanner.nextLine();
                        String statusAtividade = statusOpcao.equals ("1") ? "Ativo" : "Não ativo";


                        Funcionario funcionario = new Funcionario();

                        CadastroFuncionario.add(funcionario);
                        funcionariosCadastrado++;
                        break;
                    }else if (opcaoCargo == 2){
                        System.out.println("Digite o nome do gerente: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a idade do Gerente: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o cargo do Gerente: ");
                        String cargo = scanner.nextLine();

                        System.out.println("Digite o setor do Gerente: ");
                        String setor = scanner.nextLine();

                        System.out.println("Digite o departamento do gerente: ");
                        String departamento = scanner.nextLine();

                        System.out.println("Estatus de atividade: \n1 - Ativo\n2 - Não Ativo");
                        String statusOpcao = scanner.nextLine();
                        scanner.nextLine();
                        String statusAtividade = statusOpcao.equals ("1") ? "Ativo" : "Não ativo";

                        break;
                    } else {
                        System.out.println("Ésta opção é inválida.");
                        break;
                    }

                }
                case 2:{
                    if (CadastroFuncionario.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.print("Digite o nome do funcionário: ");
                        String nomeFuncionario = scanner.nextLine().trim();

                        boolean encontrado = false;
                        System.out.println("---- Informações do Funcionário -----");

                        for (Funcionario funcionario : CadastroFuncionario) {
                            // Verifica se funcionario.nome não é nulo antes de chamar trim()
                            if (funcionario.nome != null && funcionario.nome.trim().equalsIgnoreCase(nomeFuncionario)) {
                                funcionario.mostrarInformacoes();
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Nenhum funcionário encontrado com esse nome.");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("---- Lista de funcionários cadastrados -----");
                    for (int i = 0; i < CadastroFuncionario.size(); i++) {
                        System.out.println("Informações do Funcionário: " + (i + 1));
                        CadastroFuncionario.get(i).mostrarInformacoes();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saindo...");
                    break;
                }
                // Se o usuário nao digitar diferente das opções propostas
                default:
                    System.out.println("Ésta opção é inválida.");
                    break;
            }

        }


    }


}

