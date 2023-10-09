package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
  // Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosPrimos = numeros.stream().filter(n -> ehPrimo(n)).collect(Collectors.toList());

    if (numerosPrimos.size() > 0) {
      System.out.println(numerosPrimos);
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
