public class ControleDispositivo implements DispositivoSmart
{
    private boolean ligado;
    private Mediator mediadorDispositivos;

    @Override
    public void ligar() {
        ligado = true;
        mediadorDispositivos.alterarEstado(this);
    }

    @Override
    public void desligar() {
        ligado = false;
        mediadorDispositivos.alterarEstado(this);
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }


    public void setMediadorDispositivos(Mediator mediador) {
        this.mediadorDispositivos = mediador;
    }
}
