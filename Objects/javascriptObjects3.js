//Javascript Objects - ex3 - Create an object with properties and a method. Access the method

var car = { //car object literal with 6 properties and 1 method
    
    //these are properties
    make: 'BMW',
    model: '330ci',
    color: 'Blue',
    topSpeed: '155mph',
    currentSpeed: '60',
    distanceToTravel: '100',
    //this is an object method
    timeTakenToTravel: function() 
    {
        return this.distanceToTravel / this.currentSpeed;
    }
};

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false); //event listener to call button1

function myFunction()
{    
   document.getElementById("demo").innerHTML = car.timeTakenToTravel(); //display the method on the screen
}




