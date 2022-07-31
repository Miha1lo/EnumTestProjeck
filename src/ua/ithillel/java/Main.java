package ua.ithillel.java;

import java.util.Scanner;

public class Main {

    static void tryLogin(Store gameStore) {
        do {
            System.out.println("Введите логин:");
            Scanner scanLogin = new Scanner(System.in);
            String login = scanLogin.nextLine();
            System.out.println();

            System.out.println("Введите пароль:");
            Scanner scanPassword = new Scanner(System.in);
            String password = scanLogin.nextLine();
            System.out.println();

            if (gameStore.login(login, password)) {
                gameStore.getCurrentUserRights();
                gameStore.logout();
                break;
            } else {
                System.out.println("Неверный логин и\\или пароль");
            }
        } while (true);
    }

        public static void main (String[]args){

            User authorizedUser1 = new User("directorQWE@qwe", "123456qWe", UserStatus.DIRECTOR);
            User authorizedUser2 = new User("adminQWE@qwe", "12345qWe", UserStatus.ADMINISTRATOR);
            User authorizedUser3 = new User("managerQWE@qwe", "1234qWe", UserStatus.MANAGER);
            User authorizedUser4 = new User("clientQWE@qwe", "123qWe", UserStatus.CLIENT);
            User authorizedUser5 = new User("anonymQWE@qwe", "12qWe", UserStatus.ANONYMOUS);
            User[] arrUsers = {authorizedUser1, authorizedUser2, authorizedUser3, authorizedUser4, authorizedUser5};

            Store gameStore = new Store("Steam", "steam.com", arrUsers);

            tryLogin(gameStore);


        }
}