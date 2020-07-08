package edu.psu.behavioural.state.concreteState;

import edu.psu.behavioural.state.states.TCPState;
import edu.psu.behavioural.state.context.TCPConnection;

public class TCPListen extends TCPState {
    private static TCPState instance;

    private TCPListen()
    {
    }

    public static TCPState getInstance()
    {
        if( instance == null )
        {
            instance = new TCPListen();
        }
        return instance;
    }

    @Override
    public void send( TCPConnection connection )
    {
        System.out.println( "Sending SYN" );
        System.out.println( "Receiving SYN" );
        System.out.println( "Receiving ACK" );
        changeState( connection, TCPEstablished.getInstance() );
    }
}
