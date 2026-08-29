public class LoginService {
    public boolean login(String user, String pass) {
        if (user == null || user.isEmpty() || pass == null || pass.isEmpty()) {
            return false;
        }
        return true;
    }
}

