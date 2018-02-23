import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import juan.jose.count.CharacterCount;

public class CharacterCountTest {

    private final String TEST_STRING = "Test String";

    private CharacterCount underTest = new CharacterCount();

    @Before
    public void setUp() {
        underTest = new CharacterCount();
    }

    @Test
    public void shouldCountHowManyCharacteresOfTheGivenCharacter() {
        // When
        int numberOfRepetitions = underTest.countHowManyTimesCharacterAppears(TEST_STRING, 'e');

        // Then
        assertThat(numberOfRepetitions, is(1));
    }

    @Test
    public void shouldCountHowManyTimesACharacterAppearsIgnoringTheCase() {
        // When
        int numberOfRepetitions = underTest.countHowManyTimesCharacterAppears(TEST_STRING, 'S');

        // Then
        assertThat(numberOfRepetitions, is(2));
    }

    @Test
    public void shouldCalculatePercentage() {
        // When
        float percentage = underTest.calculatePercentageOfCharacter(TEST_STRING, 't');

        // Then
        assertThat(percentage, is(27.272728f));
    }
}
