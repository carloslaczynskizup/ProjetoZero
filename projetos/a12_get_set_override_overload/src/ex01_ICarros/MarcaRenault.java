package a12_get_set_override_overload.src.ex01_ICarros;

public class MarcaRenault extends CatalogoCarros {

    public MarcaRenault(String marca, String cor, int ano, int portas, int velocidade, double valor) {
        super(marca, cor, ano, portas, velocidade, valor);

    }

    @Override
    public void ligarCarro() {
        int setVelocidade = 0;
        super.ligarCarro();
    }

    @Override
    public void frearCarro() {
        setVelocidade(getVelocidade() - 5);
        super.frearCarro();
    }

    @Override
    public void acelerarCarro() {
        setVelocidade(getVelocidade() + 10);
        super.acelerarCarro();
    }


}
