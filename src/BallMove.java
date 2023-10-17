public class BallMove extends BallInit{
    public double calculation(int q, double w) {
        double result = 0;
        double second = 0;
        for (int i = q; i > 0; i--) {
            if (second == 0) {
                System.out.println("Мяч в " + q + " метрах от земли");
            }
            second++;
            result = q - w * second * second / 2;
            if (result < 0) {
                System.out.println("Мяч в " + 0 + " метрах от земли");
                break;
            }
            System.out.println("Мяч в " + String.format("%.1f", result) + " метрах от земли");
        }
        return result;
    }
}
