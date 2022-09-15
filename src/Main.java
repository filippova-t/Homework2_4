import java.net.http.WebSocketHandshakeException;

public class Main {
    public static boolean check (String login, String password, String confirmPassword) {
        login.matches("\\w+");
        password.matches("\\w+");
        confirmPassword.matches("\\w+");
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Логин должен быть равен или меньше 20 символов");
            } else if (password.length() >= 20) {
                System.out.println("Пароль должен быть меньше 20 символов");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Параметры пароля и подтверждения пароля не совпадают");
            }
        } catch (WrongLoginException e) {
            return false;

        } catch (WrongPasswordException e) {
            return false;
        }
           return (login.matches("\\w+") && password.matches("\\w+") && confirmPassword.matches("\\w+") &&
                   login.length() <= 20 && password.length() < 20 && password.equals(confirmPassword));


    }

    public static void main(String[] args) {
        System.out.println(check("login1235498", "parol456781", "parol456781"));





    }
}