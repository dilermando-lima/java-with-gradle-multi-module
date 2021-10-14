package com.test.project1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @DisplayName("test logText runs with no error")
    @Test void WHEN_logText_SHOULD_run_sucessfully(){
        assertDoesNotThrow(() -> Application.logText("any text"));
    }

}
