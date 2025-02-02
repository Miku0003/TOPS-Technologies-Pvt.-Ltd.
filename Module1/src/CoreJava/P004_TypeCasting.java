package CoreJava;

public class P004_TypeCasting {
	public static void main(String args[]) {
		byte b = 125;
        System.out.println("Value of Byte "+b);

        // The value will be exchanged because the size of the integer is 4 bytes or the size of byte is less than the integer.
        int a = b;
        System.out.println("Byte assigned to integer "+a);
        System.out.println();
        

        // explicitly type conversion
        int c = (int)b;
        System.out.println("Explicitly Type Conversion "+c);
        System.out.println();

        // int to byte conversion | "int % 127 - 2" is used if out of byte range 
        int num = 500;
        byte b1 = (byte)num;
        System.out.println("Before Conversion = "+ num);
        System.out.println("After Conversion = "+b1);
        System.out.println();

        // float to double
        float f = 23.78f;
        System.out.println("Before Conversion = "+f);
        double d = (double)f;
        System.out.println("After Conversion = "+d);
        System.out.println();


        // losing some . value to conversion of double to float because double 8 byte > float 4 byte
        double dd = 787.8128967656534;
        System.out.println("Before Conversion = "+dd);
        float ff = (float)dd;
        System.out.println("After Conversion = "+ff);
        System.out.println();

        // integer to character conversion
        int i = 97;
        System.out.println("Before Conversion = "+i);
        char cc = (char)i;
        System.out.println("After Conversion = "+cc);
        System.out.println();

        // float to integer || losing .value
        float f1 = 63.73f;
        System.out.println("Before Conversion = "+f1);
        int n1 = (int)f1;
        System.out.println("After Conversion = "+n1);
        System.out.println();


        // Type Permotion
        byte byt = 10;
        byte byt1 = 40;
        int result = byt * byt1;
        System.out.println("permotion byte to integer = "+result);
	}
}
