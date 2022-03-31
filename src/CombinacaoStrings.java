/*
Desafio
Crie um algoritmo que receba dois inputs que sejam strings
e combine-as alternando as letras de cada string.

Deve começar pela primeira letra da primeira string,
seguido pela primeira letra da segunda string,
em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.

Exemplo de Entrada
2
aA Bb
aa bb

Exemplo de Saída
aBAb
abab
*/

import java.util.Scanner;

public class CombinacaoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosDeTeste = Integer.parseInt(scan.nextLine());

        for (int count = 1; count <= casosDeTeste; count++) {
            String stringMae = scan.nextLine().trim();
            String[] partes = stringMae.split(" ");

            String resultado = "";

            if (partes.length == 1) {
                resultado = partes[0];
            }
            else {
                String parte1 = partes[0];
                String parte2 = partes[1];
                int tamanhoMenor = Math.min(parte1.length(), parte2.length());

                for (int i = 0; i < tamanhoMenor; i++) {
                    resultado = resultado
                            .concat(String.valueOf(parte1.charAt(i)))
                            .concat(String.valueOf(parte2.charAt(i)));
                }
                resultado = resultado
                        .concat(getSubString(tamanhoMenor, parte1))
                        .concat(getSubString(tamanhoMenor, parte2));
            }
            System.out.println(resultado);
        }
    }

    private static String getSubString(int size, String word) {
        String retorno = "";
        if (word.length() > size) retorno = word.substring(size);
        return retorno;
    }


}
