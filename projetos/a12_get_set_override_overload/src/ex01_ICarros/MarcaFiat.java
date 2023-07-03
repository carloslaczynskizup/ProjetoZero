package a12_get_set_override_overload.src.ex01_ICarros;

public class MarcaFiat extends CatalogoCarros {

    public MarcaFiat(String marca, String cor, int ano, int portas, int velocidade, double valor) {
        super(marca, cor, ano, portas, velocidade, valor);
    }

    @Override

    public void ligarCarro() {
        setVelocidade(3);
        super.ligarCarro();
    }

    @Override
    public void frearCarro() {
        setVelocidade(getVelocidade() - 6);
        super.frearCarro();
    }

    public void acelerarCarro() {
        setVelocidade(getVelocidade() + 12);
        super.acelerarCarro();
    }
}
