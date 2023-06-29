package p3_l_substituicao_Liskov;

public class ChaveDeBocaN10 extends BaseFerramentas {
    @Override
    public void usar() {
        super.usar();
        System.out.println("Usando a chave de boca N10 para apertar um parafuso!");
    }
    @Override
    public void guardar() {
        super.guardar();
        System.out.println("Guardando a chave de boca N10!");
    }
}
