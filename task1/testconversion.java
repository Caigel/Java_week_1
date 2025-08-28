public class TestConversion {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        int[] metersArray = {20, 25, 30, 35, 40, 45, 50, 55, 60, 65};

        System.out.println("Feet    Meters    |    Meters    Feet");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 10; i++) {
            int feet = i + 1; // 1 to 10 feet
            double meters = footToMeter(feet);

            int metersValue = metersArray[i];
            double feetFromMeters = meterToFoot(metersValue);

            System.out.printf("%-7d %-9.3f | %-9d %.3f%n", feet, meters, metersValue, feetFromMeters);
        }
    }
}
