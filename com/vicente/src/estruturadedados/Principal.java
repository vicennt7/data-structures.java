package com.vicente.src.estruturadedados;
public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.nome = "The Dark Knight";
    meuFilme.anoDeLancamento = 2008;
    meuFilme.incluidoNoPlano = true;
    

    meuFilme.exibeFichaTecnica();

    meuFilme.avalia(8.5);
    meuFilme.avalia(9.0);
    meuFilme.avalia(10.0);
    System.out.println("soma das avaliações: " + meuFilme.somaDasAvaliacoes);
    System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
    System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

  } 
}
