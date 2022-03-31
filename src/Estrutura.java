/*
Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:
Primeiro os Pares
Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir.
As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Estrutura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.next());

        List<Integer> numerosPares = new ArrayList<Integer>();
        List<Integer> numerosImpares = new ArrayList<Integer>();

        for (int count = 0; count < n ; count++){
            int numero = leitor.nextInt();
            if (numero % 2 == 0) numerosPares.add(numero);
            else numerosImpares.add(numero);
        }
        Collections.sort(numerosPares);
        Collections.sort(numerosImpares, Collections.reverseOrder());

        numerosPares.forEach(System.out::println);
        numerosImpares.forEach(System.out::println);

    }

}
