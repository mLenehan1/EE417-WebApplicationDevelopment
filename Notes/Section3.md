# Java Servlets

## Choosing a server-side language

- Numerous options for server-side apps
 - Perl, PHP, Java Servlets, JSP, ASP etc.
- Some element of choice comes down to personal opinion, familiarity
- E.g.

'''html
<HTML>
<HEAD><TITLE>Form Submission</TITLE></HEAD>
<BODY>Please enter your details below:
<FORM METHOD="POST" ACTION="http://www.aserver.com/cgi-bin/handle_form.pl">
Firstname: <INPUT TYPE="text" NAME="firstname"></INPUT>
<BR>
Surname: <INPUT TYPE="text" NAME="surname"></INPUT>
<BR>
<INPUT TYPE="SUBMIT">
</BODY></HTML>
'''

## Perl vs PHP

### Perl

- Stand alone apps, create HTML pages when script executed

'''perl
#!/usr/local/bin/perl
# GET THE INPUT FROM THE CALLING HTML DOCUMENT
read(STDIN, $buffer,$ENV{'CONTENT_LENGTH'});

# Split the name-value pairs
@pairs = split(/&/,$buffer);
foreach $pair(@pairs){
    ($name,$value) = split(/=/,$pair);
    $value =~ tr/+//;
    $value =~ s/%([a-fA-F0-9][a-fA-F0-9])/pack("C",hex($1))/eg;
    $name =~ tr/+//;
    $name =~ s/%([a-fA-F0-9][a-fA-F0-9])/pack("C",hex($1))/eg;
    $FORM{$name} = $value;
}
# Below is the body of the HTML Document
print "Hello $FORM{'firstname'} $FORM{'surname'}";
'''

### PHP

- Debatably faster than Perl
- Easier to write - Web designers language of choice
- Perl originally designed for scripting on UNIX
- PHP more suitable for web apps
- More common than Perl

'''php
<?php
print "Hello $firstname $surname";
?>
'''

## PHP vs Java

- Java consists of Servlets, JSPs, EJBs, and range of infrastructure support
- PHP scripts - no direct support for:
 - management of other SW components
 - Cliient session management
 -  Database connection pooling
- PHP "tends to " pprovide poor separation between presentation logic, business
  logic and data management
- Java provides
 - Standards-based patterns
  - MVC Architecture
 - Full object oriented support
 - Management infrastructures to offer best practuce development solutions
- PHP easier to get up and running - fast and cheap with little training
- As complexity, scale and flexibility increases, PHP becomes problematic
 - Need to code extra infrastructure provided by Java by default
- Java becomes moore suitable for large scale enterprise projects

## Java Servlet/JSP Example

'''java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

publiic class handleForm extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
	response.setContentType("text/html);
	PrintWriter out = response.getWrite();
	out.println("Hello " + request.getParameter("firstname")+" "+
	request.getParameter("surname"));
	out.close();
    }
}//*
'''

### JSP

Hello <%=request.getParameter("firstname")+" "+request.getParameter("surname")%>

## ASP & ASP,NET

- ASP (Active Server Pages)
- Program that runs inside IIS (Internet Information Service), free component of
  later Windows versions
- Microsoft Technology runs on Windows 2000+ (or NT4.0 patched)
- ASP files run in same way as PHP or JSP, scripts embedded into normal HTML
  files (with .asp extension)
- Less platform dependent, widelt considered JSP pages are faster/more powerful
- Primarily supports two scripting languages - JScript and VBScript
- ASP+ (or ASP.NET) Microsoft's next gen of Active Server Pages
- ASP+ complete reqork of ASP
- Part of MS new .NET architecture, provides range of technologies to make
  development easier for coders
- ASP+ has benefit of access to compiled languages, such as VB, C++, and C#

## ASP.NET vs J2EE

- Provides increased performance, improved scalability and XML-based components
- NOT fully backward compatible with ASP
- While ASP can be used for server-side scripting, would not be suitable for
  large scale app development
   - Two main options: .NET and J2EE
- .NET and J2EE provide range of preexisting functionality to users to ease
  development of large systems

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Java Servlets

- JavaSoft (Sun) finalised concept in 1997
- Dynamically loaded modules, written in Java, service requests from Web Server
- Programmes written on server-side, ready to process tasks for which they are
  designed
- Massively popular - replacing PHP, CGI/Perl server-side scripting
- Servlets part of Java 2 Enterprise Edition (J2EE) Specification
- Implemented on virtually every web/application server
- Portability
 - Written in Java, global APIs, OS/SW implementations
- Highly Efficient
 - Servlet only initialised first time its loaded
  - Remains in server memory as object instance
 - Subsequent calls - service()
- Persistant
 - Maintain state and stay in memory while serving requests
 - Allows holding onto resource such as connection pooling
- Power
 - Can access entire family of APIs dealing with networking, database
   connectivity (JDBC), imaging, etc.

### Note: Java Server Pages

- Java Server Pages
 - "Inside-Out" servlets
  - Servlets use code to generate output such as HTML
  - JSPs mostly HTML with some code where dynamic output required

- Early stagesm used web servers patched with servlet engine such as Apache
  JServ and Tomcat
- Servlet API version 2.2 replace "servlet engine" with "Servlet Container"
- Request/Response model implemented by Servlet Container
- Web Servers vs Application Servers
 - Web servers - more traditional, patched with various implementations
 - Application Servers - more fully blown
- Various servers/application servers with servlet support
 - Tomcat, JBoss J2EE Server, Java Web Server, Allaire Jrun
- Tomcat
 - Used as standalone container (as used for this module)
 - Can be combined with Apache Web Server

## Standalone Servlet Container

- Web Server/Appliication Server with built in server/JSP container
- Container makes request to server, server serves out web page, servlet, JSP
  etc output in form of response
- Server manages logging, security and other web server funcitons
- Most "serious" companies would choose full blown application server with
  database connectivity, EJB, monitoring, performance, advanced security

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

### Third-Party Container

- Not always practical to replace traditional web server, systems already in
  place, legacy PHP, CGI scripts, virtual hosting, satisfactoory setup
 - Use traditional web server and 'plugin' servlet/JSP container

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Introducing Database Tier

- Most large scale server-side systems have DB tier for persistent data
- Servlet container comms with DB tier (not server) via JDBC
- PAD

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Hello World Servlet

'''Java
import java.io.*; //*
import javax.servlet.*; //*
impoprt javax.servler.http.*;//*

public class HelloWorld extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IO Exceptionn{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<HTML><HEAD><TITLE>Hello World</TITLE></HEAD>");
	out.println("<BODY><H1>Hello World!</H1></BODY></HTML>");
	out.close();
    }
}
'''

- doGet() method handles GET method request
 - doPost() and service()
- Service extends HttpServlet class, overloads doGet() inherited from it
- Each time GET request from servlet received, server invokes doGet() method,
  passsing HttpServletRequest object, and HttpServletResponse object

## Deploying Servlets

- Three main stages
 - Serlet should be saved as .java, compiled using javac
 - Need access to servlet API to compile, included in J2EE or Tomcat
 - Compiled class file need to be deployed to Servlet Container
 - Test servlet using URL such as
  - http://localhost:8080/student/servlet/HelloWorld
 - URL used is dependent on container setup and "context"

## Tomcat

- Official reference implementation of Java Servlet and JSP technologies
- Open-Source, released under Apache Software Licence

## Web Applicaiton Structure

- Server/JSP Containers must accept Web Application Archive as format
- Web App is a collection of servlets, JSPs, HTML pages, classes, and other
  resource bundled together in standard format
- Defined within WAR file (Web Archive)
- Can deploy and run WAR across multiple 2.2 compliant servers
- Created using JAR command (same as a .jar)
 - jar -cf student.war *
- Web Applications consist of
 - Servlets
 - JSPs
 - Utolity Classes
 - Static Documents (html, css, etc)
 - Client Side Applets and JavaBeans
 - Deployment descriptor, info about app
- Unpacked format - During deployment
- WAR more typically used for deployment

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Root = HTML, Image, CSS, JSPs
- WEB-INF - Various resource, not part of public document
- web.xml = Web Application Deployment Descriptor
- lib - Contains JAR or ZIP files that application needs
- classes - servlets, class files

## Deployment Descriptor - web.xml

- Web Application Deployment Descriptor = Text XML properties file
- Defines configuration info for Web Application
 - Servlet/JSP Definitions
 - Servlet/JSP Mappings
 - Welcome file list (index.html, index.jsp etc)
 - Security and Authentication
 - Initialization Parameters
 - Session Configuration
 - Error Pages
 - MIME Types

### Snippet

'''xml
<web-app>
    <display-name>Sample Web Application</display-name>
    <session-timeout>30</session-timeout>
    <servlet>
	<servlet-name>Sample Servlet</servlet-name>
	<servlet-class>com.dcu.SampleServlet</servlet-class>
	<load-on-startup>1</load-on-startup>
	<init-param>
	    <param-name>SerletParamName</param-name>
	    <param-value>ServletParamValue</param-value>
	    <description>An Initialization parameter passed this
	    servlet</description>
	</init-param>
    </servlet>
</web-app>
'''

## Servlet Life Cycle

- Servlet Constructed and Initialized
- Service 0+ requests
- Server shuts down, servlet destroyed, garbage collected

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Initialization

- Servlet Container loads servlets either at server startup (pre-loading) or
  when accessed for first time (dynamically)
- Most containers/app servers allow specifying for which loaded at startup
- init(ServletConfig) method called by server when server constructs first
  instance

'''java
public void init(ServletConfig config) throws ServletException
{
    super.init(config);
}
'''

- ServletConfig object supplies servlet with info about intitialization params
- super.init(config) should be called to ensure parent's init() method is called

## Service

- service() method handles all requests sent by client
- Servlet container calls service() method to handle requests and write
  formatted response back to client
- Container constructs request object out of request as ServletRequest (generic)
  or HttpServletRequest (HTTP)
- Container constructs response object to format response ServletResponse
  (generic) or HtppServletResponse (HTTP)

'''Java
public void service (HttpServletRequest req, HttpServletResponse res) throws
Servlet Exception, IOException
'''

- Default implementations of service() method has code to auto redirect Http
  requests such as GET and POST to doGet() and doPost()
- Implement service method for GenericServlet, otherwise don't

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Destruction

- Servlet Container stops servlet by invoking destroy() method of servlet
  interface
- Can override destroy() method to release resource such as DB connections
- Any persistent info should be stored during this method or it will be lost

'''Java
public void destroy()
'''

- Java - Dont need to free memory from arrays, vectors, variables etc.

## Form Data Servlets

- HTML is Graphical User Interface (GUI) for servlet

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

### Form Example (using GET)

'''html
<html>
<head>
<title>Basic Format</title>
</head>
<body>
<h2>Please fill out this form:</h2>
<form method="get" action="/student/FormServlet" name="myform">
<br/>: <input name="firstname">
<br/>: <input name="surname">
<br/>Age: <input name="age">
<br/>
<input type="submit" value="Submit Form">
<input type="reset" value="Reset">
</form>
</body>
</html>
'''

### FormServlet.java (using GET)

'''java
import java.io.*; //*
import javax.servlet.*; //*
import javax.servlet.http.*; //*
import javax.servlet.annotation.WebServlet;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet
{
    public void doGet(httpServletRequest req, HttpServletResponse res) throws
    ServletException, IOException
    {
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<html><head><title>Form Example</title></head>");
	out.println("<body><h1>Hello " + req.getParameter("firstname") + " " +
	req.getParameter("surname" + "</h1>");
	out.println("You are " + req.getParatemer("age") + "years old!");
	out.println("</body></html>);
	out.close);
    }
}
'''

## Relative vs Absolute Paths

- Absolute Paths
 - Generally bad idea unless to link to remote location
 - Even remote locations are an issue due to third-party downtime
 - <img src=http://localhost:8080/student/page1.html alt="Some Image"/>
 - Might work on development machine but not on deployment machine
- Relative Paths
 - Path chosen relative to current location or server root
 - Above URL: <img src="/student/page1.html" alt="..."/>
 - This is relative to root of server
 - Works regardless of server and port details (but does include application
   path
- Alternatively provide path from current location
- If on page1.html, linking to page2.html in same directory
 - \<a href="page2.html"\>Page2\<a/>
- If linking to image from image folder in same directory
 - \<a href="images/image.jpg" alt=".."/>
- Use Relative Virtually always!

## Server-Side Includes

- Server-side include (SSI) enables embedding Java servlet within HTML doc
- Web/App Servers often allow pages be preprocessed by server to include op from
  1+ servlets within html page
- Special tags, extensions of HTML language, placed within .shtml file

1. Servlet written and compiled
2. Special tags placed in HTML file where dynamic op needed
3. File saved as .shtml
4. Client requests .shtml, server recognises special type, passes to server app
   to parse doc and exec servlet code where applicable
5. Results of servlet app merged with HTML doc and viewed by client in standard
   way - Client sees normal HTML

## Session Tracking

- Session tracking
 - The capability of server to maintain the current state of a single client's
   sequential requests
- HTTP is stateless - How to keep track of client request sequences?
- Sites with e.g. shopping carts need this capabiility
- Why not use clients IP address as ID?
- Therefore, get client to introduce itself as it makes each request
 - Client provides unique ID that lets server ID it
 - Several different ways of managing session tracking
  - User Authorization
  - Hidden Form Fields
  - URL Rewriting
  - Persistent Cookies
  - Session Tracking API

### User Authorization

- Most app/web servers have some built-in system for user authorization
- Apache user authorization used to access module notes
- Tomcat provides functionality ti require clients to login
- Example: Tomcat Manager Application
- String name = req.getRemoteUser(); //After Authorization

#### Pros:

- Easy to implement
- Works if user accesses site frm alternate machine or browser

#### Cons:

- Users must pre-register for A/C
- Users must always log in each time
- Can't simultaneously maintain more than one session at same time
- Unsuitable for anonymous session tracking

### Hidden Form Fields

- One of simplest forms of session tracking
- Use standard form fields, not displayed to client
- Parameters passed back to server, when form submitted
- \<INPUT TYPE=hidden NAME="user" value="molloyda">
- No different between hidden and visible field (at server end)
- We pass info from Form to Form
 - Effectively session tracking
- Shopping cart in this way would pass user id, quantities and item ids from
  form to form

#### Pros

- Easy to impleme t
- Supported by all popular browsers
- Users need not log in (server can generate unique IDs)

#### Cons

- As quantity of info increases, process becomes tedious (unless persistent info
  kept on server, and ID only passed)
- Only functions for series of forms (static pages break the process)
- Browser shutdown/changing will break the process

### URL ReWriting

- Every local URL the user might click  is dynamically modified to include extra
  info
- Typically, only usinque session ID passed (256 chars max)
- Different ways of passing extra info
 - Original: http://server:port/context/servlet/ServletName
 - Path: http://server::port/context/servlet/ServletName/ABCD1234
 - Parameter: http:/server:port/context/servlet/ServletName?sessionidABCD124
- Path info method works for both GET and POST
- Extra parameter method does not work for POST method

#### Pros:

- Easy to implement
- Supported by all popular browsers
- Users need not log in (server can generate Unique IDs)
- URL rewriting works for all dynamically created docss (not just forms)

#### Cons

- Only small quantities of info can be rewritten into URLs (therefore would
  need server-side persistence)
- typically URL rewriting does not work for static documents
- Browser shutdown breaks the process
- Can be very tedious and need to be careful to find all links etc.

### Persistent/Non Persistent Cookies

- Cookie
 - Simple piece of info stored on client, on behalf of server
- When browser receives a cookie, it saves cookie on local HDD
 - Expiry of cookie can be set - otherwise deleted at browser shutdown
- Each subsequent visit to site, browser sends cookie back to server with each
  request
- Cookies can be used to store user ID
- Cookies - Security Issues? Few kB - Non-executable
- Cookies not part of original HTTP specification
 - Introduced in Netscape and have become de-facto standard
- Servlet API provides javax.servlet.http.Cookie for using cookies

```Javascript
Cookie cookie = new cookie("userid", "david_molloy832");
cookie.setMaxAge(7200); //2 hour expiry
res.addCookie(cookie)
```

- Servlet retrieves cookies by calling getCookie() method

```Javascript
Cookie[] cookies = req.getCookies();
if(cookies!=null){
    for( int i=0;i<cookies.length;i++){
	String name = cookies[i].getName();
	String value = cookies[i].getValue();
    }
}
```

#### Pros:

- Efficient, simple way of session tracking
- Exist even if browser and/or servers are shutdown/restarted
- Users need not log on (servers can generate IDs)
- Cookies are customizable and powerful

#### Cons:

- Major problem, some client configure browsers to refuse cookies (for security
  concerns)
- If client refuses cookies, must fall back on another solution

### Session Tracking API

- Fortunately, Servlet API has built-in support for session tracking
- Session tracking should be supported by any web server that supports servlets
- To create new session, use HttpServletRequest objects getSession() method
 - public HttpSession HttpServletRequest.getSession(boolean create);
 - e.g. HttpSession session = req.getSession(true);
- Method returns current session associated with user making request
- If user has no current valid session, method creates one if 'create' is set as
  true, or return null if 'create' is false
- HttpSession object has five methods we are concerned with
 - public void setAttribute(String name, Object value)
  - Binds name/value pair to store current session
  - If name exists, it is replaced
  - Note: Can store object, rather than just string
 - public Object getAttribute(String name)
  - Used to get object stored in the session
 - public Enumeration getAttributeNames()
  - Returns Enumeration of all current bound names stored in session
 - public void removeAttribute(String name)
  - Allows removal of an object frm the session
 - public void invalidate()
  - Can manually invalidate their session and all info
- Sessions can have limited lifespan (purposefully!)
- Automatic or manual invalidation (such as logouts)
- When user accesses a site, that user is assigned a new HttpSession object and
  a unique session ID
- Session ID is unique and identifies the user
- Session ID is saved on client in a cookie or sent as part of rewritten URL
- Every server that supports servlets should implement at least cookie-based
  session tracking (using persistent cookies)
- Most servers support session tracking based on URL rewriting also

#### Pros:

- Very efficient, simple way to implement session tracking
- Session info can persist (server specific) even with server shutdown/restart
- Users need not log on (server generates unique IDs)
- Works for all docs/pages, including static HTML
- Standardized and included in J2EE
- Sessions can be set to "time-out" at user configurable times
- Objects stored rather than just strings

#### Cons:

- Restricted to one browser and tracking lost if browser shuts down or crashes
- Slightly more difficult if clients have cookies disabled
