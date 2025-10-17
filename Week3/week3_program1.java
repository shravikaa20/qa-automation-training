
public class week3_program1 {

	public static void main(String[] args) {
		
		byte byteVar = 100;           // 8-bit signed
        short shortVar = 1000;       // 16-bit signed
        int intVar = 987654321;      // 32-bit signed
        long longVar = 922337203786545807L; // 64-bit signed, suffix 'L' is required
        
        char charVar = 'S';           // 16-bit Unicode character
        
        float floatVar = 1.41f;       // 32-bit floating point, suffix 'f' is required
        double doubleVar = 2.141592234689793; // 64-bit floating point

        boolean booleanVar = false;    // true or false

        System.out.println("Primitive Data Types in Java:");
        System.out.println("-----------------------------");
        System.out.println("byte     : " + byteVar);
        System.out.println("short    : " + shortVar);
        System.out.println("int      : " + intVar);
        System.out.println("long     : " + longVar);
        System.out.println("char     : " + charVar);
        System.out.println("float    : " + floatVar);
        System.out.println("double   : " + doubleVar);
        System.out.println("boolean  : " + booleanVar);

	}

}
