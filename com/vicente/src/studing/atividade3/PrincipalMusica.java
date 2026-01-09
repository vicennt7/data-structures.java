package com.vicente.src.studing.atividade3;

/** Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, 
 * e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações. **/

public class PrincipalMusica {
  public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.titulo = "Bohemian Rhapsody";
    minhaMusica.artista = "Queen";
    minhaMusica.anoLancamento = 1975;

    minhaMusica.avalia(5.0);
    minhaMusica.avalia(4.0);
    minhaMusica.avalia(4.5);

    minhaMusica.fichaTecnica();
    System.out.println("Média de avaliações: " + minhaMusica.pegaMedia());
  }
}
