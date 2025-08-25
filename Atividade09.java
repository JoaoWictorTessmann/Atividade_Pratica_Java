public class Atividade09 {

    public static void main(String[] args) {
        boolean loop = true;

        while (loop) {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                if (i == 1) {
                    loop = false;
                    System.out.println("FIM!");
                }
                
            }
            
        }
    }
}