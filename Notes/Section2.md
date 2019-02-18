# Client-Side Development

## Backgroud Tecchnologies

- HTTP (Hypertext Transfer Protocol)
 - Protocol between web browsers/servers
- Simple info passed as plain text via TCP

## HTTP Version 1.0

- Simple, stateless protocol
- Client makes request, server responds
 - Quick simple transaction
- Connection made for every object to be downloaded
- Wasteful - packet overhead involved getting pages with many separate parts
- -> HTTP Version 1.1

## HTTP Version 1.1

- Defined by W3C, address no. of issues with 1.0
- Same basic operation, client/serer backwards compatible
- Defines persistent connections
- Numerous docs downloaded over one connection
- Persistent connections default unless specified otherwise
 - HEAD /index.html HTTP/1.1
 - Host: www.eeng.dcu.ie
- New feaetures on proxies and caching

## Method Types

- Clients send request as one of a no. of different types
- GET
 - retrieve info from server
 - can include added info, describing what to obtain
 - eg: http://www.server.com/scripts/phonesearch
 - eg: http://www.server.com/scripts/phonesearch?name=Molloy
- POST
 - uses different techniques for transferring data
 - sending large quantities of info, where GET unsuitable
 - URL remains same, not bookmarkable/emailed/reloaded
 - eg: http://www.server.com/scripts/dologin
- HEAD
 - GET with a blank page
 - Sends response headers
- Other methods not commonly used
 - PUT
  - placing docs on server
 - DELETE
  - deleting docs from server
 - TRACE
  - debugging (returns request contents)
 - OPTIONS
  - ask server which methods supported

## HTML (Hypertext Markup Language)

- URLs (univeral resource locator)
 - http://www.server.com/path/fil.html
- Development using WYSIWYG tools
- Uploading to Web Server (FTP, Samba, Local etc.)
- Tags:
 - \<HTML>
 - \<HEAD>
 - \<TITLE>
 - \<BODY>
 - \<BR>
 - \<P>
 - \<H1>
 - \<FONT>
 - \<B>
 - \<I>
 - \<A>
 - \<UL>
 - \<LI>
 - \<PRE>
 - \<IMG>
 - \<TABLE>
 - \<TR>
 - \<TD>
- Attributes
- W3C (World Wide Web Consortium)

## HTML vs XHTML

- XHTML- reformulation of HTML into XML format
- Features
 - stricter format
 - case sensitive on tags/attributes
 - must be well formed
- No. of advantages when working with JS, Ajax, DOM, JQuery etc.
- Will use XHTML tags in this module

## XHTML

- Addition of XML tags to make validatable XML
- W3C XHTML validator
- Mostly when writing, will ignore first lines for simplicity
- W3Schools TryIT HTML Editor

## (X)HTML Accessibility

- Designing web pages so as to make usable to all
- "alt" attribute in \<img> for example
- WCAG (Web Content Accessibility Guidlines)
 - 1.0 published 1999
 - 2.0 published 2008
- Ethical/Moral Responsibility
- Disability Act 2005 Ireland
 -  "Where a public body communicates in electronic form with one or more
 persons, the head of the body shall ensure, that as far as practicable, the
 contents of the communication are accessible to persons with a visual
 impairment to whom adaptive technology is available.“
- Web Accessibility Checkers

## HTML5

- Standardised Oct 2014
- Previous standard 1997 with rev in 2000
- For Web would expect faster spec standardisation
- Browser companies already implementing HTML5 features
 - Canvas element usable in Chrome, Safari, Firefox etc.

### HTML5 Features/Additions

- Markup
 - Range of new elements
 - \<video>, \<audio>, \<footer>, \<nav>, \<canvas>
 - Removed \<font>, \<center>
- Drawing on pages using \<canvas>
- Video and Audio
 - HTML5 browsers to have built in media player
 - possible to style using CSS
 - To play agreed formats
- Application front-end
 - No. of front ends using canvas element
 - New standard form controls added
- Offline Storage Database
 - Similar to cookies but with more data
 - Enables offline web applications
- \<datagrid> for tabular data but allowing sorting, row selection, etc.
- Drag and drop - elements on pages/files from harddrive
- Inline document editing

## Cascading Style Sheets (CSS)

- Introduced late '96
- More sophisticated page design
- Improved accessibility
- Separation of contents from appearance
- W3C recommendations
 - CSS1 and CSS2
 - CSS3 under development
- CSS2 incorporates/extends CSS1
- Why unpopular on release?
 - Traditional browser incompatibility
 - Varying support currently
 - Designer knowledge

### CSS3

- CSS1 and 2 were full specs covering all elements
- CSS3 being released as individual modules
 - Recommendation
 - Candidate Recommendations
 - Last Call
 - Working Draft

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

### CSS

- Contents from Appearance
- Style Benefits
 - Larger array of layout/presentation options not in HTML
- Single Style File
 - One file describing layout of entire site

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Between \<HEAD> tags
 - \<link rel=“stylesheet” type=“text/css” href=“filename.css” />
-  B { font-family: Verdana, Geneva, Helvetica; font-weight: normal;
         font-style: normal; font-size: 14pt; color: blue; background: red;
         text-decoration: none; }
- a:LINK, a:VISITED
- @media screen {   /* hide from non supported browsers */
       a:hover
   }

### CSS Structures

- File handles style/layout, HTML file handles content
- File made up of rules
- Rules made of two parts
 - Selector (e.g. H1)
 - Declaration (e.g. font-family)
- Declaration split into no. of name-value pairs (properties)
- Inheritance: \<H1>A Really \<B>Ugly Web\</B>Page\</H1>
- If two styles defined in CS file 'Ugly Web' inherits all properties of H1 but
  overrides with its own definitions
 - e.g.: <H1>A Really <B>Ugly Web</B> Page</H1>
- To increase granularity of control over elements, introduce class attribute
 - e.g. B.BLUE inherits properites from B

### CSS for Layout

- Not only can we make style changes, can layout entire sites
- Two main elements to help with layout
 - \<div> can apply styles to whole sections of HTML elements
  - atttributes are *style*, *class*, and *id*

'''HTML
<h2>Div Example</h2>
	<p>
	Some text before the div we are demonstrating...
	<div id="news_section" style="font-size:8pt" class="news">
   		 Today in the news were a number of startling revelations...
	</div>
	Some text after the div we are demonstrating....
	</p>
'''

- In corresponding CSS file:

'''CSS
div.news { font-family: Arial, Verdana; color: black;
	             background: #eeeeee; margin:20px; padding:10px; }
'''

- \<span>
 - works similarly to div, does not apply formatting of its own
 - div adds new lines before and after itself
- span can be used inline
 - inside elements e.g. paragraphs without affecting flow of paragraph

#### 2 Types of element

- **Block**
 - elements such as \<div> or \<p>
 - Start content on new line, end on new line
 - Can contain other block or inline elements
- **Inline**
 - elements such as \<span>, \<i>, \<b>
 - Define style but don't cause extra formatting or new lines
 - Typically only ever contin other inline elements or text
- One can set widths and heights for block elements, not for inline

## Creating Page Strutures

- Traditionally pages used to create layouts such as columns
- Bad practice as tables intended for tabular design
- Can use div tag for layout, defualts to 100% width
- Able to set widths and heights
 - in units
 - as % of available space
- Float property tells browser to position block element to left/right of
  existing element

### Box Model

- All HTML "block" elements follow box model with 5 spacing props
 - Width
 - Height
 - Margin
 - Border
 - Padding

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Default marginss, borders, paddings for block elements set to 0
- Default widths for block elements set to 100%
- Defualt height rely on contents of element, but can be specified

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## HTML Forms

- Client front-end to server side applications
- Exist on client side, interpreted within browser
- Typically require server-side application to make useful
- HTML forms contain
 - Normal content, markup
 - special elements called controls and their labels
- Controls "control name" given by name attribute
- \<FORM METHOD="POST" ACTION="http://...../formhandler" NAME="myform">
- \<INPUT TYPE="submit" VALUE="Submit Query">

## Document Object Model

- Allow programmatically access/manipulate web/XML page
- Provide object-oriented representation of elements and content of web page,
  combined with methods for setting/retrieving elements and data
- Provides API (Application Programming Interface) can use to do this
- Standardised by W3C

### DOM Document Tree

- Forms hierarchical representation of contents of that page

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- All contents/elements represented as nodes

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

### Node Properties

- Node.firstChild
- Node.lastChild
- Node.childNodes : 0-indexed array of child nodes
- Node.parentNode
- Node.nextSibling
- Node.prevSibling
- Other methods for modifying DOM structure
 - removeChild(), appendChild(), replaceChild(), closeNode(), insetBefore()

### Whitespace issue

- Whitespace considered nodes

## HTML, XHTML and DOM

- Previously mentioned how XHTML needs to be well formed
- Although HTML forgiving in browser, often breaks DOM
- Well formed XHTML always has proper DOM representation

## Document.getElementById()

- For working later with XHTML/JS/DOM need practical referencing within code
- eg. document.firstChild.childNodes[3].firstChild...
- Not practical in particular where doc changing/modified by Ajax (covered
  later)
- Provides easy means of obtaining reference to any Node with an id attribute
- e.g. document.getElementbyId("firstparagraph")

'''HTML
<html>
<head>
<title>Sample Page</title>
</head>
<body>
    <h1>This is the title</h1>    <div id="firstparagraph"><p>This is the contents of the first paragraph</p></div></body>
</html>
'''

## JavaScript

- '95 Netscape began new scripting project - LiveScript
- Could enhance web pages and perform limited form validation
- Dec '95 Netscape/Sun annouce JS
- Relatively easy to use
- Complementary to/integrated with Java
- Complementary to/integrated with HTML
- Open, cross-platform, freely licensed
- Object based interpreted scripting language
- NOT Java
- Smaller vocab, borrowed Java syntax
- JS object based
 - Uses objects
 - Not same functionality of OOP languages
- JS support in browser predates Java support in browsers
- Java Applications run in JVM
- JS code interpreted, displayed on browser that is JS enabled
 - Not compiled

### ACID Test

- Web Standards Project
 - Group of pro web-developer encouraging use of standards, accessibility
   improvements etc
- No. of tests for browser standard compliance
 - ACID1 : testing HTML4 and CSS1
 - ACID2 : HTML4.01 and CSS2.1
 - ACID3 : HTML, CSS, JS, and DOM
- Returns effective % complienace with Standards

### JS Re-Emergence

- Developers avoided overreliance on JS due to varying browser implementations
- No. of factors causing recent remergence
 - HTML5
  - New HS API for deling with HTML5
 - HTML5 Canvas
  - Interacting with canvas UI elements
 - AJAX
  - In page replacement of elements vs full page loads
 - Advanced libraries, e.g. jQuery, improving front-end UIs
 - Faster Client Machines

### jQuery

- Provides common browser API works across all modern browsers, degrade
  gracefully fo non-JS enabled clients
- Growing in popularity in recent years
- Designed to read, manipulate DOM for webpages
- Widgets and events can be added as soon as DOM ready (webpage loaded by
  browser)
- has 100s of available plugins

### jQuery-ui

- Core plugin for rich UI design
- Select theme from themeroller, download CSS and HS
- Write jQuery-ui widgets
- jQuery and jQuery-ui have available animation events for all widgets and
  elements
 - showing
 - hiding
 - fading
 - sliding
