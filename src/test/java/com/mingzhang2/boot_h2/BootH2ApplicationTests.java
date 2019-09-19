package com.mingzhang2.boot_h2;

import com.mingzhang2.boot_h2.entity.User;
import com.mingzhang2.boot_h2.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootH2ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        User user = User.builder().id(1).name("zhangsan").age(12).build();
        userRepository.save(user);
        User user2 = User.builder().id(1).name("李四").build();
        userRepository.save(user2);
    }

    @Test
    public void find() {
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }

}
