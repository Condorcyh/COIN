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
public class QuestionControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void askQuestion() {
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/question/ask/{commands}")).andExpect(MockMvcResultMatchers.status().isOk());
        //        mockMvc.perform(MockMvcRequestBuilders.post("/coinservice/question/ask/{commands}")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("token")));
    }
}