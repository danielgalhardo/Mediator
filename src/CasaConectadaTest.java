import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasaConectadaTest {

    @Test
    void deveDesligarVentiladorQuandoLigoAr()
    {
        Ventilador ventilador = new Ventilador();
        ArCondicionado ar = new ArCondicionado();
        ControleDispositivo controle = new ControleDispositivo();

        CasaConectada minhaCasa = new CasaConectada(ventilador, ar,controle);
        ar.setMediadorDispositivos(minhaCasa);
        ventilador.setMediadorDispositivos(minhaCasa);
        controle.setMediadorDispositivos(minhaCasa);

        controle.ligar();
        ventilador.ligar();
        ar.ligar();


        assertTrue(ar.estaLigado());
        assertFalse(ventilador.estaLigado());

    }

    @Test
    void deveDesligarArQuandoLigoVentilador()
    {
        Ventilador ventilador = new Ventilador();
        ArCondicionado ar = new ArCondicionado();
        ControleDispositivo controle = new ControleDispositivo();

        CasaConectada minhaCasa = new CasaConectada(ventilador, ar,controle);
        ar.setMediadorDispositivos(minhaCasa);
        ventilador.setMediadorDispositivos(minhaCasa);
        controle.setMediadorDispositivos(minhaCasa);

        controle.ligar();
        ar.ligar();
        ventilador.ligar();

        assertFalse(ar.estaLigado());
        assertTrue(ventilador.estaLigado());

    }


}
