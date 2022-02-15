public class CasaConectada implements  Mediator {
    private final Ventilador ventilador;
    private final ArCondicionado ar;
    private final ControleDispositivo controle;


    public CasaConectada(Ventilador ventilador, ArCondicionado ar, ControleDispositivo controle) {
        this.ventilador = ventilador;
        this.ar = ar;
        this.controle = controle;
    }


    @Override
    public void alterarEstado(DispositivoSmart dispotivoAlterado) {
        if (dispotivoAlterado == controle && controle.estaLigado()) {
            if (this.ar.estaLigado() && ventilador.estaLigado()) {
                ventilador.desligar();
            }
        } else {
            if (controle.estaLigado()) {
                if (dispotivoAlterado == ar && ventilador.estaLigado() && ar.estaLigado()) {
                    ventilador.desligar();
                }
                else if (ar.estaLigado() && ventilador.estaLigado()) {
                    ar.desligar();
                }
            }

        }
    }
}
