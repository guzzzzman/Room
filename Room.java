// Jose Guzman
// 9/3/2023
// Description: Example of an Object: Room
// File Name: Room.java
// To Compile in terminal type: javac Room.java
// To Run the program in terminal type: java Room
class Room
{
  // VARIABLES are words where data is stored
  // The class Room has two variables: length, width
  double length, width; 
  //^double is the data type (type of inoformation) 
  // double means 'decimal' value like 12.0

  // METHODS: "interact" with the variables

  // CONSTRUCTOR: gives variables initial values 
  // MUTATOR: changes the variables
  // ACCESSOR: Shows the variables 

  // CONSTRUCTOR - sets intial values of variables
  Room() //  name is the same name as the class
  {
    // initializes variables, give them inital values
    length = 25.0; 
    width = 12.0;
  }

  //MUTATOR - changes the values of the variables
  void changeRoom(double newL, double newW) 
  {
    length = newL;
    width = newW;
  }

  // ACCESSOR METHOD
  public String toString() // - show the room's properties
  {
    return "length = " + length + " , width = " + width;
  }

  public static void main(String[] args)
  {
    // Room() below "Calls" the Constructor,
    // "Calls" means execute what is in between { } of Room()
    // make a new room 25.0 by 12.0 (Length, Width)
    Room myRoom = new Room(); 
    // show the room
    System.out.println("myRoom " + myRoom); 
    //                             ^^^^^ calls to String()
    // calls changeRoom(), changes the room's properties
    myRoom.changeRoom(10.5,20.5); 
    // show the room again
    System.out.println("myRoom now has " + myRoom); 
        myRoom.changeLength(33.3);
        System.out.println("myRoom is " + myRoom); 
  }
  void changeLength(double newL)
{
   length = newL;
  }
}
/*
myRoom length = 25.0 , width = 12.0
myRoom now has length = 10.5 , width = 20.5
*/