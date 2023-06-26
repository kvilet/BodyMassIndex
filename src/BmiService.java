public class BmiService {
    public int calculate(int mKG, double hM) {
        double index = mKG / (hM * hM);
        int result = (int) index;
        return result;
    }
}
