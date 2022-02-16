
public class Ejecucion {

	public static void main(String[] args) {
		Hilo h= new Hilo();
		h.start();
		
		Hilo2 h2=new Hilo2();
		Thread th=new Thread(h2);
		
		
		th.start();
		
		Runnable r=new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<100;i++) {
					System.out.println("Ejecutando hilo de clase anonima: "+ i);
			}

		}
		};
		
		Thread thr=new Thread(r);
		thr.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("Ejecutando for del main: "+i);
		}
	}

}
