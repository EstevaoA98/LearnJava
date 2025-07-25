package NotasEscolares.Boletin;

public class MediaDeAprovacao {

    public static double mediaDenotas(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static String aprovacao(double media) {
        if (media >= 9){
            return "Aprovado com louvor";
        } else if (media >= 7){
            return "Aprovado";
        } else if (media >= 5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
