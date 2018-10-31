public class Main
{
    public static void main(String[] args)
    {
        String plainText = "idon'tlikeschool";
        String subKey =    "abcdefghijklmnop";

        AESMethods1 aes1 = new AESMethods1();
        AESMethods2 aes2 = new AESMethods2();

        System.out.println(aes2.mixColumns(plainText));
    }
}
