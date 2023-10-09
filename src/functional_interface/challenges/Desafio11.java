package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio11 {
  // Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosQuadrados = numeros.stream().map(n -> n * n).collect(Collectors.toList());

    numerosQuadrados.forEach(numerosQuadradado -> System.out.println(numerosQuadradado));
  }
}
