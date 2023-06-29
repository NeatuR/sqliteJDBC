# sqliteJDBC

I found the JDBC driver tricky to install. Here is an example of how to access sqlite datasets with JDBC, from past me to future me :D

Steps I followed:
1. Add "jdbc:sqlite:" in front of the path (see sqlite.java)
2. Add the dependency in the pom file (see pom.xml) -- however this didn't seem to work
3. Download the jar file (sqlite-jdbc-3.42.0.0.jar) and add it to IntelliJ: File > Project Structure >Module > "+" > Select the jar file > Apply
4. It now works!

Example dataset from http://2016.padjo.org/tutorials/sqlite-data-starterpacks/.

But why stop here? Using the org.json library, will iterate through each entry in the result set, and save it to an individual JSON file. 

How to import org.java to IntelliJ IDEA:
1. Download the org.json library from https://github.com/stleary/JSON-java
2. Go to File > Project Structure > Libraries > "+" > Select the jar file (in my case: json-20230618.jar) > Apply
3. You're done!
