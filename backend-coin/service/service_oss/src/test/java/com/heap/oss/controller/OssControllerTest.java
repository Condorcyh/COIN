package com.heap.oss.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@WebMvcTest(OssController.class)
public class OssControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void uploadOssFile() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/ossservice/fileoss")).andExpect(MockMvcResultMatchers.status().isOk());
//        mockMvc.perform(MockMvcRequestBuilders.post("/ossservice/fileoss")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("url")));
    }
}