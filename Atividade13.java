import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            
        System.out.println("Digite um nome:");        
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Digite um nome para remover:");
        String nomeParaRemover = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeParaRemover)) {
                nomes[i] = null; // Remove o nome
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nome removido. Nomes restantes:");
        } else {
            System.out.println("Nome não encontrado. Nomes atuais:");
        }
        for (String nome : nomes) {
            if (nome != null) {
                System.out.println(nome);
            }
        }
    }
}
}
