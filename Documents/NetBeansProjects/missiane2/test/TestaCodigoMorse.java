

import Morse.Morse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestaCodigoMorse {
    
    private Morse morse;
    
    
    @Before
    public void Inicializa() {
        morse = new Morse ();
    }
    
    @Test
    public void testaSOS() {
        morse.setMensagem("SOS");
        assertEquals("*** --- ***",morse.codifica());
        
    }
     @Test
    public void testaAmizade() {
        morse.setMensagem("AMIZADE");
        assertEquals("*- -- ** --** *- -** *",morse.codifica());
        
    }


}
