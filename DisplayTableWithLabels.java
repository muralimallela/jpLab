package jplab;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayTableWithLabels {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				displayTable();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	private static void displayTable() throws IOException {
		// Create a JFrame
		JFrame frame = new JFrame("Table Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Read data from the text file
		BufferedReader reader = new BufferedReader(new FileReader("D:\\table.txt"));

		// Read the header line
		String headerLine = reader.readLine();
		String[] headers = headerLine.split(",");

		// Create a GridLayout with the number of rows and columns
		int numRows = 0;
		while (reader.readLine() != null) {
			numRows++;
		}
		int numColumns = headers.length;
		GridLayout gridLayout = new GridLayout(numRows + 1, numColumns);

		// Set the GridLayout for the JFrame's content pane
		frame.setLayout(gridLayout);

		// Add header labels
		for (String header : headers) {
			JLabel label = new JLabel(header);
			frame.add(label);
		}

		// Reset the reader to read the data lines
		reader = new BufferedReader(new FileReader("D:\\table.txt"));
		// Skip the header line
		reader.readLine();

		// Add data labels
		String line;
		while ((line = reader.readLine()) != null) {
			String[] data = line.split(",");
			for (String datum : data) {
				JLabel label = new JLabel(datum);
				frame.add(label);
			}
		}

		// Pack and display the frame
		frame.pack();
		frame.setVisible(true);
	}
}
