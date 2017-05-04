
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo
{
    private int peso;
    private int puntosDeVida;

    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
       peso = 15;
       puntosDeVida = 100;
    }

    public void comer()
    {
        peso = peso + 2;
        puntosDeVida = puntosDeVida - 10;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("¡Oink, oink!");
    }
    
    public int getPeso()
    {
        return peso;
    }
    
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    
}
