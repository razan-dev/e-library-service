package com.bookmanagement.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testANewUserHaveOneRole() {
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");

        Role role = new Role();
        role.setName("ADMINISTRATOR");


        user.setRoles(new ArrayList<>());
        user.getRoles().add(role);

        assertEquals("password", user.getPassword());
        assertEquals("username", user.getUsername());
        assertEquals("ADMINISTRATOR", user.getRoles().get(0).getName());
        assertEquals(1, user.getRoles().size());

    }
}