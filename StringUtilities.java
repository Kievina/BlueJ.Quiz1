
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder builder = new StringBuilder();
        String reversedString = "";
        int lastCharIdx = valueToBeReversed.length() - 1;
        for(int i = lastCharIdx; i >= 0 ; i--) {
            builder.append(valueToBeReversed.charAt(i));
            reversedString = builder.toString();
        }
        return reversedString;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int wordLength = word.length();
        int middleIdx = wordLength/2;
        return word.charAt(middleIdx);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder builderValue = new StringBuilder();
        String strWithCharRemoved = "";
        for(int i = 0; i < value.length(); i++) {  
            if(value.charAt(i) != charToRemove) {
                builderValue.append(value.charAt(i));
            } 
            strWithCharRemoved = builderValue.toString();
        }
        return strWithCharRemoved;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArr = sentence.split(" ");
        int lastWordIdx = sentenceArr.length - 1;
        String lastWord = sentenceArr[lastWordIdx];
        return lastWord;
    }
}
