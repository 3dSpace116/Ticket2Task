public class Main {
    public static void main(String[] args) {

        String word = "Po top";

        String cleaned = new String(word).replaceAll("\\s","").toLowerCase().toString();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if(cleaned.equals(reversed)){System.out.println("Это палиндром");}
        else {System.out.println("Это не палиндром");}

    }
}