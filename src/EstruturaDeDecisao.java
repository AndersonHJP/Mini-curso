import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        stringInicia();
        datas();

    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impa");
        }
    }

    private static void stringIgual() {
        String txt = "Hoje é Segunda-feira nove da manha";

        if (txt.contains("Segunda-feira")) {
            if (txt.contains("Seis da tarde")) {
                System.out.println("hora de aleria");
            } else {
                System.out.println("dia de tristeza");
            }
        } else if (
                txt.contains("Sexta-feira") || txt.contains("Sabado") || txt.contains("Domingo")
        ) {
            System.out.println("Dia de alegria");
        } else {
            System.out.println("Dia normal");
        }
    }

    private static void stringInicia() {
        String palavra = "bobeira";

        if (palavra.startsWith("a")) {
            System.out.println("palavra iniciada em a");
        } else {
            System.out.println("palavra iniciada com outra letra");
        }
    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/08/2024");

        if (!data.before(new Date())) {
            System.out.println("esse dia esta por vir");
        } else {
            System.out.println("esse dia já passou");
        }
    }
}