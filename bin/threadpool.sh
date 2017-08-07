$startPoolSize = 10
$port= 4040

javac /home/sachith/Tutorials/TCPServerProject/src/main/java/com/example/tcp/server/project/server/SimpleThread.java
javac /home/sachith/Tutorials/TCPServerProject/src/main/java/com/example/tcp/server/project/server/SimpleServer.java
javac /home/sachith/Tutorials/TCPServerProject/src/main/java/com/example/tcp/server/project/client/SimpleClient.java


java /home/sachith/Tutorials/TCPServerProject/src/main/java/com/example/tcp/server/project/server/SimpleServer $startPoolSize $port
java /home/sachith/Tutorials/TCPServerProject/src/main/java/com/example/tcp/server/project/client/SimpleClient $port
