// Simple example to understand Stack and Heap in Java

class Car {
    String color; // Instance variable → stored inside the object in HEAP

    // Constructor → called when we create a new object
    Car(String c) {
        color = c; // Assign the color value
    }

    void drive() {
        System.out.println("The " + color + " car is driving...");
    }
}

public class StacknHeap {
    public static void main(String[] args) {

        // ---------------- STACK ----------------
        // Primitive data types (int, float, char, etc.) are stored in STACK
        int number = 10;  // 'number' variable and its value 10 live in stack memory

        // ---------------- HEAP ----------------
        // 'new Car("Red")' creates a Car object in HEAP memory
        Car myCar = new Car("Red"); 
        // Here:
        // myCar → stored in STACK (it holds a reference/address)
        // Car object → stored in HEAP (it holds 'color' = "Red")

        // Example of how memory looks:
        //
        // STACK:
        //   number = 10
        //   myCar  ---> reference to object in HEAP
        //
        // HEAP:
        //   Car object {
        //       color = "Red"
        //   }

        // Accessing object data using reference (myCar)
        System.out.println("Color of myCar: " + myCar.color);

        // Calling method using the object reference
        myCar.drive();
    }
}

// Stack Memory:
// Stores local variables and references (like int number, Car myCar).

// Heap Memory:
// Stores actual objects created with new (like new Car("Red")).
