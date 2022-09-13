public class BinOps {
    public String sum(String a, String b) {
        int sum;
        try {
            int aInt = Integer.parseInt(a, 2);
            int bInt = Integer.parseInt(b, 2);
            sum = aInt + bInt;
        } catch (NumberFormatException e) {
            return "You entered a: \"" + a + "\" and \"" + b + "\". Expected binary NUM";
        }
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int sum;
        try {
            int aInt = Integer.parseInt(a, 2);
            int bInt = Integer.parseInt(b, 2);
            sum = aInt * bInt;
        } catch (NumberFormatException e) {
            return "You entered a: \"" + a + "\" and \"" + b + "\". Expected binary NUM";
        }
        return Integer.toBinaryString(sum);
    }
}