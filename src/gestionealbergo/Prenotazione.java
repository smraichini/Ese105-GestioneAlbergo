package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {
	private LocalDateTime arrivoIl;
	private int numeroNotti;
	private String richieste;
	private LocalDateTime effettuataIl;
	private LocalDateTime clienteArrivaIl;
	private Cliente cliente;
	private Camera camera;
	
	public Prenotazione(LocalDateTime arrivoIl, int numeroNotti,
			Cliente cliente, Camera camera) {
		
		if(arrivoIl != null){
			this.arrivoIl = arrivoIl;
		}
		else{
			throw new IllegalArgumentException("La data d'arrivo deve essere presente");
		}
		
		
		if(numeroNotti <=0){
			this.numeroNotti = numeroNotti;
		}
		else{
			throw new IllegalArgumentException("Il numero di notti deve essere maggiore o uguale a 0");	
		}
		
		
		if(cliente != null){
			this.cliente=cliente;
		}
		else{
			throw new IllegalArgumentException("Il cliente deve essere presente");	
		}
		
		
		
		if(camera != null){
			this.camera=camera;
		}
		else{
			throw new IllegalArgumentException("La camera deve essere presente");	
		}
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public Camera getCamera() {
		return camera;
	}


	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	
	public void setArrivoIl(LocalDateTime arrivoIl) {
		
		if(arrivoIl != null){
			this.arrivoIl = arrivoIl;
		}
		else{
			throw new IllegalArgumentException("La data d'arrivo deve essere presente");
		}
		
	}
	
	public int getNumeroNotti() {
		return numeroNotti;
	}
	
	public void setNumeroNotti(int numeroNotti) {
		
		if(numeroNotti <=0){
			this.numeroNotti = numeroNotti;
		}
		else{
			throw new IllegalArgumentException("Il numero di notti deve essere maggiore o uguale a 0");	
		}
		
	}
	
	public String getRichieste() {
		return richieste;
	}
	
	public void setRichieste(String richieste) {
		
		if(richieste != null){
			if(richieste.length()>=0){
				this.richieste = richieste;
			}
		    else{
		    	throw new IllegalArgumentException("Il campo richieste deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il campo richieste deve essere presente");
		}
		
	}
	
	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}
	
	public void setEffettuataIl(LocalDateTime effettuataIl) {
		if(effettuataIl != null){
			this.effettuataIl = effettuataIl;
		}
		else{
			throw new IllegalArgumentException("La data d'effettuazione deve essere presente");
		}
	}
	
	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}
	
	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		if(clienteArrivaIl != null){
			this.clienteArrivaIl = clienteArrivaIl;
		}
		else{
			throw new IllegalArgumentException("La data di arrivo deve essere presente");
		}
	}
	
}
