//Javascript Objects - ex5 - Create an object within an object (nested) and display a nested object property on the webpage

//var firstName = document.getElementById("firstName").value;
//var lastName = document.getElementById("lastName").value;

var person = {
    //these are properties of the object
    firstName: 'Saqib',
    lastName: 'Mazumder',
    fullName: function() //this is a method that concatenates first name and last name and returns it to the user.
    {
        return this.firstName + " " + this.lastName;
    },
    
    car: { //this is a property of person and a nested object with properties of its own
    
        make: "BMW",
        model: "330ci",
        color: "Blue"
    }
    
}

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false); //event listener to activate button1

function myFunction()//function to call method
{    
    
    var carModel = person.car.model; //variable to store a property of my nested object
    
    document.getElementById("demo").innerHTML = carModel; //display property of nested object
}


