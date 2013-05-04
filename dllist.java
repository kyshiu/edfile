// $Id: dllist.java,v 1.1 2013-04-11 19:04:05-07 - - $

class dllist {

    public enum position {FIRST, PREVIOUS, FOLLOWING, LAST};

    private class node {
	String item;
	node prev;
	node next;
    }

    private node first = null;
    private node current = null;
    private node last = null;
    private int currentposition = 0;

    public void setposition (position pos) {
	throw new UnsupportedOperationException();
    }

    public boolean isempty () {
	throw new UnsupportedOperationException();
    }

    public String getitem () {
	throw new UnsupportedOperationException();
    }

    public int getposition () {
	throw new UnsupportedOperationException();
    }

    public void delete () {
	throw new UnsupportedOperationException();
    }

    public void insert (String item, position pos) {
	throw new UnsupportedOperationException();
    }

}
