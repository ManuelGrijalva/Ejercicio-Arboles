package ArbolCadena;

public class ArbolCadenas {

        private NodoCadena raiz;

        public ArbolCadenas(){
        }

        public void insertar(String dato){
            if (this.raiz == null){
                this.raiz = new NodoCadena(dato);
            } else {
                this.insertar(this.raiz,dato);
            }
        }

        private void insertar(NodoCadena padre, String dato){
            if(dato.compareTo(dato) > 0){
                if(padre.getDerecha()==null){
                    padre.setDerecha(new NodoCadena(dato));
                } else {
                    this.insertar(padre.getDerecha(),dato);
                }
            } else {
                if (padre.getIzquierda()==null){
                    padre.setIzquierda(new NodoCadena(dato));
                } else {
                    this.insertar(padre.getIzquierda(),dato);
                }
            }
        }

    }

