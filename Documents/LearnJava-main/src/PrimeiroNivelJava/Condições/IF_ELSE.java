package PrimeiroNivelJava.Condições;

public class IF_ELSE {
    public static void main(String[] args) {

        /*
        *IF e ELSE - condições
        * Objetivo: passar o vendor de senioridade de acordo com cada venda mensal alcançada.
         */

        String vendedor = "José da Silva";
        int salarioBase = 1500;
        boolean  GerenteDeVendas= false;
        short vendasMensais = 10; //mudar a quantidade de vendas diante do mes.


        if (vendasMensais >= 30) {
            GerenteDeVendas = true;
            salarioBase += 500;
            System.out.println("Cargo: Gerente de vendas");
        }else if (vendasMensais >= 20) {
            GerenteDeVendas = false;
            salarioBase += 300;
            System.out.println("Cargo: Representante de Vendas");
        }else {
            GerenteDeVendas = false;
            salarioBase += 50;
            System.out.println("Cargo: Vendedor");
        }

        System.out.println("Vendedor: " + vendedor);
        System.out.println("Salário base: " + salarioBase);
        System.out.println("Gerente de vendas: " + GerenteDeVendas);

    }
}
