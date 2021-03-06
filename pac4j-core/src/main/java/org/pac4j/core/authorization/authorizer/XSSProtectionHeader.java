package org.pac4j.core.authorization.authorizer;

import org.pac4j.core.context.WebContext;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;

import java.util.List;

/**
 * XSS protection header.
 *
 * @author Jerome Leleu
 * @since 1.8.1
 */
public class XSSProtectionHeader implements Authorizer<CommonProfile> {

    @Override
    public boolean isAuthorized(final WebContext context, final List<CommonProfile> profiles) throws HttpAction {
        context.setResponseHeader("X-XSS-Protection", "1; mode=block");
        return true;
    }
}
