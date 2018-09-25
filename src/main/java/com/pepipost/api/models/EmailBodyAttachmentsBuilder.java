/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class EmailBodyAttachmentsBuilder {
    //the instance to build
    private EmailBodyAttachments emailBodyAttachments;

    /**
     * Default constructor to initialize the instance
     */
    public EmailBodyAttachmentsBuilder() {
        emailBodyAttachments = new EmailBodyAttachments();
    }

    public EmailBodyAttachmentsBuilder fileContent(String fileContent) {
        emailBodyAttachments.setFileContent(fileContent);
        return this;
    }

    public EmailBodyAttachmentsBuilder fileName(String fileName) {
        emailBodyAttachments.setFileName(fileName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmailBodyAttachments build() {
        return emailBodyAttachments;
    }
}