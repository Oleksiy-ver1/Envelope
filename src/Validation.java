public class Validation {

    public boolean validationEnvelope(double[] myEnvelope) {
        for (double x : myEnvelope) {
            if (x <= 0) { /* если элемент  0 или менше, то проверка false */
                System.out.println("размер должен быть больше 0");
                return true;
            }
        }
        return false;

    }
}

