package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@WebMvcTest(CourseController.class)
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void retrieveAllCharts() throws Exception {
        mockMvc.perform(get("/charts"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json("[{\"id\":1,\"name\":\"John\",\"day\":[\"Monday\",\"Wednesday\",\"Friday\"]}," +
                                          "{\"id\":2,\"name\":\"Rob\",\"day\":[\"Monday\",\"Wednesday\",\"Friday\"]}," +
                                          "{\"id\":3,\"name\":\"Thomas\",\"day\":[\"Tuesday\",\"Thursday\"]}," +
                                          "{\"id\":4,\"name\":\"Matthew\",\"day\":[\"Tuesday\",\"Thursday\"]}," +
                                          "{\"id\":4,\"name\":\"Nathan\",\"day\":[\"Saturday\",\"Sunday\",\"Monday\"]}]"))
                .andDo(MockMvcResultHandlers.print());
    }
}
