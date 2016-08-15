//Javascript Objects - ex2 - Create an object variable and output each object property in a concatenated string onto the webpage

var car = { //car object literal with 3 properties
    
    make: 'BMW',
    model: '330ci',
    color: 'Blue',
};

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);

function myFunction()
{
    var carInfo = car.make + " " + car.model + " " + car.color; //variable to concatenate car properties
    
   document.getElementById("demo").innerHTML = carInfo;
    //display car properties on screen
}




