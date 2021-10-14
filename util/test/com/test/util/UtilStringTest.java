package com.test.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilStringTest {

    @DisplayName("test uppercase passing valid text")
    @Test void GIVEN_valid_text_WHEN_uppercase_SHOULD_return_upper(){
        assertEquals("TEXT",  UtilString.uppercase("text"));
    }

    @DisplayName("test uppercase passing null text")
    @Test void GIVEN_null_text_WHEN_uppercase_SHOULD_return_null(){
        assertNull(UtilString.uppercase(null));
    }

}
