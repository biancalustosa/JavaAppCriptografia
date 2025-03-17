import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String variavelString = JOptionPane.showInputDialog("Entre com uma mensagem a criptografar:");

        //Sessão para exbibir os inputs

        //StringBuilder adicionar espaço na mensagem
        StringBuilder mensagemComEspacos = new StringBuilder();
        for (char c : variavelString.toCharArray()) {
            mensagemComEspacos.append(c).append(" ");
        }
        JOptionPane.showMessageDialog(null, "A mensagem digitada foi: " + mensagemComEspacos.toString().trim(), "Aplicativo de Criptografia", JOptionPane.INFORMATION_MESSAGE);

        // Conversão de caractere
        char[] caracteres = variavelString.toCharArray();

        //StringBuilder para armazenar os dados
        StringBuilder valoresAsciiOriginais = new StringBuilder();
        StringBuilder valoresAsciiCriptografados = new StringBuilder();

        //Obter o valor ASCII do caracter original
        for (char c : caracteres) {
            int valorAsciiOriginal = (int) c;
            valoresAsciiOriginais.append(valorAsciiOriginal).append(" ");
        }

        //Exibição do valor ACSII Original
        JOptionPane.showMessageDialog(null, "Os valores ASCII dos caracteres são: " + valoresAsciiOriginais.toString().trim(), "Aplicativo de Criptografia", JOptionPane.INFORMATION_MESSAGE);

        //Adicionar +10 para criptografar
        for (char c : caracteres) {
            int valorAsciiCriptografado = ((int) c) + 10;
            valoresAsciiCriptografados.append(valorAsciiCriptografado).append(" ");
        }
        //Exibi o valor ASCII criptografado
        JOptionPane.showMessageDialog(null, "Os valores ASCII criptografados dos caracteres são: " + valoresAsciiCriptografados.toString().trim(), "Aplicativo de Criptografia", JOptionPane.INFORMATION_MESSAGE);

        StringBuilder mensagemCriptografada = new StringBuilder();
        for (char c : caracteres) {
            int valorAsciiCriptografado = ((int) c) + 10;
            //Converter o novo valor ASCII para caracter
            char caracterCriptografado = (char) valorAsciiCriptografado;
            mensagemCriptografada.append(caracterCriptografado).append(" ");

        }
        //Exibi a mensagem criptografada usando o JOptionPane
        JOptionPane.showMessageDialog(null, "A mensagem criptografada é: " + mensagemCriptografada.toString().trim(), "Aplicativo de Criptografia", JOptionPane.INFORMATION_MESSAGE);
    }
}