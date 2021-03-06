package com.ecwid.mailchimp.method.v1_3.campaign;

import com.ecwid.mailchimp.MailChimpAPIVersion;
import com.ecwid.mailchimp.MailChimpMethod;


/**
 * See:
 * <a href="http://apidocs.mailchimp.com/api/1.3/campaigndelete.func.php">
 *      http://apidocs.mailchimp.com/api/1.3/campaigndelete.func.php
 * </a>
 *
 * @author Massimo Lusetti <mlusetti@gmail.com>
 *
 */
@MailChimpMethod.Method(name = "campaignDelete", version = MailChimpAPIVersion.v1_3)
public class CampaignDeleteMethod extends CampaingRelatedMethod<Boolean>
{

    /**
     * Get the class object representing method result type.
     */
    @Override
    public Class<Boolean> getResultType()
    {
        return Boolean.class;
    }
}
