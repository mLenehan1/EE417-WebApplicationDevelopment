# JavaServer Pages

## JavaServer Pages (JSPs)

- Allow web developers and designers to develop and maintin
  platform-independent, dynamic web pages for business systems
- User interface is separated from content generation
- Designers can alter overall page layout without altering the underlying
  dynamic content
- JSPs make use of XML-like tags and scriptlets written in Java to generate
  dynamic content
- JSP like an inside-out servlet
- Hello World Example

```html
<html>
<head>
<title>JSP Hello World Example</title>
</head>

<body>
<h1>
<% out.println("Hello World!"; %>
</h1>
</body>
</html>
```

## Behind the Scenes

- JSP page is executed by JSP engine/container, such as Tomcat
- JSP is actually just a servlet that is mapped to \*.jsp
- JSP container receives requests to a JSP and generates response
- When server receives a request it recognises the .jsp extension and begins
  special handling
- First time JSP is requested, it is compiled into a servlet object and stored
  in memory - output of servlet sent back to user

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Subsequent calls to JSP in server cache increases the speed of response
- First call to JSP includes the time necessary for the server to create and
  compile the background servlet
- If the .jsp file has not changed since previous request, the server invokes
  the previously compiled servlet object

## Web Application Structure

- JSP pages share the "Write Once, Run Anywhere" characteristic of Java
  technology - typically packaged within the WAR

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Features of JSP Pages

- Java Based
 - Benefit from all of Java language benefits
- Reusable
 - O/S, platform independent, can write JSPs as components and reuse in
   different ways for different functionality
- Separation of Business Logic and Presentation
 - Web Designers can edit, work on HTML while leaving dynamic content alone
- Large Community Support
 - JSPs based on broad spectrum of industry input and support
- Platform Independent
 - Write once, run anywhere
- Ease of Development
 - Non-programmer can use simple JSP specific code for simple tasks
 - Especially by using Java Beans
- Portability
 - JSPs are part of Web App Structure
 - Can be ported easily to alternate app servers

## Sample JavaBean

```JavaBean
package mybeans;
public class SimpleBean
{
    private String message = "No message specified";
    public String getMessage()
    {
	return(message);
    }
    public void setMessage(String message)
    {
	this.message = message;
    }
}
```

## JSP using JavaBean

- JavaBean has no main method
- To use it, use <jsp:useBean> tag as follows:

```HTML
<html>
<head>
<title>Reusing JaavaBeans in JSP</title>
</head>
<body>
<div style="text-align:center">
    <jsp:useBean id="test" class="mybeans.SimpleBean"/>
    <jsp:setProperty name="test" property="message" value="Helo World!"/>
    <h1>Message:<jsp:getProperty name="test" property="message"/></h1>
</div>
</body>
</html>
```

## JSP Syntax

- HTML Comments

```html
<!-- This is a comment -->
```

- Hidden Comments

```html
<%-- This is a comment not visible to the client --%>
```

### JSP Directives

- Used to define, set attributes that apply to entire JSP
 1. include
 2. page
 3. taglib

1. include directive
 - Used to instruce JSP container to insert text into JSP at translation time
 - Included file can be HTML file, JSP file, text file, or Java code file

```html
<%@ include file="fileName"%>

e.g.

<%@ include file="DateTime.jsp"%>
```

2. page directive
 - Used to define one+ attributes for whole JSP
 - Can be placed anywhere in JSP file and still apply
 - Number of separate page directive attributes
  - import specifies in a comma separated list the Java packages the JSP should
    import

```html
<%@ page import="java.util.*, java.sql.*"%>
```

  - session can be set true if client must join session in order to use JSP

```html
<%@ page session="true"%>
```

  - contentType defines MIME type for response
  - can use any valid types supported by JSP container
  - defaults to text/html

```html
<%@ page contentType="text/html" %>
```

  - extends - the fully qualified name of the superclass of this JSP

```html
<%@ page extends="ClassName"%>
```

  - language = "Scripting Language"
  - Multiple scripting languages may be used in JSP files if supported
  - Default value is Java

3. taglib directive
 - Supported since JSP V1.1
 - Allows JSP authors to define their own tags
 - <%@ taglib%> declares JSP file uses custom tags
  - Names tag library that defines them and specfies prefix
 - Not concerned with taglib any further for this module

## Scripting Elements

- JSP scripting elements allow Java code be inserted into the servlet that will
  be generated frm the defined JSP page
- 3 types of scripting elements
 1. Declarations
 2. Scriptlets
 3. Expressions

### Declarations

- JSP declarations allow definition of methods/variables
- Declared var, methods have class scope, are available throughout JSP page
- Var declarations must be made before you use them in your JSP file
- syntax = <%! Declaration; %>
- Examples:
 - ```html <%! String testString = "Hello World!"; %>```
 - ```html <%! int x,y,z; %>```
 - ```html <%! int count=0; %>```

### Scriptlets

- Provide ability to directly insert code into HTML doc
- Can contain any code that is valid based on the language specified in language
  directive
- Java code in this module
- Is a block of Java code embedded in the service() method of a compiled servlet
 - Code executed on every client's request for the JSP
- Any no. of scriptlets can appear within a JSP page
- Syntax - ```html <%javacode %>```
- e.g.

```html
<html>
<head>
<title>JSP Scriptlet Example</title>
</head>
<body>
<% out.println("Your address iss: " + request.getRemoteAddr()); %>
</body>
</html>

- Four implicit var automatically available to JSP file
 1. request - Reference to HttpServletRequest object
 2. response - Reference to HttpServletResponse object
 3. in - Reference to BufferedReader object that is part of client request
 4. out - Reference to PrintWriter object sent to client
- Allows us in particular to handle client interaction

### Expressions

- Contains an expressiono valid in the scripting language used
- Like single-line scriptlets
- Expression is a tag that will be replaced by the values of the evaluated
  expression
- Value is evaluated, converted to a string, and inserted where the expression
  occurs in the JSP file
- Syntax - ```html <%= expression %>
- Example:

``` html
The current time is: <%= new java.util.Date() %>
Your IP address is: <%= request.getRemoteAddr() %>
<%=number1 + "Multiplied by " + number2 + "gives " + number1*number2%>
```

## JSP Database Connectivity

- JSP apps like servlets connect to databases using JDBC
- Covered later
