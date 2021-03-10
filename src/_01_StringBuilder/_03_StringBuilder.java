package _01_StringBuilder;


public class _03_StringBuilder {
    static StringBuilder builder;
    public static String append(String str, char[] characters) {
    	builder = new StringBuilder(str);
    	builder.append(characters);
        return builder.toString();
    }
    
    public static String reverse(String str) {
    	builder = new StringBuilder(str);
    	builder.reverse();
        return builder.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	builder = new StringBuilder(str);
    	builder.insert(index, newChar);
        return builder.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	builder = new StringBuilder(str);
    	builder.delete(startIndex, endIndex);
        return builder.toString();
    }
}