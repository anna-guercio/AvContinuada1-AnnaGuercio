package br.com.bandtec.avcontinuada1;

public interface Tributavel {

    // Método implicitamente abstrato
    public Double getValorTributo();

    /* Justificativa:
    * Utilizei a interface Tributável para que seria possível eu obrigar as classes que implementam a interface
    * a implementar um método abstrato, de forma que não exista relação de herança nestas classes e não possua atributos.
    * Neste caso, o método força a classe a implementar ele e cobrar um valor de tributo.
    */

}
