<%-- 
    Document   : index
    Created on : Sep 3, 2014, 9:33:25 PM
    Author     : tdornak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/areaCalculator.css" rel="stylesheet" type="text/css"/>
        <title>Calc JSP</title>
        
    </head>
    <body>
        <div class="container">
            <h2>Rectangle Area Calculator</h2>
            <form id="rectangleAreaCalculator" name="rectangleAreaCalculator" method="POST" action="Calc">
                <p>
                <label id="rectangleLblWidth" for="rectangleTxtWidth" form="rectangleAreaCalculator">Enter width:</label>
                <input type="text" name="txtWidth" id="rectangleTxtWidth" value=""><br>
                </p>
                <p>
                <label id="rectangleLblHeight" for="rectangleTxtHeight" form="rectangleAreaCalculator">Enter height:</label>
                <input type="text" name="txtHeight" id="rectangleTxtHeight" value=""><br>
                </p>
                <input type="submit" name="submit" value="Rectangle">
            </form>
            
            <div class="answer">
                <%
                    if (request == null) {
                        
                    } else {
                        Object obj = request.getAttribute("area");
                        if (obj == null) {
                            out.println("Something has gone horribly wrong");
                        } else if (request.getAttribute("name").toString().equalsIgnoreCase("rectangle")) {
                            out.println(obj.toString());
                        }
                    }
                    
                %>
            </div>
            
            <h2>Triangle Area Calculator</h2>
            <form id="triangleAreaCalculator" name="triangleAreaCalculator" method="POST" action="Calc">
                <p>
                <label id="triangleLblWidth" for="triangleTxtWidth" form="triangleAreaCalculator">Enter width:</label>
                <input type="text" name="txtWidth" id="triangleTxtWidth" value=""><br>
                </p>
                <p>
                <label id="triangleLblHeight" for="triangleTxtHeight" form="triangleAreaCalculator">Enter height:</label>
                <input type="text" name="txtHeight" id="triangleTxtHeight" value=""><br>
                </p>
                <input type="submit" name="submit" value="Triangle">
            </form>
            
            <div class="answer">
                <%
                    if (request == null) {
                        
                    } else {
                        Object obj = request.getAttribute("area");
                        if (obj == null) {
                            out.println("Something has gone horribly wrong");
                        } else if (request.getAttribute("name").toString().equalsIgnoreCase("triangle")) {
                            out.println(obj.toString());
                        }
                    }
                %>
            </div>
            
            <h2>Circle Area Calculator</h2>
            <form id="circleAreaCalculator" name="circleAreaCalculator" method="POST" action="Calc">
                <p>
                <label id="circleLblRadius" for="circleTxtRadius" form="circleAreaCalculator">Enter radius:</label>
                <input type="text" name="txtWidth" id="circleTxtRadius" value=""><br>
                </p>
                <input type="submit" name="submit" value="Circle">
            </form>
            
            <div class="answer">
                <%
                    if (request == null) {
                        
                    } else {
                        Object obj = request.getAttribute("area");
                        if (obj == null) {
                            out.println("Something has gone horribly wrong");
                        } else if (request.getAttribute("name").toString().equalsIgnoreCase("circle")) {
                            out.println(obj.toString());
                        }
                    }
                %>
            </div>
            
        </div>
    </body>
</html>
