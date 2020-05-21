/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author Josemolamazo
 */
public class MeuFicheiro extends ObjectOutputStream{

    public MeuFicheiro() throws IOException, SecurityException {
    }

    public MeuFicheiro(FileOutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        super.writeStreamHeader(); 
    }
    
}
