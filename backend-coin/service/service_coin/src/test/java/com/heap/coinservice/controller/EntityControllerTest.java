package com.heap.coinservice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@WebMvcTest(AdminController.class)
public class EntityControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void createNode() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/createNode")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/createNode")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getNodesByDomainId() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getNodesByDomainId/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getNodesByDomainId/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateNode() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateNode")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateNode")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void deleteNode() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/deleteNode")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/deleteNode")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void countNode() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/countNode/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/countNode/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void countNodeByType() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/countNodeByType/{domainId}/{type}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/countNodeByType/{domainId}/{type}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateXY() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateXY")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateXY")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateComposeXY() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateComposeXY")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateComposeXY")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getTypes() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getTypes/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getTypes/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getNodeByType() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getNodeByType/{domainId}/{type}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/getNodeByType/{domainId}/{type}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void searchNodeByName() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/searchNodeByName/{domainId}/{searchName}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/searchNodeByName/{domainId}/{searchName}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateType() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateType/{id}/{oldType}/{newType}/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/entity/updateType/{id}/{oldType}/{newType}/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}