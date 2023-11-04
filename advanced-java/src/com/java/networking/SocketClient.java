package com.java.networking;

import java.io.*;
import java.net.Socket;

public class SocketClient {

    public static void main(String [] args) {
    String server = "localhost";
    int port = 1000;
      try {
        Socket clientSocket = new Socket(server, port);

        System.out.println("Connected to " + clientSocket.getRemoteSocketAddress());
        OutputStream outToServer = clientSocket.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);

        out.writeUTF("Hello from " + clientSocket.getLocalSocketAddress());
        InputStream inFromServer = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);
        System.out.println("Server says " + in.readUTF());
        clientSocket.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
