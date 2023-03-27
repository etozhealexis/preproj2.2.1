package hiber.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User getUserByCar(Car car);
}
