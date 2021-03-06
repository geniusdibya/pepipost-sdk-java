/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class PersonalizationsBuilder {
    //the instance to build
    private Personalizations personalizations;

    /**
     * Default constructor to initialize the instance
     */
    public PersonalizationsBuilder() {
        personalizations = new Personalizations();
    }

    /**
     * Emails to be passed in Apicall
     */
    public PersonalizationsBuilder recipient(String recipient) {
        personalizations.setRecipient(recipient);
        return this;
    }

    public PersonalizationsBuilder xApiheaderCc(String xApiheaderCc) {
        personalizations.setXApiheaderCc(xApiheaderCc);
        return this;
    }

    public PersonalizationsBuilder xApiheader(String xApiheader) {
        personalizations.setXApiheader(xApiheader);
        return this;
    }

    public PersonalizationsBuilder attributes(Object attributes) {
        personalizations.setAttributes(attributes);
        return this;
    }

    public PersonalizationsBuilder attachments(List<Attachments> attachments) {
        personalizations.setAttachments(attachments);
        return this;
    }

    public PersonalizationsBuilder recipientCc(List<String> recipientCc) {
        personalizations.setRecipientCc(recipientCc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Personalizations build() {
        return personalizations;
    }
}