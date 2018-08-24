
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Js</h2>
        <button onclick="myFunction()">Try it</button>
        
       <script>
           function myFunction()
        {
            var txt;
            if(confirm("press button"))
            {
                txt="you pressed ok";
            }
            else{
              txt="you pressed cancel";  
            }
       document.write(txt);
        }
        

</script>
    </body>
</html>
