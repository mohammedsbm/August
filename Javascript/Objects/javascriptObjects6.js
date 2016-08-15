//Javascript Objects - ex5 - Build an object constructor. Create 2 instances of the object. Display the properties of the object instances on the webpage

//var firstName = document.getElementById("firstName").value;
//var lastName = document.getElementById("lastName").value;

function Car(make, model, color) //this is an object constructor, it can be used to call multiple objects with the same properties.
{
    this.make = make;
    this.model = model;
    this.color = color;
    //this function concatinates the properties of the object
    this.carDetails = function() 
    {
       return this.make + ", " + this.model + ", " + this.color;
    };
}

var bmwCar = new Car('BMW', '330ci', 'Blue'); //first object created using object constructor
var mercCar = new Car('Mercedes', 'c250', 'Black'); //second object created using object constructor

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false); //event listener to activate button1

function myFunction()//function to call object
{    
    
    var bmwDetails = bmwCar.carDetails(); //this variable stores the properties of object one
    
    var mercDetails = mercCar.carDetails(); //this variable stores the properties of object two
    
    var myCars = bmwDetails + "<br/>" + mercDetails; //this variable concatinates the details for object one and two
    
    document.getElementById("demo").innerHTML = myCars; //display the properties of the object instances on the screen 
}


