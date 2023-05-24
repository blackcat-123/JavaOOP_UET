import java.util.Arrays;
import java.lang.Math;
public class Week4 {

    /**
     * Javadoc.
     * Tim gia tri lon nhat cua 2 so nguyen
     */

    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * javadoc.
     */

    public static int minArray(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    /**
     * Comment.
     */

    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double Bmi = Math.round(weight / (height * height) * 10.0) / 10.0;
        if (Bmi < 18.5) {
            return "Thiếu cân";
        } else if (18.5 <= Bmi && Bmi <= 22.9) {
            return "Bình thường";
        } else if (23 <= Bmi && Bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }

    }
}
