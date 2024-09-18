package login.data;

import login.entities.User;
import login.enums.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<User> users = new ArrayList<>(Arrays.asList
                   (new User("admin", "123", Role.ADMIN),
                    new User("datct", "123", Role.CUSTOMER)));

}
