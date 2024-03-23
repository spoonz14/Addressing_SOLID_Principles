package violated;

import java.util.List;

public class ISP {
}

// Interface Segregation Principle
// We are creating an interface that has functions for 2 different types of users.
// When implementing the interface into classes for the 2 different users,
// there will be unnecessary functions added to both new classes

interface User {
    String login();
    String addNote(String note);
    String addTimer(String timer);
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

    // So far, everything is fine since all of these functions are intended to be used by the normal user
    // However, now we HAVE to implement the manageUsers function, and since this is only meant
    // for Administrator's, this is bad practice

    public String manageUsers(String existingUser) { // Unnecessary/unwanted function for this class
        existingUser = newData;
        return existingUser;
    }
}

class Administrator implements User {
    String user;
    String note;
    String newData;
    String loginToken;
    List<String> users;
    int size = users.size();

    // This class has the opposite problem where all the functions relating to login, addNote, and addTimer
    // are completely unnecessary/unwanted, but since we are implementing the User interface:
    // we have to include them

    @Override
    public String login() {
        for (int i = 0; i <= size; i++) {

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


    public String manageUsers(String existingUser) {
        existingUser = newData;
        return existingUser;
    }
}