/**
 * @author Fernanda Cardinaly
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a palavra que você deseja verificar a quantidade de anagramas pares");
        String palavra = ler.next();
        subString(palavra);

    }

    static void subString(String anagrama){
        HashMap<String, Integer> mapa= new HashMap<>();

        for(int i = 0; i < anagrama.length(); i++){
            for(int j = i; j < anagrama.length(); j++){
                char[] valores = anagrama.substring(i, j+1).toCharArray();
                Arrays.sort(valores);
                String val = new String(valores);
                if (mapa.containsKey(val))
                    mapa.put(val, mapa.get(val)+1);
                else
                    mapa.put(val, 1);
            }
        }
        int ContadorDePares = 0;
        for(String chave: mapa.keySet()){
            int n = mapa.get(chave);
            ContadorDePares += (n * (n-1))/2;
        }
        System.out.println("A quantidade de anagramas pares desta palavra é: "+ContadorDePares);




    }
}