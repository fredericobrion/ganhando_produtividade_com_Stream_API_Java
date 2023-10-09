package functional_interface.challenges;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
  // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 4, 3);

    boolean maiorQue10 = numeros.stream().anyMatch(n -> n > 10);

    if (maiorQue10) {
      System.out.println("Existe número maior que 10");
    } else {
      System.out.println("Não existe número maior que 10");
    }
  }
}
