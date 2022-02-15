public class ArCondicionado implements  DispositivoSmart
{
    private int potencia;
    private Mediator mediadorDispositivos;

    public void mudarPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void ligar() {

        potencia = 1;
        mediadorDispositivos.alterarEstado(this);

    }

    @Override
    public void desligar()
    {
        potencia = 0;
        mediadorDispositivos.alterarEstado(this);
    }

    @Override
    public boolean estaLigado()
    {
        if (this.potencia != 0)
            return true;
        else return false;
    }

    public void setMediadorDispositivos(Mediator mediador) {
        this.mediadorDispositivos = mediador;
    }
}
