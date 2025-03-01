package SegundoNivelJava.Desafio;


import java.util.Scanner;

public class GerenciadorDeFuncionarioEmUmaLoja {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Funcionario novoFuncionario = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        novoFuncionario.nome = scanner.nextLine();

        System.out.println("Idade: ");
        novoFuncionario.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cargo: ");
        novoFuncionario.cargo = scanner.nextLine();

        System.out.println("Setor: ");
        novoFuncionario.setor = scanner.nextLine();

        System.out.println("Funcionário está ativo? (1 - sim / 2 - não)");
        int status = scanner.nextInt();

        if (status != 1 && status != 2) {
            System.out.println("Opção inválida");
            return;
        }
        novoFuncionario.statusAtividade = (status == 1) ? "Ativo" : "Não ativo";
        scanner.nextLine();

        System.out.println("Qual posição o funcionário ocupa? (1 - Gerente / 2 - Auxiliar)");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        if (posicao != 1 && posicao != 2) {
            System.out.println("Opção inválida");
            return;

        } else if (posicao == 1) {
            Gerente novoFuncionarioGerencia = new Gerente();

            novoFuncionarioGerencia.departamentoGerenciado();
            novoFuncionarioGerencia.ValeAlimentacao();

        } else if (posicao == 2) {
            Auxiliar novoFuncionarioAuxiliar = new Auxiliar();

            novoFuncionarioAuxiliar.departamentoAuxiliar();
            novoFuncionario.ValeAlimentacao();
        }

        System.out.println("=========Dados para pagamento do funcionário=========");

        Pagamento pagFuncionario = new Pagamento();
        System.out.println("Digite as informações de pagamento: ");

        System.out.println("Salário: ");
        pagFuncionario.Valorsalario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Valor da passagem: ");
        pagFuncionario.ValorPassagem = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Meta batida? (1 - sim / 2 - não)");
        int meta = scanner.nextInt();
        scanner.nextLine();
        if (meta != 1 && meta != 2) {
            System.out.println("Opção inválida");
            return;
        }else if (meta == 1) {
            pagFuncionario.MetaBatida = true;

            System.out.println("Comissão: ");
            pagFuncionario.comissao = scanner.nextDouble();
            scanner.nextLine();
        } else {
            pagFuncionario.MetaBatida = false;

            System.out.println("não receberá comissão");
        }

        System.out.println("----------Pagamento do funcionário----------");
        System.out.println("Salário: " + pagFuncionario.Valorsalario);
        System.out.println("Passagem: " + pagFuncionario.ValorPassagem);
        System.out.println("Meta Batida: " + pagFuncionario.MetaBatida);
        System.out.println("Comissão: " + pagFuncionario.comissao);
        System.out.println("Data de Pagamento: " + pagFuncionario.dataPagamento);

        System.out.println("Valor total a receber no mês: " + (pagFuncionario.Valorsalario + pagFuncionario.ValorPassagem + pagFuncionario.comissao));

        Pagamento  pagamentoFuncionario = new Pagamento();
        pagamentoFuncionario.Pagamento();
        System.out.println("-----------------------------------------------");
        //usando interface
        novoFuncionario.mostrarInformacoes();
        scanner.close();
    }
}

// Minhas dificuldades foram em relação a como criar um objeto do tipo Gerente e Funcionario e como acessar os métodos de cada um, pois não estava conseguindo acessar o método departamentoGerenciado() da classe Gerente, esta fazendo uma estrutura parecendo uma matriz sem chamar o método, mas depois de pesquisar um pouco consegui entender como fazer isso, e consegui fazer o código funcionar.

//Mais para frente colocarei um menu para o usuário escolher se quer cadastrar um funcionário ou um gerente, e também colocarei um loop para que o usuário possa cadastrar quantos funcionários e gerentes quiser, e também colocarei um método para mostrar as informações de todos os funcionários e gerentes cadastrados.