var x = 1;

function fun(){
    alert(x); // Noncompliant as x is declared later in the same scope
    if(something) {
        var x = 42; // Declaration in function scope (not block scope!) shadows global variable
    }
}

fun(); // Unexpectedly alerts "undefined" instead of "1
