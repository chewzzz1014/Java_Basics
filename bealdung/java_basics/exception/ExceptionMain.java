package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionMain {
    public static void main(String[] args) {
        System.out.println("Exception learning...");
    }

    public static List<Player> getPlayers() throws IOException {
        Path path = Paths.get("players.dat");
        List<String> players = Files.readAllLines(path);

        return players.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }
}
