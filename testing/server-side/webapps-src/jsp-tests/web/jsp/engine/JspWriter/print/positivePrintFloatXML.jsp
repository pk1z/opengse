
<!-- This File is generated automatically by jsp2XML converter tool --> 
<!-- Written By Ramesh Mandava/Santosh Singh -->
<jsp:root
xmlns:jsp="http://java.sun.com/JSP/Page" version="1.2"
>

<jsp:text><![CDATA[<html>
<title>positivePrintFloat</title>
<body>
]]></jsp:text>

<jsp:scriptlet>

<![CDATA[
/*
 Name : positivePrintFloat
*/

]]>

</jsp:scriptlet>

<jsp:text><![CDATA[
<!-- this is to test if print(float f) method works -->
]]></jsp:text>

<jsp:declaration>
<![CDATA[ float f=0.0F; ]]>

</jsp:declaration>

<jsp:text><![CDATA[
]]></jsp:text>

<jsp:scriptlet>

<![CDATA[ 
    out.print(f);
    out.print(Float.MIN_VALUE);
    out.print(Float.MAX_VALUE);

]]>

</jsp:scriptlet>

<jsp:text><![CDATA[
</body>
</html>
]]></jsp:text>

</jsp:root>