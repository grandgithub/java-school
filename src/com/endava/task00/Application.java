package com.endava.task00;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Application {

    private ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Application app = new Application();
        app.populateList();
        app.showList("--- Initial list ---");
        System.out.println("\nLocalDateTime is: "+Timestamp.valueOf(LocalDateTime.now()));
        app.setNewToActive();
        app.showList("\n--- NEW to ACTIVE (whose timestamp when they were registered in the system is older than yesterday) ---");
        System.out.println("\nLocalDateTime is: "+Timestamp.valueOf(LocalDateTime.now()));
        app.setInactiveToBlocked();
        app.showList("\n--- INACTIVE to BLOCKED (users that where registered more than 1 month ago) ---");
    }

    public void populateList() {
        users.add(new User("Andy", "Groove", 21, "andy.groove@email.com", UserType.NEW, new Timestamp(new Date().getTime())));
        users.add(new User("NewUser1", "ToActive", 17, "new1.to.active@email.com", UserType.NEW, Timestamp.valueOf(LocalDate.now().minusDays(2).atStartOfDay())));
        users.add(new User("NewUser2", "ToActive", 16, "new2.to.active@email.com", UserType.NEW, Timestamp.valueOf(LocalDateTime.now().minusDays(1).minusSeconds(1))));
        users.add(new User("NewUser3", "NotToActive", 16, "new.notto.active@email.com", UserType.NEW, Timestamp.valueOf(LocalDateTime.now().minusDays(1).plusSeconds(1))));
        users.add(new User("Johny", "Depp", 36, "johny.depp@email.com", UserType.ACTIVE, Timestamp.valueOf(LocalDate.of(2019, 5, 15).atStartOfDay())));
        users.add(new User("Uma", "Thurman", 39, "uma.thurman@email.com", UserType.ACTIVE, Timestamp.valueOf(LocalDate.of(2020, 10, 3).atStartOfDay())));
        users.add(new User("Panda", "Cung-fu", 18, "panda.cungfu@email.com", UserType.INACTIVE, new Timestamp(new Date().getTime())));
        users.add(new User("InactiveUser1", "ToBlocked", 16, "inactive1.to.blocked@email.com", UserType.INACTIVE, Timestamp.valueOf(LocalDateTime.now().minusMonths(1))));
        users.add(new User("InactiveUser2", "ToBlocked", 16, "inactive2.to.blocked@email.com", UserType.INACTIVE, Timestamp.valueOf(LocalDateTime.now().minusMonths(1).minusSeconds(1))));
        users.add(new User("InactiveUser3", "NotToBlocked", 16, "inactive3.notto.blocked@email.com", UserType.INACTIVE, Timestamp.valueOf(LocalDateTime.now().minusMonths(1).plusSeconds(1))));
        users.add(new User("Freddy", "Mercury", 66, "freddy.mercury@email.com", UserType.INACTIVE, Timestamp.valueOf(LocalDate.of(1999, 9, 4).atStartOfDay())));
        users.add(new User("Eva", "Mendes", 38, "eva.mendes@email.com", UserType.INACTIVE, Timestamp.valueOf(LocalDate.of(2010, 3, 4).atStartOfDay())));
        users.add(new User("John", "Whoo", 44, "john.whoo@email.com", UserType.BLOCKED, Timestamp.valueOf(LocalDate.of(2020, 1, 2).atStartOfDay())));
        users.add(new User("Barack", "Obama", 44, "barack.obama@email.com", UserType.BLOCKED, Timestamp.valueOf(LocalDate.of(2016, 11, 10).atStartOfDay())));
    }

    public void showList(String message) {
        System.out.println(message);
        users.forEach(System.out::println);
    }

    public void setNewToActive() {
        users.stream()
                .filter(user -> user.getUserType().equals(UserType.NEW) && user.getRegisterTime().before(Timestamp.valueOf(LocalDateTime.now().minusDays(1))))
                .forEach(user -> user.setUserType(UserType.ACTIVE));
    }

    public void setInactiveToBlocked() {
        users.stream()
                .filter(user -> user.getUserType().equals(UserType.INACTIVE) && user.getRegisterTime().before(Timestamp.valueOf(LocalDateTime.now().minusMonths(1))))
                .forEach(user -> user.setUserType(UserType.BLOCKED));
    }
}
