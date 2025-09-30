import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        try {
            String ip = JOptionPane.showInputDialog("Digite o ip com qual quer conectar");
            Socket servidor = new Socket(ip, 4444);//endereco e porta
            PrintWriter out = new PrintWriter(
                    servidor.getOutputStream(), true);
            String mensagem = "";
            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.
                        showInputDialog("Digite a Mensagem ou fim para sair");
                out.println(mensagem); //escreve a mensagem
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}
