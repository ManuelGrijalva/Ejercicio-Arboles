package ArbolBinario;

public class Arbol {
    //nodo raiz del arbol

    private Nodo raiz;

    //constructor de la clase arbol sin parametros
    public Arbol(){this.raiz = null;}

    //insertar un nodo con el valor dato, si el arbol esta vaio se crea un dodo con el valor dato
    public void insertar(int dato){
        if(this.raiz == null){
            this.raiz = new Nodo(dato);
        }else{
            this.raiz = insertar(this.raiz, dato);
        }
    }

    //si no tiene valor nulo, se inserta en un orden
    private Nodo insertar(Nodo padre, int dato){
        if(dato < padre.valorNodo()){
            if(padre.GetSubarbolIzdo() == null){
                padre.setRamaIzdo(new Nodo(dato));
            }else{
                insertar (padre.GetSubarbolIzdo(), dato);
            }
        }else if(dato > padre.valorNodo()){
            if(padre.GetSubarbolDcho() == null){
                padre.setRamaDcho(new Nodo(dato));
            }else{
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
        return padre;
    }

}
