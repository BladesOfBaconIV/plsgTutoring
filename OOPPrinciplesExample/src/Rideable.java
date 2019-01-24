// An interface of functions for rideable objects
public interface Rideable {

    // All rideable objects must be able to be mounted/dismounted
    abstract void dismount();
    abstract void mount();
}
