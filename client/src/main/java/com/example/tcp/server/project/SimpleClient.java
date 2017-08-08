package com.example.tcp.server.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

    private static int port = 4040;
    private static String host = "localhost";
    private static Socket connection;

    public static void main(String[] args) throws IOException {
        connection = new Socket(host, port);

        DataInputStream dataInputStream = new DataInputStream(connection.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        dataOutputStream.writeInt(scanner.nextInt());
        System.out.println("Server Response: " + dataInputStream.readInt());
    }
}
