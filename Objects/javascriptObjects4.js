//Javascript Objects - ex4 - Create an object variable with 3 properties: firstname, surname, fullname. For the fullname value create a method which returns the firstname and surname and display on the webpage

//var firstName = document.getElementById("firstName").value;
//var lastName = document.getElementById("lastName").value;

var person = {
    //these are properties
    firstName: 'Saqib',
    lastName: 'Mazumder',
    //this is a method that concatenates first name and last name and returns it to the user.
    fullName: function() 
    {
        
        return this.firstName + " " + this.lastName;
    }
};

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);

function myFunction()//function to call method
{
    var fullName1 = person.fullName(); //put method into a variable
    
    document.getElementById("demo").innerHTML = fullName1; //display fullname on screen
}


