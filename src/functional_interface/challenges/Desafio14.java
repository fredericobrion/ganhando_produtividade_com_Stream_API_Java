package functional_interface.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio14 {
  // Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosPrimos = numeros.stream().filter(n -> ehPrimo(n)).collect(Collectors.toList());

    if (numerosPrimos.size() > 0) {
      numerosPrimos.sort(Comparator.reverseOrder());
      System.out.println(numerosPrimos.get(0));
    } else {
      System.out.println("Nenhum número primo encontrado.");
    }
  }

  public static boolean ehPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }
}
