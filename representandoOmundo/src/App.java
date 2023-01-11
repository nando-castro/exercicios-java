public class App {
    /*
     * Sabemos que existe uma plataforma muito famosa (respondeAí), que busca ajudar
     * as pessoas estudantes que estão com dificuldade em algumas matérias. Pensando
     * em algo que possa representar essa plataforma, escreva pelo menos 2 classes
     * com propriedades e métodos que possa representar o modelo da plataforma!
     * Atenção, use da melhor maneira a composição, encapsulamento e as boas
     * práticas que aprendeu em aula.
     */
    public static void main(String[] args) throws Exception {
        User user = new User();

        user.setEmail("user@user.com");
        user.setName("user");
        user.setPassword("user123");

        Content content = new Content();

        content.setDiscipline("Cálculo I");

        user.setSelectDiscipline("Cálculo I");

        System.out.println(
                "Bem vindo: " + user.getName() + ". \nSuas matérias selecionadas são: " + user.getSelectDiscipline()
                        + "\nVocê ainda pode escolher entre: " + content.getDiscipline());
    }
}
