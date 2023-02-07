package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AdminBlockTest {

    @DisplayName("새로 생성한 관리자는 차단 상태가 아님")
    @Test
    void newCreatedAdmin_NonBlock() {
        Admin admin = new Admin();
        assertThat(admin.isBlocked()).isFalse();
    }

    @Test
    void block() {
        Admin admin = new Admin();
        admin.block();
        assertThat(admin.isBlocked()).isTrue();

    }

    @Test
    void alreadyBlocked() {
        Admin admin = new Admin();
        admin.block();
        Assertions.assertThatCode(
                        () -> admin.block())
                .isInstanceOf(AlreadyBlockedException.class);
        assertThat(admin.isBlocked()).isTrue();
    }

    public static class Admin {
        private boolean blocked = false;

        public boolean isBlocked() {
            return blocked;
        }

        public void block() {
            if (blocked) {
                throw new AlreadyBlockedException();
            }
            blocked = true;
        }
    }
}
