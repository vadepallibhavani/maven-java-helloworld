# Maven-Java-Hello-World" 

The Maven Java project can be imported to Ecliplse (File -> Import -> Maven -> Existing Maven Projects).

Or to use Maven to build the package as listed below.
===========================================================

C:\HelloWorldJava>mvn -version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\apache-maven-3.6.3\bin\..
Java version: 14.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-14.0.1
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

C:\HelloWorldJava>java -version
java version "1.8.0_251"
Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)

C:\HelloWorldJava>echo %JAVA_HOME%
C:\Program Files\Java\jdk-14.0.1

C:\HelloWorldJava>mvn package
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< com.capgroup:HelloWorldJava >---------------------
[INFO] Building HelloWorldJava 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ HelloWorldJava ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ HelloWorldJava ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\HelloWorldJava2\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ HelloWorldJava ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ HelloWorldJava ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\HelloWorldJava2\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ HelloWorldJava ---
[INFO] Surefire report directory: C:\HelloWorldJava2\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.capgroup.HelloWorldTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.08 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ HelloWorldJava ---
[INFO] Building jar: C:\HelloWorldJava2\target\HelloWorldJava-1.0.0.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.639 s
[INFO] Finished at: 2020-05-21T22:13:49-07:00
[INFO] ------------------------------------------------------------------------

















































































































































































