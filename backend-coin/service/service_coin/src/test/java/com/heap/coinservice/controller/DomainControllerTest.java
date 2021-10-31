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
public class DomainControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void createDomain() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/createDomain")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/createDomain")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void updateDomain() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/updateDomain")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/updateDomain")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void deleteDomain() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/deleteDomain/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/deleteDomain/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void selectDomainById() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/selectDomainById/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/selectDomainById/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void selectAllDomain() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/selectAllDomain/{userId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/selectAllDomain/{userId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getDomainListPage() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/getDomainListPage/{current}/{limit}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/getDomainListPage/{current}/{limit}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getTemplate() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/getTemplate/{template}/{userId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/domain/getTemplate/{template}/{userId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}