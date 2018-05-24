package cn.milkygreen.springboot.dao;

import cn.milkygreen.springboot.entity.User;
import org.hibernate.annotations.Persister;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}