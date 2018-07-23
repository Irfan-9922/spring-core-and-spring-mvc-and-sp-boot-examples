<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:errors path="ss.*"/>






<h1>registretion form</h1>
<body>
<form action="/form_handling_with_java_class/show.htm" method="post">
name:<input type="text" name="name"><form:errors path="name"/><br>
phno:<input type="text" name="phno"><form:errors path="phno"/><br>
dob:<input type="text" name="dob"><form:errors path="dob"/><br> 
countery:<input type="text" name="adre.countery"><br>
state:<input type="text" name="adre.state"><br>
zipcode:<input type="text" name="adre.zipcode"><br>
dd:<input type="text" name="adre.p.ppno"><br>

<input type="submit" value="for submit your info plese click here"/>

</form>
 <%-- <form:form action="show.htm" method="post">
 <form:label path="name">name</form:label>
<form:input path="name"/>
<form:label path="phno">phno</form:label>
<form:input path="phno"/>
<form:label path="dob">dob</form:label>
<form:input path="dob"/>
<form:label path="adre.countery">countery</form:label>
<form:input path="adre.countery"/>
<form:label path="adre.state">state</form:label>
<form:input path="adre.state"/>
<form:label path="adre.zipcode">zipcode</form:label>
<form:input path="adre.zipcode"/>
<input type="submit" value="for submit your info plese click here"/>
</body>
</form:form> --%>