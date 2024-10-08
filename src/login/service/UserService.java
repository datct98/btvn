package login.service;

import login.data.Database;
import login.entities.User;
import login.enums.Role;

import java.util.Scanner;

public class UserService {
    private static UserService instance;

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null){
            instance = new UserService();
            System.out.println("UserService is init new");
        }
        return instance;
    }

    public User login(Scanner scanner){
        System.out.println("Mời b nhập username");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password");
        String password = scanner.nextLine();
        User user = findUserByUsernameAndPassword(username, password);
        if (user != null){
            return user;
        }
        return null;
    }

    private User findUserByUsernameAndPassword(String username, String password){
        for(User user: Database.users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public boolean register(Scanner scanner){
        System.out.println("Mời b nhập username");
        // TODO validate
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password");
        // TODO validate
        String password = scanner.nextLine();
        // TODO validate
        System.out.println("Mời b nhập email");
        String email = scanner.nextLine();
        System.out.println("Mời b chọn role: 1- Người bán  2- Người mua");
        int roleSelect = Integer.parseInt(scanner.nextLine());
        Role role;
        if(roleSelect == 1){
            role = Role.SELLER;
        } else {
            role = Role.CUSTOMER;
        }

        // Khi đăng ký, mặc định account là role customer
        User user = new User(username, password, role, email);
        Database.users.add(user);
        System.out.println("Đăng ký thành công");
        return true;
    }
}
