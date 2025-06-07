package com.cubic.cubicspringboot.service;

import com.cubic.cubicspringboot.model.User;
import com.cubic.cubicspringboot.repository.UserRepository;
import jakarta.persistence.Column;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

//    @Test
//    public void testSaveUser() {
//        User user = new User(0, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        User savedUser = new User(1, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        //mock
//        Mockito.when(userRepository.save(user)).thenReturn(savedUser);
//        //actual
//        User result = userService.saveUser(user);
//        //assertion
//        Assertions.assertNotNull(result);
//        Assertions.assertEquals(1, result.getId());
//    }
//
//    @Test
//    public void testUpdateUser() {
//        User user = new User(1, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        User updateUser = new User(1, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        //mock
//        Mockito.when(userRepository.save(user)).thenReturn(updateUser);
//        //actual
//        User result = userService.saveUser(user);
//        //assertion
//        Assertions.assertNotNull(result);
//        Assertions.assertEquals(1, result.getId());
//        Assertions.assertEquals("raju", result.getFirstName());
//        Assertions.assertEquals("sharma", result.getLastName());
//    }
//
//    @Test
//    public void testDeleteUser() {
//        //mock
//        Mockito.doNothing().when(userRepository).deleteById(1);
//        //actual
//        userService.deleteUser(1);
//        //verify
//        Mockito.verify(userRepository, Mockito.times(1)).deleteById(1);
//    }
//
//    @Test
//    public void testGetUser() {
//        User user = new User(1, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        //mock
//        Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));
//        //actual
//        User result = userService.getUser(1);
//        //assertion
//        Assertions.assertNotNull(result);
//        Assertions.assertEquals(1, result.getId());
//        Assertions.assertEquals("raju", result.getFirstName());
//        Assertions.assertEquals("sharma", result.getLastName());
//    }
//
//    @Test
//    public void testGetUsers() {
//        User user1 = new User(1, "user1", "pass1", "user1@gmail.com", 44444, "Nepal", "raju", "sharma");
//        User use2 = new User(2, "user2", "pass2", "user2@gmail.com", 55555, "USA", "John", "Smith");
//        List<User> users = List.of(user1, use2);
//        //mock
//        Mockito.when(userRepository.findAll()).thenReturn(users);
//        //actual
//        List<User> result = userService.getUsers();
//        //assertions
//        Assertions.assertNotNull(result);
//        Assertions.assertEquals(2, result.size());
//        Assertions.assertEquals("raju", result.get(0).getFirstName());
//        Assertions.assertEquals("sharma", result.get(0).getLastName());
//    }
}
