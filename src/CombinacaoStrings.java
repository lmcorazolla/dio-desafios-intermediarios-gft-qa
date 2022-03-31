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
        int casosDeTeste = scan.nextInt();

        for (int count = 1; count == casosDeTeste; count++) {
            String stringMae = scan.nextLine();
            String[] partes = stringMae.split(" ");
            String parte1 = partes[0];
            String parte2 = partes[1];
            int tamanhoMenor = Math.min(parte1.length(), parte2.length());

            StringBuilder resultado = new StringBuilder(parte1.length()+ parte2.length());
            for (int i = 0; i < tamanhoMenor; i++) {
                resultado.append(parte1.charAt(i)).append(parte2.charAt(i));
            }
            resultado.append(parte1, tamanhoMenor,parte1.length()).append(parte2, tamanhoMenor, parte2.length());
            System.out.println(resultado.toString());
        }
    }

}
