package fp.utiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {

	public static List<String> leerLineas(String nombreFichero) {
		List<String> lineas = new ArrayList<>();
		try {
			lineas = Files.readAllLines(Paths.get(nombreFichero));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lineas;
	}
}
