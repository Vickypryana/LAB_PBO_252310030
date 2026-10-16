package praktikum4;

import javax.swing.JOptionPane;

public class quizarray {
	public static void main(String[] args) {
		double[] nilai = new double[5];
		double total = 0;
		
		for(int i = 0; i<5; i++) {
			String input = JOptionPane.showInputDialog(null, "Masukkan nilai ke- " + (i + 1));
		nilai[i] = Double.parseDouble(input);
		
		total += nilai[i];
		}
		
		double rata2 = total / nilai.length;
		
		String hasil = "Daftar Nilai:\n";
        for (int i = 0; i < nilai.length; i++) {
            hasil += "Nilai ke-" + (i + 1) + " = " + nilai[i] + "\n";
        }
        hasil += "\nTotal     : " + total;
        hasil += "\nRata-rata : " + rata2;
	
        JOptionPane.showMessageDialog(null, hasil);
	}
}
