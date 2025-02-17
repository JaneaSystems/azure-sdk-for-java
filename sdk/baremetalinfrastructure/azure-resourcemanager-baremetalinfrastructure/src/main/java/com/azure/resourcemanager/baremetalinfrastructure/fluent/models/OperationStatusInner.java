// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.baremetalinfrastructure.models.AsyncOperationStatus;
import com.azure.resourcemanager.baremetalinfrastructure.models.OperationStatusError;
import java.io.IOException;

/**
 * The OperationStatus object returns the state of an asynchronous operation.
 */
@Fluent
public final class OperationStatusInner implements JsonSerializable<OperationStatusInner> {
    /*
     * Unique Operation Status Identifier.
     */
    private String name;

    /*
     * Status of the operation.
     */
    private AsyncOperationStatus status;

    /*
     * Start Time when the operation was initially executed.
     */
    private String startTime;

    /*
     * An error from the Azure Bare Metal Infrastructure service.
     */
    private OperationStatusError error;

    /**
     * Creates an instance of OperationStatusInner class.
     */
    public OperationStatusInner() {
    }

    /**
     * Get the name property: Unique Operation Status Identifier.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique Operation Status Identifier.
     * 
     * @param name the name value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: Status of the operation.
     * 
     * @return the status value.
     */
    public AsyncOperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the operation.
     * 
     * @param status the status value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStatus(AsyncOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startTime property: Start Time when the operation was initially executed.
     * 
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start Time when the operation was initially executed.
     * 
     * @param startTime the startTime value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the error property: An error from the Azure Bare Metal Infrastructure service.
     * 
     * @return the error value.
     */
    public OperationStatusError error() {
        return this.error;
    }

    /**
     * Set the error property: An error from the Azure Bare Metal Infrastructure service.
     * 
     * @param error the error value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withError(OperationStatusError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("startTime", this.startTime);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationStatusInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationStatusInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationStatusInner.
     */
    public static OperationStatusInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationStatusInner deserializedOperationStatusInner = new OperationStatusInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationStatusInner.name = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedOperationStatusInner.status = AsyncOperationStatus.fromString(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedOperationStatusInner.startTime = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedOperationStatusInner.error = OperationStatusError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationStatusInner;
        });
    }
}
