package exceptions;

public class Main {
    public static void main(String[] args) {
        String login = "vpm";
        String password = "vpm123";
        String confirmPassword = "vpm123";
        try {
            checkAccount(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Invalid login, check the right of login");
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password, try to enter the password again");
        } finally {
            System.out.println("Verification completed");
        }
    }

    static void checkAccount(String login, String password, String confirmPassword) {
        if (login.length() > 20 && !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword) && !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException();
        }
    }

}
