// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.fluent.models.HealthCheckStatusDetailsInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the network health check list operation.
 */
@Immutable
public final class HealthCheckStatusDetailsListResult implements JsonSerializable<HealthCheckStatusDetailsListResult> {
    /*
     * Current page of results.
     */
    private List<HealthCheckStatusDetailsInner> value;

    /*
     * URL to get the next set of results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of HealthCheckStatusDetailsListResult class.
     */
    public HealthCheckStatusDetailsListResult() {
    }

    /**
     * Get the value property: Current page of results.
     * 
     * @return the value value.
     */
    public List<HealthCheckStatusDetailsInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthCheckStatusDetailsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthCheckStatusDetailsListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HealthCheckStatusDetailsListResult.
     */
    public static HealthCheckStatusDetailsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthCheckStatusDetailsListResult deserializedHealthCheckStatusDetailsListResult
                = new HealthCheckStatusDetailsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<HealthCheckStatusDetailsInner> value
                        = reader.readArray(reader1 -> HealthCheckStatusDetailsInner.fromJson(reader1));
                    deserializedHealthCheckStatusDetailsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedHealthCheckStatusDetailsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthCheckStatusDetailsListResult;
        });
    }
}
