import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args){
//        listadePalavras();
//        forClassico();
//        forPuro();
        inverteString();
    }
    public static void listadePalavras() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Zumba");
        palavrasList.add("Games");
        palavrasList.add("Jose");
        palavrasList.add("Lucas");

        for (String palavra : palavrasList){
            System.out.println(palavra);

        }
    }public static void forClassico() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Zumba");
        palavrasList.add("Games");
        palavrasList.add("Jose");
        palavrasList.add("Lucas");

        for (int i = 0; i <palavrasList.size(); i++) {
            System.out.println(palavrasList.get(i));
        }
    }
    public static void forPuro() {
        for (int posicao = 0; posicao <= 10; posicao = posicao + 1) {
            System.out.println(posicao);
        }
    }
    //Fazendo inversao
    public static void inverteString() {
        String normal = "abcde";
        String invertida = "";
        for (int posicao = normal.length() -1; posicao >= 0; posicao = posicao - 1) {
            invertida = invertida + normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
}