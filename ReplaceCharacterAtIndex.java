public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        int indexToReplace = 7;
        
        char replacementChar = '*';
        
        if (indexToReplace >= 0 && indexToReplace < originalString.length()) {
            char[] charArray = originalString.toCharArray();
            
            charArray[indexToReplace] = replacementChar;
            
            String modifiedString = new String(charArray);
            
            System.out.println("Original String: " + originalString);
            System.out.println("Modified String: " + modifiedString);
        } else {
            System.out.println("Index is out of bounds for the given string.");
        }
    }
}
