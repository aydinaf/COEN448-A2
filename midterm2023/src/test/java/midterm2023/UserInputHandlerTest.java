package midterm2023;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class UserInputHandlerTest {

    @Test
    void readUserInput() {
        String[] inputLines = new String[]{
                "The first line.",
                "The second line.",
                "bye",
                "The last line.",
                "anything after 'bye' will be ignored"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 3);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }

    }

    @Test
    void readUserInputP1() {
        String[] inputLines = new String[]{
                "exit"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }

    }

    @Test
    void readUserInputP2() {
        String[] inputLines = new String[]{
                "first line",
                "exit"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }

    }

    @Test
    void readUserInputI() {
        String[] inputLines = new String[]{
                "quit"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    void readUserInputJ() {
        String[] inputLines = new String[]{
                "bye"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }
    }
    @Test
    void readUserInputK() {
        String[] inputLines = new String[]{
                "EXIT"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    void readUserInputL() {
        String[] inputLines = new String[]{
                "Anything",
                "quit"
        };
        String[] expectedLines = Arrays.copyOf(inputLines, inputLines.length - 1);
        List<String> expected = Arrays.stream(expectedLines).collect(Collectors.toList());
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.join("\n", inputLines).getBytes()));
            List<String> actual = UserInputHandler.readUserInput();
            assertThat(actual).isEqualTo(expected);
        } finally {
            System.setIn(stdin);
        }
    }
}