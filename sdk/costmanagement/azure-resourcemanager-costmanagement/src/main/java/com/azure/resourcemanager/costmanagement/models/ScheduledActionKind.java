// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Kind of the scheduled action. */
public final class ScheduledActionKind extends ExpandableStringEnum<ScheduledActionKind> {
    /** Static value Email for ScheduledActionKind. */
    public static final ScheduledActionKind EMAIL = fromString("Email");

    /** Static value InsightAlert for ScheduledActionKind. */
    public static final ScheduledActionKind INSIGHT_ALERT = fromString("InsightAlert");

    /**
     * Creates a new instance of ScheduledActionKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScheduledActionKind() {
    }

    /**
     * Creates or finds a ScheduledActionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduledActionKind.
     */
    @JsonCreator
    public static ScheduledActionKind fromString(String name) {
        return fromString(name, ScheduledActionKind.class);
    }

    /**
     * Gets known ScheduledActionKind values.
     *
     * @return known ScheduledActionKind values.
     */
    public static Collection<ScheduledActionKind> values() {
        return values(ScheduledActionKind.class);
    }
}