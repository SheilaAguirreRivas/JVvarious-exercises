/*
 * Problema:
Confeccionar una clase llamada JuegoDeDados que contenga una clase anidada interna llamada Dado.
La clase JuegoDeDados tiene como atributo el nombre del jugador que tirar� el dado y un objeto de
 la clase Dado.
Cada vez que se tire un dado la clase Dado debe verificar que el atributo 'jugador' de la clase 
externa tenga el nombre de una persona.

Clase: JuegoDeDados

 */
public class JuegoDeDados {

    private String jugador;
    private Dado dado1;

    private class Dado {
        private int valor = 1;

        public void tirar() throws Exception {
            if (jugador == null)
                throw new Exception("No hay jugador seleccionado");
            valor = 1 + (int) (Math.random() * 6);
        }

        public void imprimir() {
            System.out.println("Al jugador " + jugador + " le sali� el valor:" + valor);
        }
    }

    public JuegoDeDados() {
        dado1 = new Dado();
    }

    public void jugar(String nombre) {
        try {
            jugador = nombre;
            dado1.tirar();
            dado1.imprimir();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
