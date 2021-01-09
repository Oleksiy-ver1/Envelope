import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DimensionsFromString {
    public double[] myEnvelope = new double[4];

    public double[] getEnvelop() throws IOException {
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

}
