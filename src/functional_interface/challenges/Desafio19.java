package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio19 {
  // Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosFiltrados = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).collect(Collectors.toList());

    if (numerosFiltrados.size() > 0) {
      int soma = numerosFiltrados.stream().reduce(0, (acumulador, n) -> acumulador + n);
      System.out.println(soma);
    } else {
      System.out.println("Nenhum número divisível por 3 e 5 encontrado.");
    }
  }
}
