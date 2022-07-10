package com.home.chatapp.networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.home.chatapp.utils.configReader;

public class Server {
	ServerSocket serverSocket ;
	ArrayList<ServerWorker> workers = new ArrayList<>(); // Contains all the client sockets
	public Server() throws IOException {
		int PORT = Integer.parseInt(configReader.getValue("PORTNO"));
		serverSocket  = new ServerSocket(PORT);
		System.out.println("Server Start and Waiting for the clients to join....");
		handleClientRequest();
		
	}
	// Multiple Client HandShaking
	public void handleClientRequest() throws IOException {
		while(true) {
			Socket clientSocket = serverSocket.accept(); // HandShaking
			
			// Per Client Per Thread
			ServerWorker serverWorker = new ServerWorker(clientSocket, this); // Creating a New Worker/Thread
			workers.add(serverWorker);
			serverWorker.start(); 
			}
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Server server = new Server();
		

	}

}
