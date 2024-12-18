// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.CreateDataLakeAnalyticsAccountProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The parameters to use for creating a Data Lake Analytics account.
 */
@Fluent
public final class CreateDataLakeAnalyticsAccountParameters
    implements JsonSerializable<CreateDataLakeAnalyticsAccountParameters> {
    /*
     * The resource location.
     */
    private String location;

    /*
     * The resource tags.
     */
    private Map<String, String> tags;

    /*
     * The Data Lake Analytics account properties to use for creating.
     */
    private CreateDataLakeAnalyticsAccountProperties innerProperties = new CreateDataLakeAnalyticsAccountProperties();

    /**
     * Creates an instance of CreateDataLakeAnalyticsAccountParameters class.
     */
    public CreateDataLakeAnalyticsAccountParameters() {
    }

    /**
     * Get the location property: The resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The resource location.
     * 
     * @param location the location value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     * 
     * @param tags the tags value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The Data Lake Analytics account properties to use for creating.
     * 
     * @return the innerProperties value.
     */
    private CreateDataLakeAnalyticsAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the defaultDataLakeStoreAccount property: The default Data Lake Store account associated with this account.
     * 
     * @return the defaultDataLakeStoreAccount value.
     */
    public String defaultDataLakeStoreAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDataLakeStoreAccount();
    }

    /**
     * Set the defaultDataLakeStoreAccount property: The default Data Lake Store account associated with this account.
     * 
     * @param defaultDataLakeStoreAccount the defaultDataLakeStoreAccount value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withDefaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withDefaultDataLakeStoreAccount(defaultDataLakeStoreAccount);
        return this;
    }

    /**
     * Get the dataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     * 
     * @return the dataLakeStoreAccounts value.
     */
    public List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLakeStoreAccounts();
    }

    /**
     * Set the dataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     * 
     * @param dataLakeStoreAccounts the dataLakeStoreAccounts value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withDataLakeStoreAccounts(List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withDataLakeStoreAccounts(dataLakeStoreAccounts);
        return this;
    }

    /**
     * Get the storageAccounts property: The list of Azure Blob Storage accounts associated with this account.
     * 
     * @return the storageAccounts value.
     */
    public List<AddStorageAccountWithAccountParameters> storageAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccounts();
    }

    /**
     * Set the storageAccounts property: The list of Azure Blob Storage accounts associated with this account.
     * 
     * @param storageAccounts the storageAccounts value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withStorageAccounts(List<AddStorageAccountWithAccountParameters> storageAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withStorageAccounts(storageAccounts);
        return this;
    }

    /**
     * Get the computePolicies property: The list of compute policies associated with this account.
     * 
     * @return the computePolicies value.
     */
    public List<CreateComputePolicyWithAccountParameters> computePolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().computePolicies();
    }

    /**
     * Set the computePolicies property: The list of compute policies associated with this account.
     * 
     * @param computePolicies the computePolicies value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withComputePolicies(List<CreateComputePolicyWithAccountParameters> computePolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withComputePolicies(computePolicies);
        return this;
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this account.
     * 
     * @return the firewallRules value.
     */
    public List<CreateFirewallRuleWithAccountParameters> firewallRules() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallRules();
    }

    /**
     * Set the firewallRules property: The list of firewall rules associated with this account.
     * 
     * @param firewallRules the firewallRules value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withFirewallRules(List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withFirewallRules(firewallRules);
        return this;
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this account.
     * 
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallState();
    }

    /**
     * Set the firewallState property: The current state of the IP address firewall for this account.
     * 
     * @param firewallState the firewallState value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withFirewallState(FirewallState firewallState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withFirewallState(firewallState);
        return this;
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     * 
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallAllowAzureIps();
    }

    /**
     * Set the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     * 
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withFirewallAllowAzureIps(firewallAllowAzureIps);
        return this;
    }

    /**
     * Get the newTier property: The commitment tier for the next month.
     * 
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.innerProperties() == null ? null : this.innerProperties().newTier();
    }

    /**
     * Set the newTier property: The commitment tier for the next month.
     * 
     * @param newTier the newTier value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withNewTier(TierType newTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withNewTier(newTier);
        return this;
    }

    /**
     * Get the maxJobCount property: The maximum supported jobs running under the account at the same time.
     * 
     * @return the maxJobCount value.
     */
    public Integer maxJobCount() {
        return this.innerProperties() == null ? null : this.innerProperties().maxJobCount();
    }

    /**
     * Set the maxJobCount property: The maximum supported jobs running under the account at the same time.
     * 
     * @param maxJobCount the maxJobCount value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMaxJobCount(Integer maxJobCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withMaxJobCount(maxJobCount);
        return this;
    }

    /**
     * Get the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     * 
     * @return the maxDegreeOfParallelism value.
     */
    public Integer maxDegreeOfParallelism() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDegreeOfParallelism();
    }

    /**
     * Set the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     * 
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withMaxDegreeOfParallelism(maxDegreeOfParallelism);
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     * 
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDegreeOfParallelismPerJob();
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     * 
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters
        withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum supported priority per job for this account.
     * 
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().minPriorityPerJob();
    }

    /**
     * Set the minPriorityPerJob property: The minimum supported priority per job for this account.
     * 
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withMinPriorityPerJob(minPriorityPerJob);
        return this;
    }

    /**
     * Get the queryStoreRetention property: The number of days that job metadata is retained.
     * 
     * @return the queryStoreRetention value.
     */
    public Integer queryStoreRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().queryStoreRetention();
    }

    /**
     * Set the queryStoreRetention property: The number of days that job metadata is retained.
     * 
     * @param queryStoreRetention the queryStoreRetention value to set.
     * @return the CreateDataLakeAnalyticsAccountParameters object itself.
     */
    public CreateDataLakeAnalyticsAccountParameters withQueryStoreRetention(Integer queryStoreRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateDataLakeAnalyticsAccountProperties();
        }
        this.innerProperties().withQueryStoreRetention(queryStoreRetention);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model CreateDataLakeAnalyticsAccountParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model CreateDataLakeAnalyticsAccountParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateDataLakeAnalyticsAccountParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateDataLakeAnalyticsAccountParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateDataLakeAnalyticsAccountParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateDataLakeAnalyticsAccountParameters.
     */
    public static CreateDataLakeAnalyticsAccountParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateDataLakeAnalyticsAccountParameters deserializedCreateDataLakeAnalyticsAccountParameters
                = new CreateDataLakeAnalyticsAccountParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedCreateDataLakeAnalyticsAccountParameters.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCreateDataLakeAnalyticsAccountParameters.innerProperties
                        = CreateDataLakeAnalyticsAccountProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCreateDataLakeAnalyticsAccountParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateDataLakeAnalyticsAccountParameters;
        });
    }
}
