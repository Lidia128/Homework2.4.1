public class Mehanik <M extends Transport> {
    private final String name;
    private final String surname;
    private final String company;
    public Mehanik(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company; }
    public String getName() {
        return name;    }
    public String getSurname() {
        return surname;    }
    public String getCompany() {
        return company;    }
    @Override
    public String toString() {
        return name +" "+ surname + " из "+ company;    }
}
