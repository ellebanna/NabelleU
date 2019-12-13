/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.net.*;
import java.io.*;

import java.net.Socket;

/**
 *
 * @author belciñaan_sd2081
 */
public class Server {

    public class SimpleServer {

        public void server() {
            ServerSocket s = null;

            // Register your service on port 5432
            try {
                s = new ServerSocket(5432);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Run the listen/accept loop forever
            while (true) {
                try {
                    // Wait here and listen for a connection
                    Socket s1 = s.accept();

                    // Get output stream associated with the socket
                    OutputStream s1out = s1.getOutputStream();
                    BufferedWriter bw = new BufferedWriter(
                            new OutputStreamWriter(s1out));

                    // Send your string!
                    bw.write("Hello Net World!\n");
                    // Close the connection, but not the server socket
                    bw.close();
                    s1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } // END of try-catch
            } // END of while(true)
        } // END of main method
    } // END of SimpleServer program
}
