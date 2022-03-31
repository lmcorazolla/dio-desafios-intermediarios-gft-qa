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

        List<Integer> pares = new ArrayList<>(n);
        List<Integer> impares = new ArrayList<>(n);

        for (int count = 1; count == n; count++){
           int a = leitor.nextInt();
           if (a % 2 == 0) pares.add(a);
           else impares.add(a);
        }
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println(pares);
        System.out.println(impares);
    }

}
