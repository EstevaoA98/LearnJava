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
        novoFuncionario.statusAtividade = (status==1) ? "Ativo" : "Não ativo";
        scanner.nextLine();

        System.out.println("Qual posição o funcionário ocupa? (1 - Gerente / 2 - Auxiliar)");
        int  posicao = scanner.nextInt();
        scanner.nextLine();

        if (posicao == 1){
            Gerente novoFuncionarioGerencia = new Gerente();

            System.out.println("Qual departamento de gerência: ");
            String departamentoGerenciado = scanner.nextLine();

            novoFuncionarioGerencia.departamentoGerenciado = departamentoGerenciado;
            departamentoGerenciado = String.valueOf(posicao);

        } else if (posicao == 2) {

            Funcionario novoFuncionarioAuxiliar = new Funcionario();

            System.out.println("Qual departamento de auxiliar: ");
            String departamentoAuxiliar = scanner.nextLine();

            novoFuncionarioAuxiliar.setor = departamentoAuxiliar;
            departamentoAuxiliar = String.valueOf(posicao);
        }

        novoFuncionario.mostrarInformacoes();
        scanner.close();
    }
}

// Minhas dificuldades foram em relação a como criar um objeto do tipo Gerente e Funcionario e como acessar os métodos de cada um, pois não estava conseguindo acessar o método departamentoGerenciado() da classe Gerente, esta fazendo uma estrutura parecendo uma matriz sem chamar o método, mas depois de pesquisar um pouco consegui entender como fazer isso, e consegui fazer o código funcionar.

//Mais para frente colocarei um menu para o usuário escolher se quer cadastrar um funcionário ou um gerente, e também colocarei um loop para que o usuário possa cadastrar quantos funcionários e gerentes quiser, e também colocarei um método para mostrar as informações de todos os funcionários e gerentes cadastrados.