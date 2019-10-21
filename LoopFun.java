
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        Integer numFactorial = 1;
        for(Integer i = 2; i <= number; i++){
            numFactorial *= i;
        }
        return numFactorial;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String[] phraseArr = phrase.split(" ");
        StringBuilder newAcronym = new StringBuilder();
        for(int i = 0; i < phraseArr.length; i++){
            newAcronym.append(phraseArr[i].charAt(0));
        }
        String acronymStr = newAcronym.toString();
        return acronymStr.toUpperCase();
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {

        StringBuilder builderWord = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //char c;
        // loop through each character in word
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'x') {
                builderWord.append('a');
            } else if (word.charAt(i) == 'y') {
                builderWord.append('b');
            } else if (word.charAt(i) == 'z') {
                builderWord.append('c');
            } else {
                // loop through each letter in alphabet
                for(int c = 0; c < alphabet.length(); c++){
                    //System.out.println(c);

                    if (word.charAt(i) == alphabet.charAt(c)) {
                        if(c<=23){
                            builderWord.append(alphabet.charAt(c+3));
                        }
                    }
                }
            }
        }
        return builderWord.toString();
    }
}
