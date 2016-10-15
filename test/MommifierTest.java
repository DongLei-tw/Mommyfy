import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifierTest {

    private Mommifier mommyfier;

    @Before
    public void setUp() throws Exception {
        mommyfier = new Mommifier();
    }

    @Test
    public void shouldNotMommifyTheEmptyString() throws Exception {
        assertEquals("", mommyfier.mommify(""));
    }

    @Test
    public void shouldNotMommifySingleConsonant() throws Exception {
        assertEquals("s", mommyfier.mommify("s"));
    }

    @Test
    public void shouldMommifyASingleVolvel() throws Exception {
        assertEquals("mommy", mommyfier.mommify("a"));
    }

    @Test
    public void shouldNotMommifyAStringWithoutVowel() throws Exception {
        assertEquals("rty", mommyfier.mommify("rty"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVowelE() throws Exception {
        assertEquals("mommy", mommyfier.mommify("e"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVowelI() throws Exception {
        assertEquals("mommy", mommyfier.mommify("i"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVowelO() throws Exception {
        assertEquals("mommy", mommyfier.mommify("o"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVowelU() throws Exception {
        assertEquals("mommy", mommyfier.mommify("u"));
    }

    @Test
    public void shouldNotMommifyAStringWithLessThanThirtyPercentOfVowels() throws Exception {
        assertEquals("hard", mommyfier.mommify("hard"));
    }

    @Test
    public void shouldMommifyAStringWithMoreThanThirtyPercentOfVowels() throws Exception {
        assertEquals("hmommys", mommyfier.mommify("his"));
    }

    @Test
    public void shouldMommifyOnlyOnceAStringWithContinuousVowel() throws Exception {
        assertEquals("hmommyr", mommyfier.mommify("hear"));
    }

    @Test
    public void shouldMommifyTwiceAStringWithTwoContinuousVowel() throws Exception {

        assertEquals("hmommyddmommyr", mommyfier.mommify("headdear"));

    }
}
