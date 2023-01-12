import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Holiday holiday = new Holiday();

        System.out.println("Exibir lista de feirados? (S ou N): ");
        String response = scanner.next();

        if (response.equals("S")) {
            for (int i = 0; i < holiday.getHolidays().length; i++) {
                System.out.println(holiday.getHolidays()[i][0] + " => " + holiday.getHolidays()[i][1]);
            }
        }

        System.out.println("\nDigite um dia do mês (entre 01 e 30): ");
        String day = scanner.next();
        System.out.println("Digite um mês do ano (entre 01 e 12): ");
        String month = scanner.next();

        String date = day + "/" + month + "/2023";

        for (int i = 0; i < holiday.getHolidays().length; i++) {
            if (date.equals(holiday.getHolidays()[i][0])) {
                System.out.println(holiday.getHolidays()[i][0] + " => " + holiday.getHolidays()[i][1]);
                return;
            }
        }
        System.out.println("Não existe feriado com esta data: " + date);

    }
}
