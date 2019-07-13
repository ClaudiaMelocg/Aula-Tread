package Theads;

public class MinhaThread extends Thread{
	
	private String nome;

	public MinhaThread(String nome) {
		this.nome = nome;
		start();
	}
	
	
	public void run() {
		try {
			for(int i = 0; i < 6; i++) {
			System.out.println(nome + " contator " +  i);
			Thread.sleep(900);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		
		System.out.println(" Terminou a Thread ");
		

	}
	
	
	

}
	

