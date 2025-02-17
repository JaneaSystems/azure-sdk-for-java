// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.education.fluent.models.Amount;
import com.azure.resourcemanager.education.fluent.models.GrantDetailsInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of GrantDetails.
 */
public interface GrantDetails {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the offerCap property: Offer Cap.
     * 
     * @return the offerCap value.
     */
    Amount offerCap();

    /**
     * Gets the effectiveDate property: Grant Effective Date.
     * 
     * @return the effectiveDate value.
     */
    OffsetDateTime effectiveDate();

    /**
     * Gets the offerType property: Grant Offer Type.
     * 
     * @return the offerType value.
     */
    GrantType offerType();

    /**
     * Gets the expirationDate property: Expiration Date.
     * 
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the status property: Grant status.
     * 
     * @return the status value.
     */
    GrantStatus status();

    /**
     * Gets the allocatedBudget property: allocated budget.
     * 
     * @return the allocatedBudget value.
     */
    Amount allocatedBudget();

    /**
     * Gets the inner com.azure.resourcemanager.education.fluent.models.GrantDetailsInner object.
     * 
     * @return the inner object.
     */
    GrantDetailsInner innerModel();
}
