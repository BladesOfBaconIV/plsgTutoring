// An interface of functions for rideable objects
// This is another example of abstraction,
// gives an example of when you would use an interface rather than an abstract parent class
// Interfaces should be used when common functionality is desired,
// Inheritance should be used when common attributes and functionality is desired
public interface Rideable {

    // All rideable objects must be able to be mounted/dismounted
    abstract void dismount();
    abstract void mount();
}
