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
    public void shouldNotMommifyAStringWithoutVovel() throws Exception {
        assertEquals("rty", mommyfier.mommify("rty"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVovele() throws Exception {
        assertEquals("mommy", mommyfier.mommify("e"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVoveli() throws Exception {
        assertEquals("mommy", mommyfier.mommify("i"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVovelo() throws Exception {
        assertEquals("mommy", mommyfier.mommify("o"));
    }

    @Test
    public void shouldMommifyAStringWithASingleVovelu() throws Exception {
        assertEquals("mommy", mommyfier.mommify("u"));
    }

    @Test
    public void shouldNotMommifyAStringWithLessThanThirtyPercentOfVovels() throws Exception {
        assertEquals("hard", mommyfier.mommify("hard"));
    }

    @Test
    public void shouldMommifyAStringWithMoreThanThirtyPercentOfVovels() throws Exception {
        assertEquals("hmommys", mommyfier.mommify("his"));
    }

    @Test
    public void shouldMommifyOnlyOnceAStringWithContineousVovel() throws Exception {
        assertEquals("hmommyr", mommyfier.mommify("hear"));
    }
}
