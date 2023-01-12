public class Holiday {

    private String day;
    private String month;

    // private String[] holidays = {
    // "01/01/2023 Confraternização mundial",
    // "21/02/2023 Carnaval",
    // "17/04/2023 Páscoa",
    // "21/04/2023 Tiradentes",
    // "01/05/2023 Dia do trabalho",
    // "08/06/2023 Corpus Christi",
    // "07/09/2023 Independência do Brasil",
    // "12/10/2023 Nossa Senhora Aparecida",
    // "02/11/2023 Finados",
    // "15/11/2023 Proclamação da República",
    // "25/12/2023 Natal"
    // };

    private String[][] holidays = {
            { "01/01/2023", "Confraternização mundial" },
            { "21/02/2023", "Carnaval" },
            { "17/04/2023", "Páscoa" },
            { "21/04/2023", "Tiradentes" },
            { "01/05/2023", "Dia do trabalho" },
            { "08/06/2023", "Corpus Christi" },
            { "07/09/2023", "Independência do Brasil" },
            { "12/10/2023", "Nossa Senhora Aparecida" },
            { "02/11/2023", "Finados" },
            { "15/11/2023", "Proclamação da República" },
            { "25/12/2023", "Natal" }
    };

    public Holiday(String day, String month) {
        this.day = day;
        this.month = month;
    }

    public Holiday() {

    }

    public String[][] getHolidays() {
        return holidays;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}
