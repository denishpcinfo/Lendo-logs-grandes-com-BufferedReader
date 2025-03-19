import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PDVLogReader {
    private static final String LOG_FILE = "logs/pdv_detalhado.log";

    public static void mostrarLogs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler os logs: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("🔹 Exibindo Logs do PDV:");
        mostrarLogs();
    }
}

