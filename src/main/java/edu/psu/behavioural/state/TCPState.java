package edu.psu.behavioural.state;

import edu.psu.behavioural.state.concreteState.TCPOctetStream;
import edu.psu.behavioural.state.context.TCPConnection;

public class TCPState {
    public void transmit(TCPConnection connection, TCPOctetStream octetStream )
    {
    }

    public void activeOpen( TCPConnection connection )
    {
    }

    public void passiveOpen( TCPConnection connection )
    {
    }

    public void close( TCPConnection connection )
    {
    }

    public void synchronize( TCPConnection connection )
    {
    }

    public void acknowledge( TCPConnection connection )
    {
    }

    public void send( TCPConnection connection )
    {
    }

    protected void changeState(TCPConnection connection, TCPState state )
    {
        connection.changeState( state );
    }
}
