//Functions and Program Flow - ex5 - Create a switch statement that displays the current day and time  of the week on the webpage

var event1 = document.getElementById("button1");
event1.addEventListener('click', myFunction, false);


function myFunction()
{
    var day ="";
    
    //create a new date object
    var today = new Date();
    
    // get the day and switch on the value (0-6) to set the day string
    switch(today.getDay())
        {
            case 0:
                day = 'Sunday';
                break;
                
            case 1:
                day = 'Monday';
                break;
                
            case 2:
                day = 'Tuesday';
                break;
                
            case 3:
                day = 'Wednesday';
                break;
                
            case 4:
                day = 'Thursday';
                break;
                
            case 5:
                day = 'Friday';
                break;
                
            case 4:
                day = 'Saturday';
                break;
                  
        }
    
        //get the time
        var hours = today.getHours();
        var minutes = today.getMinutes();
        var localTime = hours + ":" + minutes;
        
        //display time and date
        document.getElementById("demo").innerHTML = day + "<br/>" + localTime;
                      
}

