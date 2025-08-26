import java.util.ArrayList;
import java.util.List;

public class Atividade14 {

    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Carne");
        produtos.add("Frango");
        produtos.add("Peixe");

        System.out.println("Lista de produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i));
        }

        String produtoParaRemover = "Peixe";
        if (produtoParaRemover.contains(produtoParaRemover)) {
            System.out.println("\nO produto \"" + produtoParaRemover + "\" está na lista.");
        } else {
            System.out.println("\nO produto \"" + produtoParaRemover + "\" NÃO está na lista.");
        }

        produtos.remove(produtoParaRemover);
        produtos.add("Carne de Sol");

        System.out.println("Primeiro item da lista: " + produtos.get(0));
        System.out.println("Último item da lista: " + produtos.get(produtos.size() - 1));

        produtos.clear();
        System.out.println("Lista de produtos após limpar: " + produtos);
    }
}