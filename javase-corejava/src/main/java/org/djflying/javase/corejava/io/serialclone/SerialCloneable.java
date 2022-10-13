package org.djflying.javase.corejava.io.serialclone;

import java.io.*;

/**
 * SerialCloneable
 *
 * @author dj4817
 * @version $Id: SerialCloneable.java, v 0.1 2018/5/17 14:40 dj4817 Exp $$
 */
public class SerialCloneable implements Serializable, Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            // save the object to a byte array
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            try (ObjectOutputStream out = new ObjectOutputStream(bout)) {
                out.writeObject(this);
            }
            // read a clone of the object from the byte array
            try (InputStream bin = new ByteArrayInputStream(bout.toByteArray())) {
                ObjectInputStream in = new ObjectInputStream(bin);
                return in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            CloneNotSupportedException e2 = new CloneNotSupportedException();
            e2.initCause(e);
            throw e2;
        }
    }
}
