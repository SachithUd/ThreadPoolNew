package com.example.tcp.server.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class SimpleServer {
    public static int queueSize = 2;
    public static int minimumPoolSize = 1;
    public static int startPoolSize = 2;
    static Socket client;
    static ServerSocket ss;
    static ExecutorService executor;
    private static int port = 4040;

    public SimpleServer(int startPoolSize, int newPort) {
        port = newPort;
        final BlockingQueue<Runnable> queue = new ArrayBlockingQueue(queueSize);
        executor = new ThreadPoolExecutor(minimumPoolSize, startPoolSize, 0L, TimeUnit.MILLISECONDS, queue);
    }

    public static void main(String[] args) {
        SimpleServer server = new SimpleServer(startPoolSize, port);
        try {
            server.startServer();
        } catch (IOException e) {
            System.out.println("Server Stopped");
            e.printStackTrace();
        }
    }

    public void startServer() throws IOException {
        ss = new ServerSocket(port);
        System.out.println("Listening to: " + port);


        while (true) {
            client = ss.accept();
            System.out.println("Client Connected");
            executor.execute(new SimpleThread(client));
        }
    }
}
