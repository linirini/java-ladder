package domain;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private final List<Player> players = new ArrayList<>();

    public Players(final List<String> names) {
        validateNameCount(names.size());
        for (final String name : names) {
            players.add(new Player(name));
        }
    }

    private void validateNameCount(final int count) {
        if (count < 2 || count > 10) {
            throw new IllegalArgumentException("참가자 수는 2명 이상 10명 이하 이어야 합니다.");
        }
    }

    public int count() {
        return players.size();
    }

    public List<String> getNames() {
        final List<String> names = new ArrayList<>();
        for (final Player player : players) {
            names.add(player.getName());
        }

        return names;
    }
}
