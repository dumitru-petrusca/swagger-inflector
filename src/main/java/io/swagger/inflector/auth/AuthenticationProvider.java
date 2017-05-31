package io.swagger.inflector.auth;

import io.swagger.inflector.models.RequestContext;
import v2.io.swagger.models.Operation;

public interface AuthenticationProvider {
    Boolean satisfies(RequestContext context, Operation operation);
}
