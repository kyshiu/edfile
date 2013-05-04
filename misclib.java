// $Id: misclib.java,v 1.1 2013-04-11 19:04:05-07 - - $

import static java.lang.System.*;

class misclib {
    public static final int EXIT_SUCCESS = 0;
    public static final int EXIT_FAILURE = 1;
    public static int exit_status = EXIT_SUCCESS;

    //
    // program_name - Extract the basename of the jar file containing
    // the Java program, which appears as the class path.
    //
    public static String program_name() {
	String jarname = getProperty ("java.class.path");
	return jarname.substring (jarname.lastIndexOf ("/") + 1);
    }

    //
    // warn - Print a warning and set exit status to failure.
    //
    public static void warn (Object... args) {
	exit_status = EXIT_FAILURE;
	out.flush();
	err.printf ("%s", program_name());
	for (Object arg: args) err.printf (": %s", arg);
	err.printf ("%n");
	err.flush();
    }

    //
    // die - Print a warning and exit program.
    //
    public static void die (Object... args) {
	warn (args);
	exit (exit_status);
    }

    //
    // usage - Print a usage message and exit program.
    //
    public static void usage (Object... args) {
	exit_status = EXIT_FAILURE;
	out.flush();
	err.printf ("Usage: %s", program_name());
	for (Object arg: args) err.printf (" %s", arg);
	err.printf ("%n");
	err.flush();
	exit (exit_status);
    }

}
