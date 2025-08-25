public class Atividade06 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int troca = b;
        b = a;
        a = troca;
        
        System.out.println("O valor de a é: " + a);
        System.out.println("O valor de b é: " + b);
    }
}