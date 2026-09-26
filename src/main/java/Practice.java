class Account {

    private String password;

    public void setPassword(String password) {

        if (password.length() >= 4) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}

public class Practice {

    public static void main(String[] args) {

        Account a = new Account();

        a.setPassword("abcd");

        System.out.println(a.getPassword());
    }
} 