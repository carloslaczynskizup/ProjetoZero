package a12_get_set_override_overload.src.ex01_ICarros;

public class MarcaHyundai extends CatalogoCarros {

    public MarcaHyundai(String marca, String cor, int ano, int portas, int velocidade, double valor) {
        super(marca, cor, ano, portas, velocidade, valor);
    }

    @Override

    public void ligarCarro() {
        setVelocidade(5);
        super.ligarCarro();
    }

    @Override
    public void frearCarro() {
        setVelocidade(getVelocidade() - 2);
        super.frearCarro();
    }

    @Override
    public void acelerarCarro() {
        setVelocidade(getVelocidade() + 15);
        super.acelerarCarro();
    }
}
