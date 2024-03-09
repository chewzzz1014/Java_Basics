package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExceptionMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Exception learning...");
        // getPlayers();
    }

    public static List<Player> getPlayers() throws IOException {
        Path path = Paths.get("players.dat");
        List<String> players = Files.readAllLines(path);

        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public int getPlayerScore(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch(IOException | NumberFormatException e) { // union catch block
            System.out.println("Failed to load score!");
            return 0;
        }
    }

    public List<Player> loadAllPlayers(String playersFile) throws IOException {
        try {
            Path path = Paths.get("players.dat");
            List<String> players = Files.readAllLines(path);

            return players.stream()
                    .map(Player::new)
                    .collect(Collectors.toList());
        } catch(IOException io) {
            io.printStackTrace();
            return null;
        }
    }

    public String readFile(String fileName) throws IncorrectFileNameException {
        try(Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine()) return file.nextLine();
            else throw new IllegalArgumentException("Non readable file");
        } catch (FileNotFoundException e) {
            if (!fileName.contains("test")) {
                throw new IncorrectFileNameException("Incorrect filename: " + fileName, e);
            }
            return "";
        } catch (IllegalArgumentException e) {
            if (!fileName.endsWith("txt")) {
                throw new IncorrectFileExtensionException("Filename does not contain extension: " + fileName, e);
            }
            return "";
        }
    }
}
