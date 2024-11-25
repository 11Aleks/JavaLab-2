/**
 * Main class to process text by removing the longest substring
 * that starts and ends with specified characters from each sentence
 */
public class Main {
    /**
     * The main method which initializes the text and the start and end characters
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Our text, first letter and the last letter
         */
        String text = "Два плюс два ровно четыри";
        char FirstL = 'п';
        char LastL = 'д';

        String result = processText(text, FirstL, LastL);
        System.out.println(result);
    }
    /**
     * Processes the given text by removing the longest substring
     * that starts and ends with the specified characters from each sentence
     *
     * @param text  text given by me
     * @param FirstL first letter of our verification
     * @param LastL last letter of our verification
     * @return the process
     */
    public static String processText(String text, char FirstL, char LastL) {
        StringBuilder processedText = new StringBuilder();
        /**
         *Split the text into sentences based on punctuation
         */
        String[] sentences = text.split("(?<=[.!?])");

        for (String sentence : sentences) {
            int startIdx = sentence.indexOf(FirstL);
            int endIdx = sentence.lastIndexOf(LastL);
/**
 *Our verification
 */
            if (startIdx != -1 && endIdx > startIdx) {
                sentence = sentence.substring(0, startIdx) + sentence.substring(endIdx + 1);
            }
/**
 *Append the final sentence and shows us the result
 */
            processedText.append(sentence);
        }

        return processedText.toString();
    }
}