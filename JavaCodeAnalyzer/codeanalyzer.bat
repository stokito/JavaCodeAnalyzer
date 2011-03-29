rem comma separated list of source files to be verified
set %SOURCES% = .\src\main\java\demo\codeanalyzer\examples\TestClass1.java
java -classpath %JAVA_HOME%\lib\tools.jar;.; demo.codeanalyzer.main.Main %SOURCES%

