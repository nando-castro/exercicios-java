public class App {

    /*
     * Escreva um código que deve imprimir a tabela de multiplicação desse algum
     * número fornecido, e deve exibir um cabeçalho com o nome Tabela de
     * multiplicação de X, onde X é o número a ser multiplicado.
     */

    public static void main(String[] args) throws Exception {
        int numero = 2;
        int multiplicador = 10;
        System.out.println("----------------------------");
        System.out.println("Tabela de multiplicação de " + numero);
        System.out.println("----------------------------");
        for (int i = 0; i < multiplicador + 1; i++) {
            System.out.println(i + " * " + numero + " = " + (i * numero));
        }
    }
}
