package br.com.andrelemos.airlinesflights.api;

import br.com.andrelemos.airlinesflights.api.model.Aereo;
import br.com.andrelemos.airlinesflights.api.resource.AereoResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AereoResource.class)
public class AirlinesFlightsApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AereoResource service;

    @Test
    public void deveRetornarStatusOkParaServicoPesquisarVoos() throws Exception {
        when(service.pesquisar()).thenReturn(Arrays.asList(new Aereo()));
        this.mockMvc.perform(get("/aereos"))
                        .andDo(print())
                        .andExpect(status()
                        .isOk());


    }

    @Test
    public void deveRetornarStatusOkParaServicoPesquisarVooPorCodigo() throws Exception {
        when(service.buscarPeloCodigo(1L)).thenReturn(ResponseEntity.ok(new Aereo()));
        this.mockMvc.perform(get("/aereos/1"))
                        .andDo(print())
                        .andExpect(status()
                        .isOk());
    }

}
