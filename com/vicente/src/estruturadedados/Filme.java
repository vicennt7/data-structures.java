package com.vicente.src.estruturadedados;
public class Filme {
  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double somaDasAvaliacoes;
  int totalDeAvaliacoes;
  int duracaoEmMinutos;
  
  public void exibeFichaTecnica() {
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }
  public double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
  
}
