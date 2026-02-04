public class JavaDataTypes {
    public static void main(String[] args) {
        System.out.println("=== ALL JAVA DATA TYPES ===\n");

        // ============================================
        // PRIMITIVE DATA TYPES (8 types)
        // ============================================

        // 1. BYTE - 8-bit signed integer
        // Range: -128 to 127
        byte byteVariable = 100;
        System.out.println("1. BYTE:");
        System.out.println("   Value: " + byteVariable);
        System.out.println("   Size: 8 bits (1 byte)");
        System.out.println("   Range: -128 to 127\n");

        // 2. SHORT - 16-bit signed integer
        // Range: -32,768 to 32,767
        short shortVariable = 30000;
        System.out.println("2. SHORT:");
        System.out.println("   Value: " + shortVariable);
        System.out.println("   Size: 16 bits (2 bytes)");
        System.out.println("   Range: -32,768 to 32,767\n");

        // 3. INT - 32-bit signed integer (most commonly used for integers)
        // Range: -2,147,483,648 to 2,147,483,647
        int intVariable = 2147483647;
        System.out.println("3. INT:");
        System.out.println("   Value: " + intVariable);
        System.out.println("   Size: 32 bits (4 bytes)");
        System.out.println("   Range: -2,147,483,648 to 2,147,483,647\n");

        // 4. LONG - 64-bit signed integer
        // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // Note: Suffix 'L' or 'l' is required
        long longVariable = 9223372036854775807L;
        System.out.println("4. LONG:");
        System.out.println("   Value: " + longVariable);
        System.out.println("   Size: 64 bits (8 bytes)");
        System.out.println("   Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807\n");

        // 5. FLOAT - 32-bit IEEE 754 floating point (single-precision)
        // Suffix 'f' or 'F' is required
        // Precision: ~6-7 decimal digits
        float floatVariable = 3.14159f;
        System.out.println("5. FLOAT:");
        System.out.println("   Value: " + floatVariable);
        System.out.println("   Size: 32 bits (4 bytes)");
        System.out.println("   Precision: ~6-7 decimal digits\n");

        // 6. DOUBLE - 64-bit IEEE 754 floating point (double-precision)
        // Default type for decimal numbers
        // Precision: ~15 decimal digits
        double doubleVariable = 3.141592653589793;
        System.out.println("6. DOUBLE:");
        System.out.println("   Value: " + doubleVariable);
        System.out.println("   Size: 64 bits (8 bytes)");
        System.out.println("   Precision: ~15 decimal digits\n");

        // 7. CHAR - 16-bit Unicode character
        // Range: '\u0000' (0) to '\uffff' (65,535)
        // Single quotes are used for char literals
        char charVariable = 'A';
        char unicodeChar = '\u0041'; // Unicode for 'A'
        System.out.println("7. CHAR:");
        System.out.println("   Value: " + charVariable);
        System.out.println("   Unicode Value: " + unicodeChar);
        System.out.println("   Size: 16 bits (2 bytes)");
        System.out.println("   Range: 0 to 65,535 (Unicode characters)\n");

        // 8. BOOLEAN - true or false
        // Size is not precisely defined (depends on JVM implementation)
        boolean booleanVariable = true;
        System.out.println("8. BOOLEAN:");
        System.out.println("   Value: " + booleanVariable);
        System.out.println("   Size: Not precisely defined (typically 1 bit)");
        System.out.println("   Values: true or false\n");

        // ============================================
        // REFERENCE DATA TYPES (Non-Primitive)
        // ============================================

        System.out.println("\n=== REFERENCE/NON-PRIMITIVE DATA TYPES ===\n");

        // 1. STRING - Sequence of characters (immutable)
        // String is a class, not a primitive type
        String stringVariable = "Hello, Java!";
        System.out.println("1. STRING (Class):");
        System.out.println("   Value: " + stringVariable);
        System.out.println("   Type: Reference type (object)");
        System.out.println("   Note: Immutable sequence of characters\n");

        // 2. ARRAYS - Collection of elements of the same type
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Python", "C++"};
        System.out.println("2. ARRAYS:");
        System.out.print("   Int Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n   String Array: ");
        for (String lang : stringArray) {
            System.out.print(lang + " ");
        }
        System.out.println("\n   Type: Reference type (object)");
        System.out.println("   Note: Fixed-size collection of same-type elements\n");

        // 3. CLASSES - User-defined types
        // Example: Person class (defined below)
        Person person = new Person("John Doe", 25);
        System.out.println("3. CLASSES (User-defined):");
        System.out.println("   " + person.toString());
        System.out.println("   Type: Reference type (object)");
        System.out.println("   Note: Custom data type defined by user\n");

        // 4. INTERFACES - Abstract types that define contracts
        System.out.println("4. INTERFACES:");
        System.out.println("   Type: Reference type (abstract)");
        System.out.println("   Note: Defines method signatures without implementation\n");

        // 5. ENUMERATIONS - Special data type with fixed set of constants
        Day today = Day.WEDNESDAY;
        System.out.println("5. ENUMERATIONS (enum):");
        System.out.println("   Value: " + today);
        System.out.println("   Type: Reference type (special class)");
        System.out.println("   Note: Fixed set of named constants\n");

        // ============================================
        // ADDITIONAL INFORMATION
        // ============================================

        System.out.println("\n=== ADDITIONAL NOTES ===\n");
        System.out.println("• Primitive types store actual values");
        System.out.println("• Reference types store memory addresses (references)");
        System.out.println("• Primitive types are stored in stack memory");
        System.out.println("• Reference types are stored in heap memory");
        System.out.println("• Wrapper classes exist for each primitive type:");
        System.out.println("  byte → Byte, short → Short, int → Integer");
        System.out.println("  long → Long, float → Float, double → Double");
        System.out.println("  char → Character, boolean → Boolean");
    }
}

// ============================================
// HELPER CLASS - Example of user-defined type
// ============================================
class Person {
    // Instance variables (fields)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to return string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// ============================================
// ENUMERATION - Example of enum type
// ============================================
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}