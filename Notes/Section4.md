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
