# sqliteJDBC

I found the JDBC driber tricky to install. Here is an example of how to access a sqlite files with JDBC, from past me to future me :D

Steps I followed:
1. Add "jdbc:sqlite:" in front of the path (see sqlite.java)
2. Add the dependecy in the pom file (see pom.xml) -- however this didn't seem to work
3. Download the jar file (sqlite-jdbc-3.42.0.0.jar) and add it to IntelliJ: File>Project Structure>Module> "+" > Apply


Example dataset from http://2016.padjo.org/tutorials/sqlite-data-starterpacks/.
