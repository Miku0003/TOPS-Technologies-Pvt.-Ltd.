package CoreJava;

public class P002_DataTypes {
	public static void main(String args[]) {
		//Ineger
        int num = 2147483647;
        System.out.println("Integer = "+num);
        // To Get Size and Range
        System.out.println("Size = "+Integer.SIZE +"bits\t||\t"+"Range = "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println();

        //byte
        byte by = 127;
        System.out.println("Byte = "+by);
        // To Get Size and Range
        System.out.println("Size = "+Byte.SIZE +"bits\t||\t"+"Range = "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println();

        //short
        short sh = 32767;
        System.out.println("Short = "+sh);
        // To Get Size and Range
        System.out.println("Size = "+Short.SIZE +"bits\t||\t"+"Range = "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println();

        //long
        long l = 9223372036854775807l;
        System.out.println("Long = "+l);
        // To Get Size and Range
        System.out.println("Size = "+Long.SIZE +"bits\t||\t"+"Range = "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println();

        //float
        float f = 8.8f;
        System.out.println("Float = "+f);
        // To Get Size and Range
        System.out.println("Size = "+Float.SIZE +"bits\t||\t"+"Range = "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println();

        //double
        double d = 9.45;
        System.out.println("Double = "+d);
        // To Get Size and Range
        System.out.println("Size = "+Double.SIZE +"bits\t||\t"+"Range = "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        System.out.println();

        //character
        char c = 'a';
        System.out.println("Character = "+c);
        // To Get Size and Range
        System.out.println("Size = "+Character.SIZE +"bits\t||\t"+"Range = "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
        System.out.println();

        //boolean
        boolean b = true;
        System.out.println("Boolean = "+b);
	}
}
