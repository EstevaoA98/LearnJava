package SegundoNivelJava.Desafio;

import java.sql.Time;

public class Pagamento implements FolhaDePagamento {

    Double Valorsalario;
    Double ValorPassagem;
    Boolean MetaBatida = false;
    Double comissao;
    String dataPagamento = "Quinto dia ultil do mês";

    public void Pagamento() {
        System.out.println("*Pagamento efetuado com sucesso!*");
    }

    public void Pagamento(Double salario, Double passagem, Boolean meta, Double comissao, String data) {
        this.Valorsalario = salario;
        this.ValorPassagem = passagem;
        this.MetaBatida = meta;
        this.comissao = comissao;
        this.dataPagamento = data;
    }

}

/*
*Construtores são métodos especiais que são chamados quando um objeto é instanciado. Eles são usados para inicializar objetos.
*Construtores vazio são construtores que não têm parâmetros. Eles são usados para inicializar objetos com valores padrão.
*Construtores com argumentos são construtores que têm parâmetros. Eles são usados para inicializar objetos com valores específicos.*/