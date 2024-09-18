package extend_lesson.midterm.data;



import extend_lesson.midterm.entities.User;
import extend_lesson.midterm.utils.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<User> users = new ArrayList<>(
            Arrays.asList(new User("admin", "admin", Constant.ROLE_ADMIN)));

}
