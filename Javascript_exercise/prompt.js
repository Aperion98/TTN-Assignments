function simpl()
    {
    var p,r,t;
    p=parseFloat(prompt("Please Enter Principle Amount"));
    r=parseFloat(prompt("Please Enter Rate Amount"));
    t=parseFloat(prompt("Please Enter Time(year)"));
    var si=(p*r*t)/100;
    document.write("Simple Interest (calculated anually) is: "+si);
    }