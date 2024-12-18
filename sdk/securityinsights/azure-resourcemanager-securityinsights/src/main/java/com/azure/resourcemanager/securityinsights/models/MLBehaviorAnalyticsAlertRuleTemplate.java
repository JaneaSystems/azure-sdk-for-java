// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleTemplateInner;
import com.azure.resourcemanager.securityinsights.fluent.models.MLBehaviorAnalyticsAlertRuleTemplateProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represents MLBehaviorAnalytics alert rule template.
 */
@Fluent
public final class MLBehaviorAnalyticsAlertRuleTemplate extends AlertRuleTemplateInner {
    /*
     * The kind of the alert rule
     */
    private AlertRuleKind kind = AlertRuleKind.MLBEHAVIOR_ANALYTICS;

    /*
     * MLBehaviorAnalytics alert rule template properties.
     */
    private MLBehaviorAnalyticsAlertRuleTemplateProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of MLBehaviorAnalyticsAlertRuleTemplate class.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate() {
    }

    /**
     * Get the kind property: The kind of the alert rule.
     * 
     * @return the kind value.
     */
    @Override
    public AlertRuleKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: MLBehaviorAnalytics alert rule template properties.
     * 
     * @return the innerProperties value.
     */
    private MLBehaviorAnalyticsAlertRuleTemplateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     * 
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     * 
     * @param severity the severity value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withSeverity(AlertSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule.
     * 
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.innerProperties() == null ? null : this.innerProperties().tactics();
    }

    /**
     * Set the tactics property: The tactics of the alert rule.
     * 
     * @param tactics the tactics value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withTactics(List<AttackTactic> tactics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withTactics(tactics);
        return this;
    }

    /**
     * Get the techniques property: The techniques of the alert rule.
     * 
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.innerProperties() == null ? null : this.innerProperties().techniques();
    }

    /**
     * Set the techniques property: The techniques of the alert rule.
     * 
     * @param techniques the techniques value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withTechniques(List<String> techniques) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withTechniques(techniques);
        return this;
    }

    /**
     * Get the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     * 
     * @return the alertRulesCreatedByTemplateCount value.
     */
    public Integer alertRulesCreatedByTemplateCount() {
        return this.innerProperties() == null ? null : this.innerProperties().alertRulesCreatedByTemplateCount();
    }

    /**
     * Set the alertRulesCreatedByTemplateCount property: the number of alert rules that were created by this template.
     * 
     * @param alertRulesCreatedByTemplateCount the alertRulesCreatedByTemplateCount value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate
        withAlertRulesCreatedByTemplateCount(Integer alertRulesCreatedByTemplateCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withAlertRulesCreatedByTemplateCount(alertRulesCreatedByTemplateCount);
        return this;
    }

    /**
     * Get the lastUpdatedDateUtc property: The last time that this alert rule template has been updated.
     * 
     * @return the lastUpdatedDateUtc value.
     */
    public OffsetDateTime lastUpdatedDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedDateUtc();
    }

    /**
     * Get the createdDateUtc property: The time that this alert rule template has been added.
     * 
     * @return the createdDateUtc value.
     */
    public OffsetDateTime createdDateUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateUtc();
    }

    /**
     * Get the description property: The description of the alert rule template.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the alert rule template.
     * 
     * @param description the description value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the displayName property: The display name for alert rule template.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for alert rule template.
     * 
     * @param displayName the displayName value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the requiredDataConnectors property: The required data sources for this template.
     * 
     * @return the requiredDataConnectors value.
     */
    public List<AlertRuleTemplateDataSource> requiredDataConnectors() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredDataConnectors();
    }

    /**
     * Set the requiredDataConnectors property: The required data sources for this template.
     * 
     * @param requiredDataConnectors the requiredDataConnectors value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate
        withRequiredDataConnectors(List<AlertRuleTemplateDataSource> requiredDataConnectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withRequiredDataConnectors(requiredDataConnectors);
        return this;
    }

    /**
     * Get the status property: The alert rule template status.
     * 
     * @return the status value.
     */
    public TemplateStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The alert rule template status.
     * 
     * @param status the status value to set.
     * @return the MLBehaviorAnalyticsAlertRuleTemplate object itself.
     */
    public MLBehaviorAnalyticsAlertRuleTemplate withStatus(TemplateStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MLBehaviorAnalyticsAlertRuleTemplateProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MLBehaviorAnalyticsAlertRuleTemplate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MLBehaviorAnalyticsAlertRuleTemplate if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MLBehaviorAnalyticsAlertRuleTemplate.
     */
    public static MLBehaviorAnalyticsAlertRuleTemplate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MLBehaviorAnalyticsAlertRuleTemplate deserializedMLBehaviorAnalyticsAlertRuleTemplate
                = new MLBehaviorAnalyticsAlertRuleTemplate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.systemData = SystemData.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.kind
                        = AlertRuleKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedMLBehaviorAnalyticsAlertRuleTemplate.innerProperties
                        = MLBehaviorAnalyticsAlertRuleTemplateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMLBehaviorAnalyticsAlertRuleTemplate;
        });
    }
}
