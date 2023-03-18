// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** min alert severity. */
public final class Severity extends ExpandableStringEnum<Severity> {
    /** Static value Low for Severity. */
    public static final Severity LOW = fromString("Low");

    /** Static value Medium for Severity. */
    public static final Severity MEDIUM = fromString("Medium");

    /** Static value High for Severity. */
    public static final Severity HIGH = fromString("High");

    /**
     * Creates a new instance of Severity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Severity() {}

    /**
     * Creates or finds a Severity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Severity.
     */
    @JsonCreator
    public static Severity fromString(String name) {
        return fromString(name, Severity.class);
    }

    /**
     * Gets known Severity values.
     *
     * @return known Severity values.
     */
    public static Collection<Severity> values() {
        return values(Severity.class);
    }
}