package startup.vn.userservice.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PingMeTest {

    @Test
    void pingReturnsPongMessage() {
        PingMe pingMe = new PingMe();

        assertEquals("[user-service] Pong!", pingMe.ping());
    }
}
