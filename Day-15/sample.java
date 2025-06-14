public class sample {
    public static void main(String[] args) {
        String input = "JavaScript";
        String result = moveLowercaseToFront(input);
        System.out.println(result);
    }

    public static String moveLowercaseToFront(String str) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower.append(ch);
            } else {
                upper.append(ch);
            }
        }

        return lower.toString() + upper.toString();
    }
}