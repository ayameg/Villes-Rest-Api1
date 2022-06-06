package com.exercice.restapi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.exercice.restapi.service.VilleService;


@SpringBootTest
@AutoConfigureMockMvc
class RestApiVillesApplicationTests {
	@Autowired
    private MockMvc mockMvc;

	  @MockBean
	    private VilleService villeService;

    @Test
    public void testGetVilles() throws Exception {
        mockMvc.perform(get("/villes"))
            .andExpect(status().isOk());
    }


}
