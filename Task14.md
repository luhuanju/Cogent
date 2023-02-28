512.What are the implicit objects in JSP?

In JSP, there are serveral implicit objects that are automatically available for use within the JSP page, without the initialization of those implicit objects, ex, request, response, session, out


513.How will you extend JSP code?

1) with JSP include files, one JSP file could be included in other JSP files in the way with Tag
2) with JSP expression, it clould allow us swrite Java code in JSP file.

514.How will you handle runtime exceptions in JSP?

1) Using default error pages that could be displayed when error occours.
2) Using Try catch blocks. 


515.How will you prevent multiple submits of a page that come by clicking refresh button multiple times?

516.How will you implement a thread safe JSP page?

1) Synchronize access to shared resources
2) Use thread-safe objects

517.How will you include a static file in a JSP page?


518.What are the lifecycle methods of a JSP?

1) jspInit(), it will be called when a JSP file/page is initialized. 
2) jspService(), It is called for each request that is made to the JSP page.
3) jspDestorey(), called when the JSP page is being unloaded,

519.What are the advantages of using JSP in web architecture?

1) Easy to use, because it coube be integrated with JAVA, which is the most popular programming.
2) Integration with Java:
3) Dynamic Content, JSP pages can generate dynamic content based on user input and other variables,


520.What is the advantage of JSP over Javascript?

They are both used in Web Dev. But
1) JSP is server-side processing, JSP code is executed on the server and generates HTML output in the server rather than client
2) Integration with Java, allows for easy integration with Java-based frameworks and libraries. 


521.What is the Lifecycle of JSP?


Refers to the sequence of events that occur during the processing of a JSP page. The lifecycle consists of the following phases, like Initialization , Request Processing and Destruction process.


522.What is a JSP expression?

JSP expression allows  us to embed Java code within the HTML code of a JSP page. An expression is defined using the <%= %> syntax and can contain any valid Java expression

523.What are the different types of directive tags in JSP?

524.What is session attribute in JSP?

is a type of object that can be stored and accessed across multiple requests from the same user. When a user accesses a JSP page, the JSP container creates a session object for that user, which can be used to store data that needs to be accessed across multiple requests


525.What are the different scopes of a JSP object?

Page scope: only within the current JSP page.
Request scope: Objects in the request scope are accessible across multiple pages within a single HTTP request.
Session scope: Objects in the session scope are accessible across multiple requests from the same user.

