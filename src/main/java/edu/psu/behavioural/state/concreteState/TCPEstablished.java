package edu.psu.behavioural.state.concreteState;

import edu.psu.behavioural.state.states.TCPOctetStream;
import edu.psu.behavioural.state.states.TCPState;
import edu.psu.behavioural.state.context.TCPConnection;

public class TCPEstablished extends TCPState {
    private static TCPState instance;

    private TCPEstablished()
    {
    }

    public static TCPState getInstance()
    {
        if( instance == null )
        {
            instance = new TCPEstablished();
        }
        return instance;
    }

    @Override
    public void transmit(TCPConnection connection, TCPOctetStream octetStream )
    {
        connection.processOctet( octetStream );
    }

    @Override
    public void close( TCPConnection connection )
    {
        System.out.println( "Sending FIN communicate" );
        System.out.println( "Receiving FIN acknowledge" );
        changeState( connection, TCPListen.getInstance() );
    }
}
