package file_handling.service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import file_handling.manager.ConsoleManager;

public class SpeedTime {

	String temp, temp1, temp2;
	Scanner scanner = new Scanner(System.in);

	public SpeedTime() {

	}

	public boolean copy(Path source, Path destination) {

		ConsoleManager.getInstance().printToConsole("Veuillez saisir le chemin d'accès du fichier :", true);
		temp1 = this.scanner.nextLine();
		this.isFile(temp1);

		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void isFile(String url) {
		ConsoleManager.getInstance().consoleLineBreak();
		if (new File(temp1).isFile()) {
			System.out.println("Le chemin est bien valide veuillez maintenant coller votre fichier : ");

		} else {
			System.out.println("Chemin d'accès invalide");
			System.out.println("Veuillez entrez le chemin d'accès valide (fichier) :");
			temp1 = ConsoleManager.getInstance().readUserInput();
		}

	}
}
