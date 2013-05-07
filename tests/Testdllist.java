import junit.framework.*;
import edfile.*;

public class Testdllist extends TestCase{
    private dllist dl;

    public Testdllist(String method){
	super(method);
    }

    protected void setUp(){
	dl = new dllist();
    }

    protected void tearDown(){
	dl = null;
    }

    public void testIsEmpty(){
	assertTrue(dl.isempty());
    }

    public void testGetPositionInitial(){
	assertEquals(0,dl.getposition());
    }

    public void testSetPositionFirst(){
	dl.setposition(dllist.position.FIRST);
	assertEquals(0,dl.getposition()); 
    }

    public void testGetItemFirst(){
	assertEquals(null, dl.getitem());
    }

    public void testInsertFirst(){
	dl.insert("1",dllist.position.FIRST);
	assertEquals("1", dl.getitem());
    }

    public void testDeleteEmpty(){
	try{
	    dl.delete();
	    fail("Delete on empty list should throw exception");
	} catch (java.util.NoSuchElementException e){
	    assertTrue(true);
	}
    }

    public void testSetPositionFollowingPrevious(){
	dl.insert("1",dllist.position.FIRST);
	dl.insert("2",dllist.position.FOLLOWING);
	dl.insert("3",dllist.position.FOLLOWING);
	dl.setposition(dllist.position.FOLLOWING);
	assertEquals(1,dl.getposition());
	dl.setposition(dllist.position.FOLLOWING);
	assertEquals(2,dl.getposition());
	dl.setposition(dllist.position.PREVIOUS);
	assertEquals(1,dl.getposition());
    }
}
