package com.bookmanagement.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    void createAnewRole() {
        Role role = new Role();
        role.setName("Administrator");
        role.setId(1L);


        assertEquals(role.getName(), "Administrator");
        assertEquals(role.getId(), 1L);



    }

}