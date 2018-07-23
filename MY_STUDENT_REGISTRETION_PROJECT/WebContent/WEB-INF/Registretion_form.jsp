${msg}
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:errors path="stinfo.*"/>
<form action="/MY_STUDENT_REGISTRETION_PROJECT/demo.htm" method="post">
 Name:<input type="text" name="st.name"><form:errors path="st.name"/><br>
lName:<input type="text" name="st.lname"><form:errors path="st.lname"/><br>
MName:<input type="text" name="st.mname"><form:errors path="st.mname"/><br>
 adress1:<input type="text" name="stadr.adress1"><form:errors path="stadr.adress1"/><br>
adress2:<input type="text" name="stadr.adress2"><form:errors path="stadr.adress2"/><br>
adress3:<input type="text" name="stadr.adress3"><form:errors path="stadr.adress3"/><br>

Email:<input type="text" name="ctd.email"><form:errors path="ctd.email"/><br>
landlineno:<input type="text" name="ctd.landlineno"><form:errors path="ctd.landlineno"/><br>
mobleno:<input type="text" name="ctd.mobleno"><form:errors path="ctd.mobleno"/><br> 
dob:<input type="text" name="ctd.d"><form:errors path="ctd.d"/><br> 
<input type="submit" value="submit">
</form>
	