package Modulo_data;

import java.time.Duration;
import java.time.Instant;

public class TempodeProcessoComInstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);//Definir porque pode ser com um tempo que n�o conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em nano segundos "+ duracao.toNanos());
		
		System.out.println("Dura��o em minutos "+ duracao.toMinutes());
		
		System.out.println("Dura��o em horas "+ duracao.toHours());
		
		System.out.println("Dura��o em milisegundos segundos "+ duracao.toMillis());
		
		System.out.println("Dura��o em dias "+ duracao.toDays());
		
		
		
		
	}

}
