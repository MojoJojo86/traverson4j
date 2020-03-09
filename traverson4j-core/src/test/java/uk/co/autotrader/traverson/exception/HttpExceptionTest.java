package uk.co.autotrader.traverson.exception;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class HttpExceptionTest {
    @Test
    public void init_OverridesMessageAndCauseConstructor() throws Exception {
        IOException cause = new IOException();

        HttpException exception = new HttpException("My Message", cause);

        assertThat(exception).hasMessage("My Message")
                .hasCauseExactlyInstanceOf(IOException.class);
    }

    @Test
    public void init_OverridesMessageConstructor() throws Exception {
        HttpException exception = new HttpException("Just a single, lonely message");

        assertThat(exception).hasMessage("Just a single, lonely message");
    }
}
