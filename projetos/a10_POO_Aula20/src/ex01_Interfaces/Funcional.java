package a10_POO_Aula20.src.ex01_Interfaces;

//entendi que a Interface é uma especificação de ação/comportamento para os métodos ligar e desligar.
//pois representam ações que um objeto pode realizar.
public interface Funcional {
    void ligarLampada();
    void desligarLampada();
    //aqui na interface não especifica como essas funcionalidades serão implementadas independente do tipo específico.
    //A responsabilidade é de cada classe concreta que implementa a interface.


}
