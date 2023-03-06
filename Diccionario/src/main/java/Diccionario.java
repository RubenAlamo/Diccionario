import java.util.HashMap;
import java.util.LinkedList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Diccionario {

    private HashMap<Character, LinkedList<String>> tablaHash;

    public Diccionario() {
        tablaHash = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            tablaHash.put(c, new LinkedList<String>());
        }
    }

    public boolean buscarPalabra(String palabra) {
        char primeraLetra = palabra.charAt(0);
        LinkedList<String> palabrasConLetra = tablaHash.get(primeraLetra);
        return palabrasConLetra.contains(palabra);
    }

    public void agregarPalabra(String palabra) {
        char primeraLetra = palabra.charAt(0);
        LinkedList<String> palabrasConLetra = tablaHash.get(primeraLetra);
        palabrasConLetra.add(palabra);
    }

    public static void main(String[] args) {
        String csvFile = "/Users/ruben/Downloads/palabrasCarpeta.csv/palabras.csv";
        String line = "";
        String csvSeparator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSeparator);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}