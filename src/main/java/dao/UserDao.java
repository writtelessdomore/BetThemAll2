package dao;

import org.springframework.data.repository.CrudRepository;
import model.User;

public interface UserDao extends CrudRepository<User, Long> {

}
