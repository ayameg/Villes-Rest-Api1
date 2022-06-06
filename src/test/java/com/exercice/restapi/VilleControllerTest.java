package com.exercice.restapi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.exercice.restapi.controller.VilleController;
import com.exercice.restapi.service.VilleService;

@WebMvcTest(controllers = VilleController.class)
public class VilleControllerTest {
	@Autowired
    private MockMvc mockMvc;

  

    @Test
    public void testGetVilles() throws Exception {
        mockMvc.perform(get("/villes"))
            .andExpect(status().isOk());
    }
}
