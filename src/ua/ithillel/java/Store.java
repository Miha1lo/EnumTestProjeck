package ua.ithillel.java;

public class Store {

    private String nameStore;
    private String urlStore;
    private User[] arrUsers;
    private User authorizedUser;
    private boolean authorizedResul;

    public Store() {
    }

    public Store(String nameStore, String urlStore, User[] arrUsers) {
        this.nameStore = nameStore;
        this.urlStore = urlStore;
        this.arrUsers = arrUsers;
    }

    public boolean login(String login, String password) {
        for (int i = 0; i < arrUsers.length; i++) {
            if (arrUsers[i].getLogin().equals(login) & arrUsers[i].getPassword().equals(password)) {
                authorizedUser = new User(login, password, arrUsers[i].getRole());
                return authorizedResul = true;
            } else if (i < arrUsers.length) {
                continue;
            } else return authorizedResul = false;
        }
        return authorizedResul;
    }

    public void getCurrentUserRights() {
        switch (authorizedUser.getRole()) {
            case DIRECTOR -> System.out.println("Директор магазина, может управлять кадрами, и ценами");
            case ADMINISTRATOR ->
                    System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
            case MANAGER -> System.out.println("Менеджер магазина, может общаться с клиентами");
            case CLIENT -> System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
            case ANONYMOUS -> System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
        }
    }

    public void logout() {
        authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getUrlStore() {
        return urlStore;
    }

    public void setUrlStore(String urlStore) {
        this.urlStore = urlStore;
    }

    public User[] getArrUsers() {
        return arrUsers;
    }

    public void setArrUsers(User[] arrUsers) {
        this.arrUsers = arrUsers;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public boolean isAuthorizedResul() {
        return authorizedResul;
    }

    public void setAuthorizedResul(boolean authorizedResul) {
        this.authorizedResul = authorizedResul;
    }
}

