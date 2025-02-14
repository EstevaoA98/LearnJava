package TipoDeDado;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /* Dados nao primitivos:
        String->String
        LIST->List
        MAP->Map
        CLASS->Class
        ENUM->Enum
        */

        String name = "Estevao Miranda";
        String nameUpperCase = name.toUpperCase();//toupperCase->Metodo que transforma o texto em maiusculo
        System.out.println("Nome em todo em CAPSLOCK: " + nameUpperCase);
        System.out.println("Nome normal: " + name);

        String city = "Belo Horizonte";
        String cityLowerCase = city.toLowerCase();//toLowerCase->Metodo que transforma o texto em minusculo
        System.out.println(cityLowerCase);
        System.out.println(city);
    }
}

 /*Dados não primitivos:
São tipos de dados que de maneira geral não recebem metodos de maneitra padrão.*/