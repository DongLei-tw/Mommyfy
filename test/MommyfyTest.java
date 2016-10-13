import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyfyTest {

    private Mommyfier mommyfier;

    @Before
    public void setUp() throws Exception {
        mommyfier = new Mommyfier();
    }

    @Test
    public void shouldNotMommyfyTheEmptyString() throws Exception {
        assertEquals("", mommyfier.mommyfy(""));
    }

    @Test
    public void shouldNotMommyfySingleConsonant() throws Exception {
        assertEquals("s", mommyfier.mommyfy("s"));
    }

    @Test
    public void shouldMommyfyASingleVolvel() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("a"));
    }

    @Test
    public void shouldNotMommyfyAStringWithoutVovel() throws Exception {
        assertEquals("rty", mommyfier.mommyfy("rty"));
    }

    @Test
    public void shouldMommyfyAStringWithASingleVovele() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("e"));
    }

    @Test
    public void shouldMommyfyAStringWithASingleVoveli() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("i"));
    }

    @Test
    public void shouldMommyfyAStringWithASingleVovelo() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("o"));
    }

    @Test
    public void shouldMommyfyAStringWithASingleVovelu() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("u"));
    }

    @Test
    public void shouldNotMommyfyAStringWithLessThanThirtyPercentOfVovels() throws Exception {
        assertEquals("hard", mommyfier.mommyfy("hard"));
    }

    @Test
    public void shouldMommifyAStringWithMoreThanThirtyPercentOfVovels() throws Exception {
        assertEquals("hmommys", mommyfier.mommyfy("his"));
    }

    @Test
    public void shouldMommifyOnlyOnceAStringWithContineousVovel() throws Exception {
        assertEquals("hmommyr", mommyfier.mommyfy("hear"));
    }
}
