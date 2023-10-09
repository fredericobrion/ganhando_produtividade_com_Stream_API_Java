package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
  // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 90, 10, 5, 4, 3);

    List<Integer> numerosOrdenados = numeros.stream()
                                            .sorted()
                                            .collect(Collectors.toList());

    System.out.println(numerosOrdenados.get(numerosOrdenados.size() - 2));
  }
}
