package ru.netology.services.Java5.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationRelaxServiceTest {
  @ParameterizedTest
          //@CsvFileSource(files="srs/test/resources/Relax.csv" )
            @CsvSource({
            "3,10000,3000,20000",
          "2,100000,60000,150000"})
    public void testCalculationRelaxService(int expected, int income, int exspenses, int threshold) {

        CalculationRelaxService service = new CalculationRelaxService();

        int actual = service.RelaxService(income, exspenses, threshold);

        Assertions.assertEquals(expected,actual);
    }
}
