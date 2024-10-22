// Starting in Java 16, you can use the record declaration
// instead of a class declaration

// This declares a type of class that is immutable
//   - all of the instance variables are final, and cannot be changed

// It's great for classes that represent a read-only record
public record HeadphonesRecord(String brand, String model, double price, boolean wireless){ }
