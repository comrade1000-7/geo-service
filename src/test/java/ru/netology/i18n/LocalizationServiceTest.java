package ru.netology.i18n;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.netology.entity.Country;

public class LocalizationServiceTest {
    LocalizationServiceImpl sut;

    @BeforeEach
    public void setup() {
        sut = new LocalizationServiceImpl();
    }

    @ParameterizedTest
    @EnumSource(value = Country.class, names = {"GERMANY", "USA", "BRAZIL"})
    public void shouldReturnWelcome (Country country) {
        String expected = "Welcome";
        String actual = sut.locale(country);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Country.class, names = {"GERMANY", "USA", "BRAZIL"},
    mode = EnumSource.Mode.EXCLUDE)
    public void shouldReturnWelcomeInRussia (Country country) {
        String expected = "Добро пожаловать";
        String actual = sut.locale(country);
        Assertions.assertEquals(expected, actual);
    }
}
