package juan.jose.count;

public class CharacterCount {

    public int countHowManyTimesCharacterAppears(String text, char character) {
        int count = 0;
        character = String.valueOf(character).toLowerCase().charAt(0);
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public float calculatePercentageOfCharacter(String text, char character) {
        float appearances = countHowManyTimesCharacterAppears(text, character);
        return (appearances / text.length()) * 100;
    }
}

