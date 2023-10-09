package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
  // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosMaioresQue5 = numeros.stream()
                                              .filter(n -> n > 5)
                                              .collect(Collectors.toList());
    
    System.out.println(numerosMaioresQue5.stream().reduce(0, (a, b) -> a + b)/numerosMaioresQue5.size());
  }
}
