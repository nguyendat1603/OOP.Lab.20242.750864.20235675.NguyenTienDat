package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) throws Exception {
		String filename = "src/hust/soict/hedspi/garbage/text.txt";
		byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

		long startTime = System.currentTimeMillis();

		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b;
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Thời gian GarbageCreator: " + (endTime - startTime) + " ms");
	}
}
