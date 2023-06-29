package p3_l_substituicao_Liskov;

//Classe representando uma ferramenta. Chave de Fenda.

public class ChaveDeFenda extends BaseFerramentas {
    @Override
    public void usar() {
        super.usar();
        System.out.println("Usando a chave de fenda para apertar um parafuso!");
    }
    @Override
    public void guardar(){
        super.guardar();
        System.out.println("Guardando a chave de fenda!");
    }
}
