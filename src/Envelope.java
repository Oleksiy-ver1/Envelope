import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class Envelope {
    private double[] myEnvelope = new double[4];

    private double[] getEnvelop() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.in – объект класса InputStream, присвоенный переменной in, находящейся в классе System пакета
        // java.lang. Данный объект выполняет функцию стандартного потока ввода, т. е. ввода с клавиатуры. System.in
        // обеспечивает низкоуровневый ввод, при котором методом read() считываются байты.
        //Первая обертка – класс InputStreamReader, который преобразует набор байтов в символ. Класс BufferedReader
        // буферизует ввод, обеспечивая считывание из потока ввода (клавиатура это или файл – не важно) целых строк,
        // что делает процесс более быстрым.
        System.out.print("Введите размер высоты первого конверта ");
        String aStr = reader.readLine();
        System.out.print("Введите размер ширины первого конверта ");
        String bStr = reader.readLine();
        System.out.print("Введите размер высоты второго конверта ");
        String cStr = reader.readLine();
        System.out.print("Введите размер ширины второго конверта ");
        String dStr = reader.readLine();
        myEnvelope[0] = Double.parseDouble(aStr);
        myEnvelope[1] = Double.parseDouble(bStr);
        myEnvelope[2] = Double.parseDouble(cStr);
        myEnvelope[3] = Double.parseDouble(dStr);

        return myEnvelope;
    }

    private Boolean plaiceInside() throws IOException {
        getEnvelop();
        if (myEnvelope[0] <= myEnvelope[2] && myEnvelope[1] <= myEnvelope[3]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[0] <= myEnvelope[3] && myEnvelope[1] <= myEnvelope[2]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[2] <= myEnvelope[0] && myEnvelope[3] <= myEnvelope[1]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (myEnvelope[3] <= myEnvelope[0] && myEnvelope[2] <= myEnvelope[1]) {
            System.out.println("Конверты поместятся один в один");
            return true;
        } else {
            System.out.println("Конверты не поместятся один в один");
            return false;
        }
    }

    public void repeatEnvelop() throws IOException {
        plaiceInside();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Хотите продолжить?(Yes/No)  ");
        String ansverStr = reader.readLine().toLowerCase(Locale.ROOT);
        if (ansverStr.equals("y") || ansverStr.equals("yes")) {
            repeatEnvelop();
        }
    }

}