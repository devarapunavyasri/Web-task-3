let randomNumber=Math.floor(Math.random()*100)+1;

let attempts=0;

function checkGuess(){

let guess=Number(document.getElementById("guess").value);

attempts++;

document.getElementById("attempts").innerHTML=attempts;

if(guess===randomNumber){

document.getElementById("message").innerHTML="🎉 Correct!";

}

else if(guess<randomNumber){

document.getElementById("message").innerHTML="Too Low";

}

else{

document.getElementById("message").innerHTML="Too High";

}

}

function restartGame(){

randomNumber=Math.floor(Math.random()*100)+1;

attempts=0;

document.getElementById("attempts").innerHTML=0;

document.getElementById("message").innerHTML="";

document.getElementById("guess").value="";

}
