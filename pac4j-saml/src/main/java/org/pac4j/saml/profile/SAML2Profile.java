package org.pac4j.saml.profile;

import org.joda.time.DateTime;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.saml.client.SAML2Client;

/**
 * <p>This class is the user profile for sites using SAML2 protocol.</p>
 * <p>It is returned by the {@link SAML2Client}.</p>
 * 
 * @author Michael Remond
 * @author Misagh Moayyed
 * @author Ruochao Zheng
 * @version 1.5.0
 */
public class SAML2Profile extends CommonProfile {

    private static final long serialVersionUID = -7811733390277407623L;
    
    public DateTime getNotBefore() {
        return (DateTime) getAttribute(SAML2Client.SAML_CONDITION_NOT_BEFORE_ATTRIBUTE);
    }
    
    public DateTime getNotOnOrAfter() {
        return (DateTime) getAttribute(SAML2Client.SAML_CONDITION_NOT_ON_OR_AFTER_ATTRIBUTE);
    }

    public String getSessionIndex() {
        return (String) getAttribute(SAML2Client.SESSION_INDEX);
    }
}
