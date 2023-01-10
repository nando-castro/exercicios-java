public class App {
    public static void main(String[] args) throws Exception {

        int numero = 5;

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
