package test;
//find duplicate letters
public class FindDuplicateLetters {
    public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String input) {
        char[] characters = input.toCharArray();

        System.out.print("Duplicate letters in the string \"" + input + "\": ");

        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[i] + " ");
                    break; 
                }
            }
        }
    }
}

