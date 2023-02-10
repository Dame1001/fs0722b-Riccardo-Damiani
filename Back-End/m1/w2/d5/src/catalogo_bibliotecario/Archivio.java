package catalogo_bibliotecario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Archivio {

	private static final Logger logger = LoggerFactory.getLogger(Archivio.class);
	private static File file = new File("dir/archivio.txt");

	public static void avvio() throws IOException {
		Scanner scan = new Scanner(System.in);
		logger.info("Benvenuto nell'archivio");
		boolean controllo = true;
		List<Elemento> archivio = new ArrayList<Elemento>();
		while (controllo) {
			try {
				System.out.println("");
				logger.info("Elenco comandi: ");
				logger.info("Esci -<0>-");
				logger.info("Aggiungi elemento -<1>-");
				logger.info("Rimuovi l'elemento tramite il suo codice -<2>-");
				logger.info("Cerca l'elemento tramite codice -<3>-");
				logger.info("Cerca l'elemento per anno di uscita -<4>-");
				logger.info("Cerca l'elemento per autore -<5>-");
				logger.info("Salva l'elemento in locale -<6>-");
				logger.info("Carica l'elemento da locale -<7>-");
				int risultato = Integer.parseInt(scan.nextLine());

				switch (risultato) {
				case 0:
					controllo = false;
					logger.info("Arrivederci!");
					break;
				case 1:
					aggiungi(archivio);
					break;
				case 2:
					logger.info("Inserisci il codice dell'elemento che vuoi cancellare: ");
					int canc = Integer.parseInt(scan.nextLine());
					rimuovi(archivio, canc);
					break;
				case 3:
					logger.info("Inserisci il codice dell'elemento che vuoi cercare: ");
					int codice = Integer.parseInt(scan.nextLine());
					cercaCodice(archivio, codice);
					break;
				case 4:
					logger.info("Inserisci l'anno dell'elemento che vuoi cercare");
					int anno = Integer.parseInt(scan.nextLine());
					cercaAnno(archivio, anno);
					break;
				case 5:
					logger.info("Inserisci l'autore dell'elemento che vuoi cercare: ");
					String autore = scan.nextLine();
					cercaAutore(archivio, autore);
					break;
				case 6:
					localSave(archivio);
					logger.info("L'archivio è stato salvato in locale correttamente!");
					System.out.println("");
					break;
				case 7:
					archivio = localLoad();
					logger.info("L'archivio è stato caricato correttamente ed è disponibile!");
					break;
				default:
					logger.info("Comando errato, utilizzare i comandi che ti vengono forniti!");
					System.out.println("");
				}
			} catch (NumberFormatException e) {
				logger.info("Comando errato, utilizzare i comandi che ti vengono forniti!");
				System.out.println("");
			}
		}
	}

	public static void aggiungi(List<Elemento> lista) {
		Scanner scan = new Scanner(System.in);
		logger.info("Vuoi aggiungere un libro <1> o una rivista <2>?");
		int scelta = Integer.parseInt(scan.nextLine());
		switch (scelta) {
		case 1:
			logger.info("Inserisci il codice del libro che vuoi aggiungere: ");
			int codice = Integer.parseInt(scan.nextLine());
			logger.info("Inserisci il titolo del libro che vuoi aggiungere: ");
			String titolo = scan.nextLine();
			logger.info("Inserisci l'anno di pubblicazione del libro: ");
			int anno = Integer.parseInt(scan.nextLine());
			logger.info("Inserisci il numero delle pagine che deve avere il libro: ");
			int pagine = Integer.parseInt(scan.nextLine());
			logger.info("Inserisci l'autore del libro");
			String autore = scan.nextLine();
			logger.info("Inserisci il genere del libro");
			String genere = scan.nextLine();
			Libro libro = new Libro(autore, genere, codice, titolo, anno, pagine);
			lista.add(libro);
			logger.info("Libro aggiunto correttamente all'archivio!");
			break;
		case 2:
			Periodicita per = Periodicita.SETTIMANALE;
			logger.info("Inserisci la periodicità della rivista: ");
			logger.info("Settimanale <1> Mensile <2> Semestrale <3> ");
			int scelta2 = Integer.parseInt(scan.nextLine());
			switch (scelta2) {
			case 1:
				per = Periodicita.SETTIMANALE;
				break;
			case 2:
				per = Periodicita.MENSILE;
				break;
			case 3:
				per = Periodicita.SEMESTRALE;
				break;
			default:
				logger.info("Errore, è necessario selezionare il giusto tipo di periodicità!");
			}
			logger.info("Inserisci il codice della rivista: ");
			int codiceRivista = Integer.parseInt(scan.nextLine());
			logger.info("Inserisci il titolo della rivista: ");
			String titoloRivista = scan.nextLine();
			logger.info("Inserisci l'anno di pubblicazione della rivista: ");
			int annoRivista = Integer.parseInt(scan.nextLine());
			logger.info("Inserisci il numero di pagine che deve avere la rivista: ");
			int pagineRivista = Integer.parseInt(scan.nextLine());
			Rivista rivista = new Rivista(per, codiceRivista, titoloRivista, annoRivista, pagineRivista);
			lista.add(rivista);
			logger.info("Rivista aggiunta correttamente all'archivio!");
			break;
		default:
			logger.info("Comando errato, utilizzare i comandi che ti vengono forniti!");
			System.out.println("");
		}
	}

	public static void rimuovi(List<Elemento> lista, int codice) {
		boolean trovato = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodiceISBN() == codice) {
				Stream<Elemento> streamLista = lista.stream().filter(element -> element.getCodiceISBN() != codice);
				lista = streamLista.collect(Collectors.toList());
				logger.info("L'elemento è stato rimosso correttamente dal'archivio");
				trovato = true;
			}
		}
		if (!trovato) {
			logger.info("L'elemento non esiste!");
		}
	}

	public static void cercaCodice(List<Elemento> lista, int codice) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> element.getCodiceISBN() == codice);
		List<Elemento> listamom = new ArrayList<Elemento>();
		listamom = streamLista.collect(Collectors.toList());
		if (!listamom.isEmpty()) {
			logger.info("Risultato: ");
			System.out.println(listamom.get(0).titolo);
		} else {
			logger.info("Nessun elemento trovato!");
		}

	}

	public static void cercaAnno(List<Elemento> lista, int anno) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> element.getAnno() == anno);
		List<Elemento> listamom = new ArrayList<Elemento>();
		listamom = streamLista.collect(Collectors.toList());
		if (!listamom.isEmpty()) {
			logger.info("Risultato:");
			listamom.forEach(elem -> System.out.println(elem.getTitolo()));
		} else {
			logger.info("Nessun elemento trovato!");
		}
	}

	public static void cercaAutore(List<Elemento> lista, String autore) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> (element.getAutore().equals(autore)));
		List<Elemento> listamom = new ArrayList<Elemento>();
		listamom = streamLista.collect(Collectors.toList());
		if (!listamom.isEmpty()) {
			logger.info("Risultato: ");
			listamom.forEach(elem -> System.out.println(elem.getTitolo()));
		} else {
			logger.info("Nessun elemento trovato!");
		}
	}

	public static void localSave(List<Elemento> lista) throws IOException {
		String stampa = "";
		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) instanceof Libro) {
				Libro libromom = (Libro) lista.get(i);
				stampa += "LIBRO";
				stampa += " - ";
				stampa += "Titolo: ";
				stampa += lista.get(i).getTitolo();
				stampa += " - ";
				stampa += "Autore: ";
				stampa += libromom.getAutore();
				stampa += " - ";
				stampa += "Genere: ";
				stampa += libromom.getGenere();
				stampa += " - ";
				stampa += "Codice ISBN: ";
				stampa += Integer.toString(lista.get(i).getCodiceISBN());
				stampa += " - ";
				stampa += "Anno: ";
				stampa += Integer.toString(lista.get(i).getAnno());
				stampa += " - ";
				stampa += "Pagine: ";
				stampa += Integer.toString(lista.get(i).getPagine());
				stampa += " - ";
			} else {
				Rivista rivistamom = (Rivista) lista.get(i);
				stampa += "RIVISTA";
				stampa += " - ";
				stampa += "Periodicità: ";
				if (rivistamom.getPeriodicita() == Periodicita.SETTIMANALE) {
					stampa += "Settimanale";
				} else if (rivistamom.getPeriodicita() == Periodicita.MENSILE) {
					stampa += "Mensile";
				} else {
					stampa += "Semestrale";
				}
				stampa += " - ";
				stampa += "Titolo: ";
				stampa += lista.get(i).getTitolo();
				stampa += " - ";
				stampa += "Codice ISBN: ";
				stampa += Integer.toString(lista.get(i).getCodiceISBN());
				stampa += " - ";
				stampa += "Anno: ";
				stampa += Integer.toString(lista.get(i).getAnno());
				stampa += " - ";
				stampa += "Pagine: ";
				stampa += Integer.toString(lista.get(i).getPagine());
				stampa += " - ";
			}
		}
		FileUtils.writeStringToFile(file, stampa, "UTF-8");
	}

	public static List<Elemento> localLoad() throws IOException {
		List<Elemento> lista = new ArrayList<Elemento>();
		String letto = FileUtils.readFileToString(file, "UTF-8");
		String array[] = letto.split("-");
		for (int i = 0; i < array.length;) {
			if (array[i].equalsIgnoreCase("libro")) {
				String autore = array[i + 1];
				String genere = array[i + 2];
				int codice = Integer.parseInt(array[i + 3]);
				String titolo = array[i + 4];
				int anno = Integer.parseInt(array[i + 5]);
				int pagine = Integer.parseInt(array[i + 6]);
				Libro libro = new Libro(autore, genere, codice, titolo, anno, pagine);
				lista.add(libro);
				i += 7;
			} else {
				Periodicita per = Periodicita.SETTIMANALE;
				if (array[i + 1] == "Settimanale") {
					per = Periodicita.SETTIMANALE;
				} else if (array[i + 1] == "Mensile") {
					per = Periodicita.MENSILE;
				} else {
					per = Periodicita.SEMESTRALE;
				}
				int codice = Integer.parseInt(array[i + 2]);
				String titolo = array[i + 3];
				int anno = Integer.parseInt(array[i + 4]);
				int pagine = Integer.parseInt(array[i + 5]);
				Rivista rivista = new Rivista(per, codice, titolo, anno, pagine);
				lista.add(rivista);
				i += 6;
			}
		}
		return lista;
	}

	public static void main(String[] args) throws IOException {
		avvio();
	}

}
