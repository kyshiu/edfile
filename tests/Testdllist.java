import junit.framework.*;

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

    public void testGetPositionInitial(){
	
    }

    public void testSetPositionFirst(){
	dl.setPosition(dllist.position.FIRST);
	assertEquals(1,1); // fix
    }
}
