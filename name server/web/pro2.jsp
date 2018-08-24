<%-- 
    Document   : pro2
    Created on : Mar 5, 2018, 2:41:47 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Js</h2>
        <button onclick="myFunction()">Try it...</button>
        <p id="demo"></p>
        
        <script>
            function myFunction()
            {
                var txt;
                var person=prompt("Please enter your name :" "harry potter")
                if(person==null||person="null")
                {
                    txt="user cancelled the prompt";
                }
                else 
                {
                    txt="hello"+person+"how are you today?";
                } 
    document.write(txt);
            }
           </script>
    </body>
</html>
