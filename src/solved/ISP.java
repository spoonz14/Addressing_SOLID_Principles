package solved;

import java.util.List;

public class ISP {
}

// Interface Segregation Principle solution: we are going to implement two different interfaces this time
// to resolve the ISP violation

interface User {
    String login();
    String addNote(String note);
    String addTimer(String timer);
}

interface Admin {
    String manageUsers(String user);
}
class NormalUser implements User {
    String user;
    String note;
    String newData;
    String loginToken;
    List<String> users;
    int size = users.size();
    @Override
    public String login() {
        for (int i = 0; i <= size; i++){

            if (user == users.get(i)) {
                return loginToken;
            }
        }
        return null;
    }

    public String addNote(String note) {
        return note;
    }

    public String addTimer(String timer) {
        return timer;
    }
}

class Administrator implements Admin {
    String newData;
    public String manageUsers(String existingUser) {
        existingUser = newData;
        return existingUser;
    }
}