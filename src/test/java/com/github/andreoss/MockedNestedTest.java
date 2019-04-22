package com.github.andreoss;

import mockit.Mocked;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MockedNestedTest {
    @Nested
    class Arg {
        @Test
        void shouldInitializeArg(@Mocked final Foo foo) {
            Assertions.assertNotNull(foo);
        }
    }
    @Nested
    class Field {
        @Mocked Foo foo;
        @Test
        void shouldInitializeField() {
            Assertions.assertNotNull(foo);
        }
    }
    @Nested
    class InheritedField extends TestTemplate {
        @Test
        void shouldInitializeInheritedField() {
            Assertions.assertNotNull(foo);
        }
    }

    abstract static class TestTemplate {
        @Mocked
        Foo foo;
    }
}
