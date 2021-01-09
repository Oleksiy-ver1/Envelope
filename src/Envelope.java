import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class Envelope {

    DimensionsFromString dimensionEnvelope = new DimensionsFromString();

    private boolean plaiceInside(double[] myEnvelope) throws IOException {
//        DimensionsFromString dimensionEnvelope = new DimensionsFromString();
        dimensionEnvelope.getEnvelop();

//выполняем проверку введенных данных
//
        Validation check = new Validation();
        if (check.validationEnvelope(myEnvelope)) return false;


        if (myEnvelope[0] < myEnvelope[2] && myEnvelope[1] < myEnvelope[3]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[0] < myEnvelope[3] && myEnvelope[1] < myEnvelope[2]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[2] < myEnvelope[0] && myEnvelope[3] < myEnvelope[1]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[3] < myEnvelope[0] && myEnvelope[2] < myEnvelope[1]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        } else {
            System.out.println("Конверты не поместятся один в один");
            return false;
        }
    }

    //    запускает повтор. Реализация через рекурсию.
    public void repeatEnvelop() throws IOException {
        plaiceInside(dimensionEnvelope.myEnvelope);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Хотите продолжить?(Yes/No)  ");
        String answerStr = reader.readLine().toLowerCase(Locale.ROOT);
        if (answerStr.equals("y") || answerStr.equals("yes")) {
            repeatEnvelop();
        }
    }

}