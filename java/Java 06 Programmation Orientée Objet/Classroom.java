class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + this.firstname + " et je suis aware.";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware.";
        }
    }
}

public class Classroom {
    public static void main(String[] args) {
        Wilder jean = new Wilder("Jean", true);
        Wilder marie = new Wilder("Marie", false);
        Wilder alex = new Wilder("Alex", true);

        System.out.println(jean.whoAmI());
        System.out.println(marie.whoAmI());
        System.out.println(alex.whoAmI());
    }
}
