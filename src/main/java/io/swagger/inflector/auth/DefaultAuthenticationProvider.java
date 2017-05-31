package io.swagger.inflector.auth;

import io.swagger.inflector.models.RequestContext;
import v2.io.swagger.models.Operation;

public class DefaultAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Boolean satisfies(RequestContext context, Operation operation) {
        return true;
    }
}
