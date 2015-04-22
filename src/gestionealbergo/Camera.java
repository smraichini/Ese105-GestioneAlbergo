package gestionealbergo;
import java.time.LocalDateTime;
import java.util.Vector;

public abstract class Camera {
 
	private String numero;
	private Vector<Prenotazione> prenotazioni;

	
	public Camera(String numero){
		if(numero != null){
			if(numero.length()>=0){
				this.numero = numero;
			}
		    else{
		    	throw new IllegalArgumentException("Il campo numero deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il campo numero deve essere presente");
		}
		
		prenotazioni = new Vector<Prenotazione>();
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if(numero != null){
			if(numero.length()>=0){
				this.numero = numero;
			}
		    else{
		    	throw new IllegalArgumentException("Il campo numero deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il campo numero deve essere presente");
		}
		
	}
	
	public boolean isDisponibile(LocalDateTime dal,LocalDateTime al){
		boolean disp=false;
		for(Prenotazione p : this.prenotazioni){
			if(dal.getDayOfYear() > p.getArrivoIl().getDayOfYear() && al.getDayOfYear() < p.getArrivoIl().getDayOfYear()+p.getNumeroNotti()){
				disp=true;
			}
		}
		return disp;
	}

}
