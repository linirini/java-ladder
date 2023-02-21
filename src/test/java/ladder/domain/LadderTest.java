package ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {
    @Test
    @DisplayName("사다리 높이만큼 라인을 생성한다.")
    void test_2() {
        // given
        Ladder ladder = new Ladder(() -> true, 5, 4);

        // then
        assertThat(ladder.getLines()).hasSize(5);
    }
}