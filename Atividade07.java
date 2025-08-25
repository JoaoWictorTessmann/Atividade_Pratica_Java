public class Atividade07 {

    public static void main(String[] args) {
        double nota1 = 6.0;
        double nota2 = 8.0;
        double notaFinal = (nota1 + nota2) / 2;
        if(notaFinal >= 7) {
            System.out.println("Nota Final: " + notaFinal);
            System.out.println("Aprovado");
        } else {
            System.out.println("Nota Final: " + notaFinal);
            System.out.println("Reprovado");
        }
    }
}