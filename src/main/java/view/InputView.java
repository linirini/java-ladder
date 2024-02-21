package view;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public List<String> readNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        final String rawNames = scanner.nextLine().trim();
        return List.of(rawNames.split(","));
    }

    public int readHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        try {
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("높이는 숫자여야 합니다.");
        }
    }

}
