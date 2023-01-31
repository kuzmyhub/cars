package ru.cars.util;

import ru.cars.model.User;

import javax.servlet.http.HttpSession;

public final class SessionUser {

    public static User getSession(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setLogin("Гость");
        }
        return user;
    }
}
