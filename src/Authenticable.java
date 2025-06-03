public interface Authenticable {

    boolean authenticate();//absract methods can have parameters but no bodies
    String otp();

    String passkey();
}
