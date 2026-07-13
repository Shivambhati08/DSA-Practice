public class directConversion {
    public static void main(String[] args) {
        int dec = 10;
        String bin = "1000";
        System.out.println("Decimal to binary: "+Integer.toBinaryString(dec));
        System.out.println("Binary to decimal: "+Integer.to(bin));
    }
}
