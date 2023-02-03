package progetto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int scelta = 0;
		
		Scanner input = new Scanner(System.in);
		
		Multimedia arrayElementi[] = new Multimedia[5];
		
		int aggiungiElemento = 0;
		
		for(int i = 0; i < arrayElementi.length; i++) {
			System.out.println("Premere 1 per inserire un Elemento Multimediale di tipo VIDEO");
            System.out.println("Premere 2 per inserire un Elemento Multimediale di tipo AUDIO");
            System.out.println("Premere 3 per inserire un Elemento Multimediale di tipo IMMAGINE");
            aggiungiElemento = Integer.parseInt(input.nextLine());
            if(aggiungiElemento ==1) {
            	
            	System.out.println("Inserisci il titolo del video");
            	String titolo = input.nextLine();
            	System.out.println("Inserisci la durata del video");
            	int durata = Integer.parseInt(input.nextLine());
            	System.out.println("Inserisci il volume del video");
            	int volume = Integer.parseInt(input.nextLine());
            	System.out.println("Inserisci la luminosità del video");
            	int luminosita = Integer.parseInt(input.nextLine());
            	arrayElementi[i] = new Video(titolo, durata, volume, luminosita);
            	
            }else if(aggiungiElemento == 2) {
            	
            	System.out.println("Inserisci il titolo della registrazione");
            	String titolo = input.nextLine();
            	System.out.println("Inserisci la durata della registrazione");
            	int durata = Integer.parseInt(input.nextLine());
            	System.out.println("Inserisci il volume della registrazione");
            	int volume = Integer.parseInt(input.nextLine());
            	arrayElementi[i] = new Audio(titolo, durata, volume);
            	
            }else if (aggiungiElemento == 3) {
            	
            	System.out.println("Inserisci il titolo dell'immagine");
            	String titolo = input.nextLine();
            	System.out.println("Inserisci la luminosità dell'immagine");
            	int luminosita = Integer.parseInt(input.nextLine());
            	arrayElementi[i] = new Immagine (titolo, luminosita);
            	
            }else {
            	System.out.println("errore, inserisci un numero da 1 a 3");
            	i--;
            }
		}
		
		System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        System.out.println("Premere 0 chiudere il Player Multimediale.");
        
        scelta = Integer.parseInt(input.nextLine());
        
        while(!(scelta == 0)) {
        	if(scelta == 1) {
        		String classe = arrayElementi[--scelta].getClass().toString();
        		if(classe.contains("Video")) {
        			Video video = (Video) arrayElementi[scelta];
        			video.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}else if(classe.contains("Audio")) {
        			Audio audio = (Audio) arrayElementi[scelta];
        			audio.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		} else if(classe.contains("Immagine")) {
        			Immagine immagine = (Immagine) arrayElementi[scelta];
        			immagine.show();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}
        	}else if(scelta == 2) {
        		String classe = arrayElementi[--scelta].getClass().toString();
        		if(classe.contains("Video")) {
        			Video video = (Video) arrayElementi[scelta];
        			video.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}else if(classe.contains("Audio")) {
        			Audio audio = (Audio) arrayElementi[scelta];
        			audio.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		} else if(classe.contains("Immagine")) {
        			Immagine immagine = (Immagine) arrayElementi[scelta];
        			immagine.show();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}
        	}else if(scelta == 3) {
        		String classe = arrayElementi[--scelta].getClass().toString();
        		if(classe.contains("Video")) {
        			Video video = (Video) arrayElementi[scelta];
        			video.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}else if(classe.contains("Audio")) {
        			Audio audio = (Audio) arrayElementi[scelta];
        			audio.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		} else if(classe.contains("Immagine")) {
        			Immagine immagine = (Immagine) arrayElementi[scelta];
        			immagine.show();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}
        	}else if(scelta == 4) {
        		String classe = arrayElementi[--scelta].getClass().toString();
        		if(classe.contains("Video")) {
        			Video video = (Video) arrayElementi[scelta];
        			video.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}else if(classe.contains("Audio")) {
        			Audio audio = (Audio) arrayElementi[scelta];
        			audio.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		} else if(classe.contains("Immagine")) {
        			Immagine immagine = (Immagine) arrayElementi[scelta];
        			immagine.show();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}
        	}else if(scelta == 5) {
        		String classe = arrayElementi[--scelta].getClass().toString();
        		if(classe.contains("Video")) {
        			Video video = (Video) arrayElementi[scelta];
        			video.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}else if(classe.contains("Audio")) {
        			Audio audio = (Audio) arrayElementi[scelta];
        			audio.play();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		} else if(classe.contains("Immagine")) {
        			Immagine immagine = (Immagine) arrayElementi[scelta];
        			immagine.show();
        			
        			System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
        	        System.out.println("Premere 0 chiudere il Player Multimediale.");
        	        
        	        scelta = Integer.parseInt(input.nextLine());
        		}
        	}else {
        		System.out.println("errore, hai selezionato un valore non valido!");
        		
        		System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
    	        System.out.println("Premere 0 chiudere il Player Multimediale.");
    	        
    	        scelta = Integer.parseInt(input.nextLine());
        	}
        }
        
        System.out.println("Sei uscito dal player, Arrivederci!");
        
        
		

	}

}
