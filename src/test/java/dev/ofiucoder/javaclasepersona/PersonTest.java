package dev.ofiucoder.javaclasepersona;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testPersonDetails() {
        Person person = new Person("John", "Doe", "123456789", 1990, "USA", 'M');

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        person.printDetails();
        System.setOut(System.out);

        String expectedOutput = "First Name: John\n" +
                "Last Name: Doe\n" +
                "ID Number: 123456789\n" +
                "Year of Birth: 1990\n" +
                "Country of Birth: USA\n" +
                "Gender: M";

        assertThat(outContent.toString(), equalTo(expectedOutput));
    }

    @ParameterizedTest
    @ValueSource(strings = {"John", "Doe", "123456789", "1990", "USA", "M"})
    public void testPersonAttributes(String expectedValue) {
        Person person = new Person("John", "Doe", "123456789", 1990, "USA", 'M');

        // Use reflection to access private attributes
        try {
            Field field = person.getClass().getDeclaredField(expectedValue.toLowerCase());
            field.setAccessible(true);
            Object actualValue = field.get(person);

            assertThat(actualValue.toString(), equalTo(expectedValue));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            fail("Failed to access field: " + expectedValue);
        }
    }
}