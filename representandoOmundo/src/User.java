public class User {
    private String name;
    private String email;
    private String password;
    private String selectDiscipline;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setSelectDiscipline(String selectDiscipline) {
        this.selectDiscipline = selectDiscipline;
    }

    public String getSelectDiscipline() {
        return this.selectDiscipline;
    }
}
