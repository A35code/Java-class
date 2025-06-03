public abstract class User implements Authenticable{
    private String email;

    private String password;

    @Override
    public boolean authenticate() { //passing (String email, String passsword) as arguements
        return false;
    }

    @Override
    public String otp() {
        return "";
    }

    @Override
    public String passkey() {
        return "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;//ths sets the email e.g. z@gmail.com
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract String getPermissions();
}
