
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    protected int peso;
    protected static final int PUNTOS_DE_VIDA = 100;

    /**
     * Constructor for objects of class Animal
     */
    
    public Animal(int peso, int puntosDeVida)
    {
        this.peso = peso;
        puntosDeVida = PUNTOS_DE_VIDA;
    }
    
    public int getPuntosDeVida()
    {
        return PUNTOS_DE_VIDA;
    }
    
    public int getPeso()
    {
        return peso;
    }
    
    public void vacunar()
    {
        
    }
   
}
