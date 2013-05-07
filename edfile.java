// $Id: edfile.java,v 1.3 2013-04-11 19:02:25-07 - - $
package edfile;

import static java.lang.System.*;

public class edfile{

    public static void main (String[] args) {
	dllist lines = new dllist ();
	out.printf ("%s: ", misclib.program_name());
	if (args.length == 0) {
	    lines.setposition (dllist.position.FIRST);
	}else {
	    misclib.usage ("[-e]", "[filename...]");
	}
    }

}
