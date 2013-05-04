import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.*;

/**
 *
 */
@RunWith(JUnit4.class)
public class dllistTest extends TestCase{
    public dllistTest(String name){
	super(name);
    }
    
    @Test
    public void thisAlwaysPasses() {
	assertEquals(3,3);
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
}
