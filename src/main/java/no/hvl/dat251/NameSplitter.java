package no.hvl.dat251;

public class NameSplitter {

	public static String getFirstName(String fultNavn) {
		return fultNavn.split(" ")[0];
	}

	public static Object getLastName(String fultNavn) {
		return fultNavn.split(" ")[1];
	}

}
