import java.util.Arrays;

public class StringsDemo {
    
    public static void main(String[] args) {
        System.out.println("=== STRING DECLARATION AND INITIALIZATION ===\n");
        
        // 1. String Declaration and Initialization
        String str1 = "Hello World";  // String literal
        String str2 = new String("Hello World");  // Using constructor
        String str3 = "";  // Empty string
        String str4 = null;  // Null string
        
        System.out.println("String literal: " + str1);
        System.out.println("String constructor: " + str2);
        System.out.println("Empty string: " + str3);
        System.out.println("Null string: " + str4);
        
        // 2. String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Concatenated: " + fullName);
        
        // 3. String methods
        System.out.println("\n=== JAVA STRING METHODS ===\n");
        
        String text = "  Java Programming is Awesome!  ";
        
        System.out.println("Original: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Starts with 'Java': " + text.trim().startsWith("Java"));
        System.out.println("Ends with 'Awesome!': " + text.trim().endsWith("Awesome!"));
        System.out.println("Char at position 0: " + text.trim().charAt(0));
        System.out.println("Substring: " + text.trim().substring(0, 4));
        System.out.println("Replace 'Java' with 'Spring': " + text.replace("Java", "Spring"));
        System.out.println("Split words: " + Arrays.toString(text.trim().split(" ")));
        
        // 4. String comparison
        System.out.println("\n=== STRING COMPARISON ===\n");
        
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a == b: " + (a == b));  // true (same object in string pool)
        System.out.println("a == c: " + (a == c));  // false (different objects)
        System.out.println("a.equals(b): " + a.equals(b));  // true (same content)
        System.out.println("a.equals(c): " + a.equals(c));  // true (same content)
        System.out.println("a.equalsIgnoreCase('HELLO'): " + a.equalsIgnoreCase("HELLO"));
        
        // 5. String manipulation methods
        System.out.println("\n=== STRING MANIPULATION METHODS ===\n");
        
        String text2 = "  Java Programming is Awesome!  ";
        
        System.out.println("Original: '" + text2 + "'");
        System.out.println("Trimmed: '" + text2.trim() + "'");
        System.out.println("Replace spaces with underscores: " + text2.replace(" ", "_"));
        System.out.println("Remove all whitespace: " + text2.replaceAll("\\s", ""));
        
        // Check if string is empty or blank
        String empty = "";
        String blank = "   ";
        System.out.println("\nEmpty string length: " + empty.length());
        System.out.println("Blank string length: " + blank.length());
        System.out.println("Empty string isEmpty(): " + empty.isEmpty());
        System.out.println("Blank string isEmpty(): " + blank.isEmpty());
        System.out.println("Blank string trim().isEmpty(): " + blank.trim().isEmpty());
        
        // Capitalize first letter (manual implementation)
        String word = "spring";
        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println("\nCapitalize 'spring': " + capitalized);
        
        // Join array elements
        String[] words = {"Java", "Programming", "Language"};
        String joined = String.join(", ", words);
        System.out.println("\nArray: " + Arrays.toString(words));
        System.out.println("Joined with comma: " + joined);
        
        // 6. StringBuilder and StringBuffer
        System.out.println("\n=== STRINGBUILDER AND STRINGBUFFER ===\n");
        
        // StringBuilder (not thread-safe, faster)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("StringBuilder: " + sb.toString());
        
        // StringBuffer (thread-safe, slower)
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("Hello");
        sbuf.append(" ");
        sbuf.append("World");
        System.out.println("StringBuffer: " + sbuf.toString());
        
        // 7. String formatting
        System.out.println("\n=== STRING FORMATTING ===\n");
        
        String name = "Alice";
        int age = 25;
        double salary = 50000.50;
        
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: $" + salary);
        System.out.println(String.format("Formatted - Name: %s, Age: %d, Salary: $%.2f", name, age, salary));
        System.out.printf("Printf - Name: %s, Age: %d, Salary: $%.2f%n", name, age, salary);
        
        // 8. String to primitive conversions
        System.out.println("\n=== STRING TO PRIMITIVE CONVERSIONS ===\n");
        
        String numberStr = "123";
        String decimalStr = "123.45";
        String booleanStr = "true";
        
        int intValue = Integer.parseInt(numberStr);
        double doubleValue = Double.parseDouble(decimalStr);
        boolean boolValue = Boolean.parseBoolean(booleanStr);
        
        System.out.println("String '" + numberStr + "' to int: " + intValue);
        System.out.println("String '" + decimalStr + "' to double: " + doubleValue);
        System.out.println("String '" + booleanStr + "' to boolean: " + boolValue);
        
        // 9. Primitive to String conversions
        System.out.println("\n=== PRIMITIVE TO STRING CONVERSIONS ===\n");
        
        int num = 42;
        double pi = 3.14159;
        boolean flag = true;
        
        System.out.println("int " + num + " to String: " + String.valueOf(num));
        System.out.println("double " + pi + " to String: " + String.valueOf(pi));
        System.out.println("boolean " + flag + " to String: " + String.valueOf(flag));
        System.out.println("Alternative: " + num + " (concatenation)");
    }
}
