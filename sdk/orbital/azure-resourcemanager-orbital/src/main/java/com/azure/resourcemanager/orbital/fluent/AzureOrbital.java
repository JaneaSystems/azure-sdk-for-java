// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AzureOrbital class.
 */
public interface AzureOrbital {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the SpacecraftsClient object to access its operations.
     * 
     * @return the SpacecraftsClient object.
     */
    SpacecraftsClient getSpacecrafts();

    /**
     * Gets the ContactsClient object to access its operations.
     * 
     * @return the ContactsClient object.
     */
    ContactsClient getContacts();

    /**
     * Gets the ContactProfilesClient object to access its operations.
     * 
     * @return the ContactProfilesClient object.
     */
    ContactProfilesClient getContactProfiles();

    /**
     * Gets the AvailableGroundStationsClient object to access its operations.
     * 
     * @return the AvailableGroundStationsClient object.
     */
    AvailableGroundStationsClient getAvailableGroundStations();

    /**
     * Gets the OperationsResultsClient object to access its operations.
     * 
     * @return the OperationsResultsClient object.
     */
    OperationsResultsClient getOperationsResults();
}
