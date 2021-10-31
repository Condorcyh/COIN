package com.heap.userservice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@WebMvcTest(UsersController.class)
public class UsersControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void loginUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/login")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/login")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void registerUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/register")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/register")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getUserInfo() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserInfo")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserInfo")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void testGetUserInfo() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserInfo/{id}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserInfo/{id}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateUserInfo() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserInfo/{id}/{nickname}/{sign}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserInfo/{id}/{nickname}/{sign}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateUserInfoAdmin() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserInfoAdmin")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserInfoAdmin")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateAvatar() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateAvatar")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateAvatar")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateUserPwd() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserPwd/{id}/{oldPwd}/{newPwd}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/updateUserPwd/{id}/{oldPwd}/{newPwd}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void resetPwd() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/resetPwd/{mobile}/{password}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/resetPwd/{mobile}/{password}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getUserListPage() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserListPage/{current}/{limit}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/getUserListPage/{current}/{limit}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void deleteUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/deleteUser/{id}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/deleteUser/{id}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void addUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/addUser")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/addUser")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void disableUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/disableUser/{id}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/disableUser/{id}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void setVipUser() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/setVipUser/{id}/{days}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/userservice/users/setVipUser/{id}/{days}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}