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
public class FileControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getCsvFile() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/getCsv/{userId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/getCsv/{userId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void getJsonCompany() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/getJsonCompany")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/getJsonCompany")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void exportGraphXML() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/exportXml/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/exportXml/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void exportCSV() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/exportCSV/{domainId}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/exportCSV/{domainId}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void download() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/download/{domainName}/{type}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/download/{domainName}/{type}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }

    @Test
    public void deleteCache() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/deleteCache/{domainName}/{type}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/file/deleteCache/{domainName}/{type}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}