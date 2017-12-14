package io.swagger.test;

import io.swagger.inflector.converters.DefaultConverter;
import io.swagger.inflector.converters.InputConverter;
import io.swagger.inflector.validators.DefaultValidator;
import io.swagger.inflector.validators.NumericValidator;
import io.swagger.inflector.validators.StringTypeValidator;

/**
 * @author dpetrusca
 */
public class TestUtil {
    public static InputConverter createDefaultInputConverter() {
        InputConverter converter = new InputConverter();
        converter.addConverter(new DefaultConverter());
        converter.addValidator(new DefaultValidator());
        converter.addValidator(new NumericValidator());
        converter.addValidator(new StringTypeValidator());
        return converter;
    }
}
