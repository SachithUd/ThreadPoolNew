$startPoolSize = 10
$port= 4040

javac SimpleThread.java
javac SimpleServer.java
javac SimpleClient.java


java SimpleServer $startPoolSize $port
java SimpleClient $port
