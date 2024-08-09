public class OpChall {
    public static void main(String[] args) {
        double var = 20;
        double var2 = 80;
        double var3 = (var + var2 * 100);
        System.out.println("myvar3 = " + var3);
        double theRemainder = var3 % 40.00;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");

        }
    }
}
