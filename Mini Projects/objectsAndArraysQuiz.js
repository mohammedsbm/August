//Javascript Objects - Object and Array Quiz - Your challenge is to create a small quiz using an array of objects in Javascript. The quiz can be on any topic of your choice and no more than 5 questions. An additional challenge will be to track the users score. You should use to build your solution: An object constructor to create quiz objects, Push objects into an array, Use a For loop to rotate through the array and display the questions onto the DOM. Extra features: Users receive a response to their answers, Storage of the correct answers, User feedback of their overall score in the quiz.

//var firstName = document.getElementById("firstName").value;
//var lastName = document.getElementById("lastName").value;

function Questions(question, answer1, answer2, answer3, correctAnswer) //this is an object constructor, it can be used to call multiple objects with the same properties.
{
    this.question = question;
    this.answer1 = answer1;
    this.answer2 = answer2;
    this.answer3 = answer3;
    this.correctAnswer = correctAnswer;
};

//empty array for questions
var listOfQuestions = [];

//list of questions
var question1 = new Questions('Which car is made in Germany?', 'Honda', 'Mazda', 'BMW', 'BMW');
var question2 = new Questions('Which one of these is a supercar?', 'Jaguar xj', 'Ferrari f430', 'Mercedes E350', 'Ferrari f430');
var question3 = new Questions('Which car manufacturer is owned by BMW?', 'Audi', 'Mini', 'Aston Martin', 'Mini');
var question4 = new Questions('Which one of these is a bike?', 'BMW Z5', 'Yamaha R1', 'Audi A3', 'Yamaha R1');
var question5 = new Questions('Which one of these is rear wheel drive?', 'Jaguar XJ', 'Honda Civic Type R', 'Mini Cooper', 'Jaguar XJ');

//push questions into array
listOfQuestions.push(question1);
listOfQuestions.push(question2);
listOfQuestions.push(question3);
listOfQuestions.push(question4);
listOfQuestions.push(question5);

//create arrays for html tags to easily use them in loop
var questionTags = ["q1","q2","q3","q4","q5"];
var answerTags = ["answerList1","answerList2","answerList3","answerList4","answerList5"];
var radio = "<input type='radio' id='myRadio' checked>";
var rightAnswer = listOfQuestions.correctAnswer

/*var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false); //event listener to activate button1*/

for(var i = 0; i < listOfQuestions.length; i++)
    {        
        document.getElementById(questionTags[i]).innerHTML = listOfQuestions[i].question;
        
        document.getElementById(answerTags[i]).innerHTML = 
        radio + listOfQuestions[i].answer1 + "<input/><br/>" +
        radio + listOfQuestions[i].answer2 + "<input/><br/>" +
        radio + listOfQuestions[i].answer3 + "<input/>";
    };

//check if correct radio button is chacked
function checkRadio()
{
    
    
}



/*function myFunction()//function to call object
{    
    
    var bmwDetails = bmwCar.carDetails(); //this variable stores the properties of object one
    
    var mercDetails = mercCar.carDetails(); //this variable stores the properties of object two
    
    var myCars = bmwDetails + "<br/>" + mercDetails; //this variable concatinates the details for object one and two
    
    document.getElementById("demo").innerHTML = myCars; //display the properties of the object instances on the screen 
}*/


