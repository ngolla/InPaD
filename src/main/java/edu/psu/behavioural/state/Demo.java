package edu.psu.behavioural.state;

import edu.psu.behavioural.state.context.TCPConnection;

public class Demo {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.passiveOpen();
        connection.send();
        connection.close();
    }
}
