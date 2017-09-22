import org.junit.Test;
import org.junit.Rule;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class EventLogTest {

    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        ExpectedException expected = ExpectedException.none();
    }

    @Test
    public void containsOneTest() throws Exception {
        EventLog eventLog = new EventLog();

        assertFalse(eventLog.addEvent("string", "string"));
        assertTrue(eventLog.getNumEvent()

}
}
