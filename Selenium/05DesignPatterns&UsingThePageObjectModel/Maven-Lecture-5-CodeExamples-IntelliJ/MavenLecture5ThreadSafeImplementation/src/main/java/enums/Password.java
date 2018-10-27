package enums;

public enum Password {
    ADMIN_PASSWORD("parola123!"),
    INVALID_PASSWORD("dfdasfasfasdfdasfdasfdasf");

    private String password;

    Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
