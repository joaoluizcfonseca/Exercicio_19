import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        String frase ;
        int num ;
        frase = JOptionPane.showInputDialog(null,"Digite uma frase: ");
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro: "));
        int i = 0 ;
        while (i < num) {
            JOptionPane.showMessageDialog(null,frase);
            i++;
        }
        

    }   
}