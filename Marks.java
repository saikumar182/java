package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Marks {

	public static void main(String[] args) throws IOException {

		String line, filename = "/home/saikumar/saikumar46/filename.txt\n" ;
		int total;
		FileReader fr = new FileReader(filename);
		try (BufferedReader br = new BufferedReader(fr)) {
			line = br.readLine();
			while (line != null) {
				total = 0;
				String marks[] = line.split(",");
				for (var i : marks) {
					try {
						total += Integer.parseInt(i);
					} catch (NumberFormatException e) {
					}
				}
				System.out.println(total);
				line = br.readLine();
			}
		}
	}

}
