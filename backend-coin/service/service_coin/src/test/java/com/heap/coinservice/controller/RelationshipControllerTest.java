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
public class RelationshipControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void createLink() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/createLink/{fromId}/{toId}/{name}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/createLink/{fromId}/{toId}/{name}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateLink() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/updateLink")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/updateLink")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void deleteLink() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/deleteLink")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/deleteLink")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getGraph() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/getLinkByDomainId/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/getLinkByDomainId/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void countLink() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/countLink/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/countLink/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getGraphScreen() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/getLinkScreen/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/getLinkScreen/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void searchLink() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/searchLink/{domainId}/{searchName}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/relationship/searchLink/{domainId}/{searchName}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}