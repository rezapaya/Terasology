package org.terasology.components;

import org.terasology.entitySystem.AbstractComponent;
import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.EntityRef;
import org.terasology.persistence.interfaces.StorageReader;
import org.terasology.persistence.interfaces.StorageWriter;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

/**
 * Component represent the location and facing of an entity in the world
 * @author Immortius <immortius@gmail.com>
 */
public final class LocationComponent extends AbstractComponent {
    // Standard position/rotation
    public Vector3f position = new Vector3f();
    // TODO: Represent as Euler angles instead?
    public Quat4f rotation = new Quat4f(0,0,0,1);
    // TODO: Should this be here? Probably needs to be common as it affects several other components
    public float scale = 1.0f;

    // Relative to
    public EntityRef parent = null;
    
    public void store(StorageWriter writer) {
        writer.write("position", position);
        writer.write("rotation", rotation);
        writer.write("scale", scale);
        writer.write("parent", parent);
    }

    public void retrieve(StorageReader reader) {
        position = reader.read("position", Vector3f.class, position);
        rotation = reader.read("rotation", Quat4f.class, rotation);
        scale = reader.readFloat("scale", 1.0f);
        parent = reader.read("parent", EntityRef.class, parent);
    }
}