# sqliteJDBC

My first experience with JDBC driver was not pleasant, although I went through multiple tutorials I found it tricky to install. Here is an example of how to access a database with JDBC, from past me to future me :D

Steps I followed:
1. Add "jdbc:sqlite:" in front of the path (see sqlite.java)
2. Add the dependecy in the pom file (see pom.xml) -- however this didn't seem to work
3. Download the jar file and add it: File>Project Structure>Module> "+" > Apply
