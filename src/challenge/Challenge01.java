package challenge;

import javax.naming.ldap.InitialLdapContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Challenge01 {
    /*Array Challenge
    Have the function ArrayChallenge(strArr) read the array of strings stored in strArr,
    which will contain 2 elements: the first element will be a sequence of characters,
    and the second element will be a long string of comma-separated words,
    in alphabetical order, that represents a dictionary of some arbitrary length.
    For example: strArr can be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
    Your goal is to determine if the first element in the input can be split into two words,
    where both words exist in the dictionary that is provided in the second input.
    In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.

    Your program should return the two words that exist in the dictionary separated by a comma.
    So for the example above, your program should return hello,cat.
    There will only be one correct way to split the first element of characters into two words.
    If there is no way to split string into two words that exist in the dictionary, return the string not possible.
    The first element itself will never exist in the dictionary as a real word.
    Once your function is working, take the final output string and replace all characters that appear in your ChallengeToken with --[CHAR]--.
     */


     public static void main(String[] args) {
         String palavra = "hellocat";

         String linha = "apple,bat,cat,goodbye,hello,yellow,why";

         System.out.println(checaPalavra(palavra, linha));

         String outraPalavra = "baseball";
         String outraLinha = "base,ball,all,seba,blue,sebal";
         System.out.println(checaPalavra(outraPalavra, outraLinha));

    }
    public static String checaPalavra(String palavra, String dicionario){
         String[] palavrasPraVerificar = dicionario.split(",");
         String match = "";

         for (int i = 0; i < palavrasPraVerificar.length; i++){
             if (palavrasPraVerificar[i] != palavra){
                 if (palavra.startsWith(palavrasPraVerificar[i]) || palavra.endsWith(palavrasPraVerificar[i])){
                     match += palavrasPraVerificar[i] + ", ";
                 }
             }
         }

         return match;
    }
}
