package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DataHorarioTest {

    private DataHorario dh;

   @BeforeEach
   void setUp(){
       Data dataMock = mock(Data.class);
       when(dataMock.minutos()).thenReturn(0);

       dh = new DataHorario(dataMock);
   }

    @Test
    void constroi(){

       assertEquals(0, dh.getHora());
       assertEquals(0, dh.getMinuto());
       assertEquals(0, dh.minutos());
    }
    @Test
    void horarioBaixo(){

       dh.atualiza(-1,-1);

       assertEquals(0, dh.getHora());
       assertEquals(0, dh.getMinuto());
       assertEquals(0, dh.minutos());
    }

    @Test
    void horarioAlto(){

        dh.atualiza(24,60);

        assertEquals(23, dh.getHora());
        assertEquals(59, dh.getMinuto());
        assertEquals(1439, dh.minutos());
    }


}
