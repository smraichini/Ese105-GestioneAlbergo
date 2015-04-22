package gestionealbergo;


public class Cliente {
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	
	public Cliente(String nome, String cognome, String cellulare) {
		
		if(nome != null){
			if(nome.length()>=0){
				this.nome = nome;
			}
		    else{
		    	throw new IllegalArgumentException("Il campo nome deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il campo nome deve essere presente");
		}
		
		
		
		if(cognome !=null){
			if(cognome.length()>=0){
				this.cognome = cognome;
			}
			else{
				throw new IllegalArgumentException("Il campo cognome deve essere presente");
			}
		}
		else{
			throw new IllegalArgumentException("Il campo cognome deve essere presente");
		}
		
		
		
		if(cellulare !=null){
			if(cellulare.length()>=0){
				this.cellulare = cellulare;
			}
			else{
				throw new IllegalArgumentException("Il campo cellulare deve essere presente");
			}
		}
		else{
			throw new IllegalArgumentException("Il campo cellulare deve essere presente");
		}	
	}

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		
		if(nome != null){
			if(nome.length()>=0){
				this.nome = nome;
			}
		    else{
		    	throw new IllegalArgumentException("Il campo nome deve essere presente");
		   	}
		}
		else{
			throw new IllegalArgumentException("Il campo nome deve essere presente");
		}
		
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		
		if(cognome !=null){
			if(cognome.length()>=0){
				this.cognome = cognome;
			}
			else{
				throw new IllegalArgumentException("Il campo cognome deve essere presente");
			}
		}
		else{
			throw new IllegalArgumentException("Il campo cognome deve essere presente");
		}
		
	}

	
	public String getCellulare() {
		return cellulare;
	}

	
	public void setCellulare(String cellulare) {
		
		if(cellulare !=null){
			if(cellulare.length()>=0){
				this.cellulare = cellulare;
			}
			else{
				throw new IllegalArgumentException("Il campo cellulare deve essere presente");
			}
		}
		else{
			throw new IllegalArgumentException("Il campo cellulare deve essere presente");
		}	
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email !=null){
			if(email.length()>=0){
				this.email = email;
			}
			else{
				throw new IllegalArgumentException("Il campo email deve essere presente");
			}
		}
		else{
			throw new IllegalArgumentException("Il campo email deve essere presente");
		}	
		
	}
	
	
	
}
