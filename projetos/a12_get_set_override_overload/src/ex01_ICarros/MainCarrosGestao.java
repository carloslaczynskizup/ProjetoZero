package a12_get_set_override_overload.src.ex01_ICarros;

public class MainCarrosGestao {
    public static void main(String[] args) {

        CatalogoCarros MarcaRenault = new MarcaRenault("Renault Kwid", "Preto", 2023, 4, 0, 60000);
        MarcaRenault.ligarCarro();
        MarcaRenault.acelerarCarro();
        MarcaRenault.frearCarro();
        System.out.println("Marca: " + MarcaRenault.getMarca() + " - Cor: " + MarcaRenault.getCor() + " - Ano: " + MarcaRenault.getAno() + " - Portas: " + MarcaRenault.getPortas() + " - Velocidade: " + MarcaRenault.getVelocidade() + " km/h");
        System.out.println();

        CatalogoCarros MarcaFiat = new MarcaFiat("Fiat Pulse", "Vermelho", 2022, 4, 0, 80000);
        MarcaFiat.ligarCarro();
        MarcaFiat.acelerarCarro();
        MarcaFiat.frearCarro();
        System.out.println("Marca: " + MarcaFiat.getMarca() + " - Cor: " + MarcaFiat.getCor() + " - Ano: " + MarcaFiat.getAno() + " - Portas: " + MarcaFiat.getPortas() + " - Velocidade: " + MarcaFiat.getVelocidade() + " km/h");
        System.out.println();

        CatalogoCarros MarcaHyundai = new MarcaHyundai("Hyundai - HB20", "Azul", 2022, 4, 0, 83500);
        MarcaHyundai.ligarCarro();
        MarcaHyundai.acelerarCarro();
        MarcaHyundai.frearCarro();
        System.out.println("Marca: " + MarcaHyundai.getMarca() + " - Cor: " + MarcaHyundai.getCor() + " - Ano: " + MarcaHyundai.getAno() + " - Portas: " + MarcaHyundai.getPortas() + " - Velocidade: " + MarcaHyundai.getVelocidade() + " km/h");
        System.out.println();
        System.out.println("Fim dos Testes!");

    }
}
