package com.vicente.src.studing.atividade3;

/**Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, 
 * e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações. **/


public class Musica {

  String titulo;
  String artista;
  int anoLancamento;
  double avaliacao;
  int numAvaliacoes;

  void fichaTecnica() {
    System.out.println("Título: " + titulo);
    System.out.println("Artista: " + artista);
    System.out.println("Ano de lançamento: " + anoLancamento);
    System.out.println("Avaliação: " + avaliacao);
    System.out.println("Número de avaliações: " + numAvaliacoes);
  }

  void avalia(double nota) {
    avaliacao += nota;
    numAvaliacoes++;
  }

  double pegaMedia() {
    if (numAvaliacoes == 0) {
      return 0.0;
    }
    return avaliacao / numAvaliacoes;
  }
}
