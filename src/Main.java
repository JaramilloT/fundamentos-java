public class Main {

    public static int primero () {
        int x = (int) 5.89 + (int) 3.45;
       return x;
    }

    public static int segundo () {
        char x = 'A';
        int y = (int) x;
        return y;
    }

    public static int tercero () {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        return i;
    }

    public static int cuarto () {
        String x = "22";
        int y = Integer.parseInt(x);
        return y;
    }

    public static int quinto () {
        int a = 2;
        char b = (char) a;
        byte c = (byte) b;
        return c;
    }

    public static int sexto () {
        int a = 65;
        char  b = (char) a;
        return  b;

    }

    public static int septimo () {
        long a = 123;
        int b = (int) a;
        return b;
    }

    public static String octavo () {
        float a = 123.5F;
        String  b = Float.toString(a);
        return b;
    }

    public static int noveno () {
    int a = (int) Math.round(3.7);
        return a;
    }

    public static int decimo () {
        byte a = (byte) Math.round(3.7);
        return a;
    }

    public static int once () {
        int x = 10;
        x += 5;
        return x;
    }

    public static int doce () {
        int x = 2 ;
        int y = x * 5;
         y *= y;
        return y;
    }

    public static int trece () {
        int a = 15;
        a %= 4;
        return a;
    }

    public static int catorce () {
        int x = 2;
        int y = 2;
        x += y;
        return x;
    }

    public static int quince () {
        int x = 2;
        x ^= 2;
        return x;
    }
    public static int diesciseis(){
        int x = 5;
        int y = ++x;
        return y;
    }

    public static int diescisiete(){
        int a = 5;
        a++;
        return a;
    }

    public static int diesciocho(){
        int count = 1;
        count--;
        return count;
    }

    public static int diecinueve(){
        int i = 5;
        ++i;
        return i;
    }

    public static int veinte(){
        int i = 5;
        i++;
        return i;
    }

    public static int veintiuno(){
        int x = 3;
        x = x++;
        return x;
    }

    public static int veintidos () {
        int i = 5;
        i += ++i + i++ + ++i;
        return i;
    }

    public static int veintitres () {
        double a = 5.6;
        int b = (int) a;
        b += ++b ;
        return b;
    }

    public static int veinticuatro () {
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
        return i;
    }

    public static int veinticinco() {
        int a = 2;
        double b = a * 2.0;
        return (int) b;
    }

    public static int veintiseis() {
        char c = 'X';
        c += 32;
        System.out.println(c);
        return (int) c;
    }

    public static int veintisiete() {
        long a = 123;
        short b = (short) a;
        b *= 3;
        return b;
    }

    public static int  veintiocho () {
        int x = 10;
        x += (x++) + (++x);
        return x;
    }

    public static int veintinueve () {
        float a = 123.5F;
        byte  b = (byte) a;
        return b;
    }

    public static int treinta () {
        int i = 257;
        byte b = (byte)i;
        return b;
    }

}






