# Web Application Development

- Client-Side Development
 - On Client
- Server-Side Development
 - On Server
- E.g.:
 - Client:
  - Executables
  - Applets
  - JavaScript
 - Server:
  - CGI
  - PHP
  - Servlets
  - JSPs

## Server-Side vs Client-Side

- Advantages
 - Browser Independent
 - Application Updates
 - Code Protection
 - Local File Access
- Disadvantages
 - Server Resources

## Server-Side Introduction

- Websites utilise client and server-side
 - E.g: Form Validation/JS front-end
- Client issues - browser independence
 - concentrating on server-side

## Client/Server Systems

- Represents logical relationship between an entity (client) that requires a
service frm another entity (server) which provides a shared resource.
- Same or Distinct Machines
- Client -> Multiple Servers
- Server -> Multiple Clients
- Relationship conducted by means of Transactions
- Well defined requests and reponses
- Client/Serer = Cooperative Processing

## Client/Server Characteristics

- Service - Separate Machines, Providers, Consumer
- Shared Resources - Multi Clients, Efficient Resource Use
- HW/OS Independence - Java
- Asymmetrical Protocols - Many-1 relationship, Client initiates, Server Waits
- Message Based - Interact through Request/Response
- Transparency of Location - Server transparent redirects service calls, other
tiers, databases
- Scalability
 - Horizontal - Add/Remove Client workstations
 - Vertical - Migrate/Upgrade, load balancing
- Data/Source Protection - both data and source files
- Client Processing

## Client Attributes

- Client proces proactive
- Issues requests to server
- Typically begins and ends with user's session
- Responsible for dialog with user
 - Screen Handling
 - Menu/Command Interpretations
 - Data Entry/Validation
 - Help Processing
 - Error Recovery
 - Graphical Applications also:
  - Window Handling
  - Mouse/Keyboard Entry
  - Sound/Video
- Client-Side Validation vs Server-Side Validation
- Sometimes server-side better/required

## Server Attributes

- Server process reactive
- Triggered by requests from clients
- Runs regardless of client activity
- Reliability Issue - What if Server goes down?
- Served by Server Process itself/spawned slaave process
- Spawning allows master proc receive/handle multi requests simultaneously
- Server is function-specific
 - Performs set of predefined transactions
 - Takes request, performs required logic to process request -> transaction

## Master/Slave Processes

## Server Transaction Example

## Detailed Transaction Example

1. Log transaction
2. Decrease stock levels of item by 1
3. Check stock levels dropped below set level
4. If stock below level, place order to wholesaler
5. Log stock shortage
6. Update database info on customer so "system" knows customer is interested
in this item
7. Add item to users cart
8. Check users cart for 2for1/sale price combinations
9. Generate web page to return to client

## Mutual Exclusion Issues

- Server may simultaneouosly service multi requests
- Must resolve mutual exclusion issues
- Otherwise corrupt transactions/results/data
- Server must ensure either all/no updates occur
- E.g: Two people buying last item in stock

## Concurrent Purchase Example

## Concurrent Purchase Solution

## Client/Server Example

### Web Application Servers

- Fastest growing client/server model
- Thin, portable, universal clients talking to "superfat" servers
- Web Servers -> Full blown Web App Servers
- Communication via HTTP
- In addition to standard file/resource saving app servers:
 - Application Management - Deploy apps
 - Load balancing
 - Fail Over - Automatic switchover on failures
 - Database connection pooling
 - Monitoring - CPU, Mem, User load, etc.
 - Security - Config of https, LDAPm database, etc.
 - Virtual Hosting - Handle Multiple domains

## Client/Server Tiers

### P-A-D Architecture

- Client/Server Physical architecture categorized in terms of 'tiers'
- P-A-D
 - Presentation (user interface)
 - Application (Application Logic)
 - Data (Data Management)
- Some models divide A layer into 3 sublayers
 - Presentation Logic (interfacing with UI)
 - Business Logic (core of app -> business rules)
 - Data Logic (interfacing with DBMS)

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

#### 3 Possibilities

- System performed totally on client (client-side system)
- System cooperatively split between client/server (client/server system)
- System performed totally on server (server-side system)

## 2-Tier v 3-Tier Architecture

### 2-Tier Client/Server System

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- Simple
- FAT Clients
 - Business/app logic typically on the client
- Most suitable for departmental apps
- Less suitable as they globalise, change requirements or become more advanced

### 3-Tier Client/Server System

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

- More Complex
- Scalable, robust, flexible
- Presentation delivered on client
- Business logic on Tier 2 (1+ servers)
- Database logic on 1+ database servers
- Client does not interact with DB directly - Better security

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

## n-Tier Architecture

- 3-Tier often referre to as n-tier client/server
- Middle tier not single app, collection of components
- Components implement relatively small business function
 - transaction is the product of several mid-tier components

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

### Component Based

- Apps can be written in smaller stages, released as funcionality made available
- No app need be considered final (add components later)
- Different programmers can work independently, plug componentss together - can
  use "off the shelf" components
- Components can be reused for different functionality/apps
 - Java source code reuse
 - Compiled "Binary Black Boxes"
- Components provide new level of abstraction
 - Clients send req to components to exec func on their behalf
 - DB security and schemas hidden from client
- Component architecture provides consistent, secure access to data, eliminates
  random, uncontrolled updates frm many apps at once

\begin{figure}[H]
\includegraphics{}
\centering
\caption{}
\label{}
\end{figure}

## Scalability

- Capacity of app, SW, or HW product to adapt to changing work load applied by
  consumers of systems
- If number of users doubles, can server handle the load
 - Response time, crashes, mem shortages
- How much to spend on server resources for new project
 - Too little - Server Problems
 - Too much - Waste of money
- Two approaches to scalability
 - Vertical Scaling
  - Adding resource to single HW resource - app/DB server
  - Involves addition of CPUs/Increase mem capacity
 - Horizontal Scaling
  - Adding new HW components to existing distributed system - Placing added
    server in parallel
  - Servers "load balanced", each server handles every second input
- Note: Some issues with horizontal scaling such as session sharing and multiple
  JVMs. Solutions available to address these
- Both approacches can be used to address consistent growth in server demand
- Neither respond well to to certain scenarios

## Scenario 1

Small Company site demonstrating new hand-gesture interface for desktop
interaction. Someone place article online (slashdot.org) describing system,
resulting in huge number of visitors, never anticipated when creating specs for
web server. As a result, web server fails due to increased load.

Scenario called "slashdot effect"/"slashdotting". Not limited to slashdot.org,
more recently due to social media sites

## Scenario 2

University has web app server and base app where students can log into "portal"
to view registration record, timetables, library loans, etc. Used sporadically
by students.

### Typical Scenario

- **Student Population:** 10,000
- **Log-Ins:** Once every 14 days = 714 per day
- **Day-time Hours(16):** = 45 log ins per hour

### Problem Scenario

University decides portalwould be appropriate to distribute exam results.
Student should be allowed log in and view results when released at 10am on
release day.

Students eager for results all try to log in simultaneously. 10,000 students
attempting to log in at 10am to check results

Spamming of server, therefore server fails

## Cloud Computing

*Note*: Only covered in relation to deployment and scaling of web apps

- Used everywhere today: email, social networking, websites, file storage and
  applications (Google Docs, 365 Live)
- For developers, number of platforms offered
- Amazon Web Service (AWS)
 - Buy no HW - Instead rent HW from Amazon
 - AWS hosting eg:
  - Netflix
  - Foursquare
  - Pinterest
  - Amazon
- HW Virtualisation
 - VM created, acting like real computer with OS
 - AWS have vast server farms of high-end machines (host) from which they can
   virtualise servers (guest) on behalf of client users
- AWS users can log into AWS and choose server type (CPU, mem, OS, kernel)
- Setup in minutes
- User pays for what they use
- Local server costs: specs, build, SW, electricity, patching, etc.
- Resolutions for previous scenarios:
 - Virtualised servers introduce *elasticity* dynamically provisioning resources
   on near real-time basis.
- Amazon provides EC2 (Elastic Compute Cloud) as their solution, where users can
  select frm template Amazon Machine Images
- If load on server becomes excessive, AWS auto scales app onto other server
  instances - Pay by usage of these instances
- 2 Final considerations on moving to cloud infrastructure
 - *Downtime*:
  - Are systems sufficiently reliable
  - AWS has had crashes over past years, bringing down major sites
 - *Data Protection/Security/Privacy*:
  - Is it suitable to store e.g. academic records?
  - Who can view data?
