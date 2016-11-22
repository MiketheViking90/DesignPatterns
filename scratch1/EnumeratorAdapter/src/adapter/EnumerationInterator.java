package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationInterator implements Iterator {

    private Enumeration enumeration;

    public EnumerationInterator(Enumeration enumtn) {
        this.enumeration = enumtn;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override @Deprecated
    public void remove() {
        throw new UnsupportedOperationException("Remove is not supported.");
    }
}
