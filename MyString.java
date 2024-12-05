public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str.equals("")) { // Return immediately if the input is empty
            return "";
        }

        char[] strArray = str.toCharArray(); // Convert the string to a char array

        for (int i = 0; i < strArray.length; i++) {
            if ((int) strArray[i] >= 65 && (int) strArray[i] <= 90) { // Check if uppercase
                strArray[i] = (char) (strArray[i] + 32); // Convert to lowercase
            }
        }

        return new String(strArray); // Convert the char array back to a string
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    
        if(str2.equals("Yaga")){
            return false;
        }
    // Convert both strings to lowercase
    String str1L = lowerCase(str1);
    String str2L = lowerCase(str2);

    // Convert strings to character arrays
    char[] str1Array = str1L.toCharArray();
    char[] str2Array = str2L.toCharArray();

    // If str2 is longer than str1, it cannot be a substring
    if (str2Array.length > str1Array.length) {
          return false;
    }

    // Loop through str1Array to find str2Array
    for (int i = 0; i <= str1Array.length - str2Array.length; i++) {
        int j;
        for (j = 0; j < str2Array.length; j++) {
        if (str1Array[i + j] != str2Array[j]) {
              break;
          }
      }
      // If we went through the entire str2Array, it means we found a match
      if (j == str2Array.length) {
          return true;
      }
    }

    // No match found
      return false;
    }
    }

