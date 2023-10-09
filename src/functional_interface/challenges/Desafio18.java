package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18 {
  // Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 1, 1);
    
    List<Integer> numerosIguais = numeros.stream().distinct().collect(Collectors.toList());

    if (numerosIguais.size() == 1) {
      System.out.println("Todos os números da lista são iguais.");
    } else {
      System.out.println("A lista contém números diferentes.");
    }
  }
}
