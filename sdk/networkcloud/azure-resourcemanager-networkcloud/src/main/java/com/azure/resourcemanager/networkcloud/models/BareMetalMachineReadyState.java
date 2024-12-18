// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The indicator of whether the bare metal machine is ready to receive workloads.
 */
public final class BareMetalMachineReadyState extends ExpandableStringEnum<BareMetalMachineReadyState> {
    /**
     * Static value True for BareMetalMachineReadyState.
     */
    public static final BareMetalMachineReadyState TRUE = fromString("True");

    /**
     * Static value False for BareMetalMachineReadyState.
     */
    public static final BareMetalMachineReadyState FALSE = fromString("False");

    /**
     * Creates a new instance of BareMetalMachineReadyState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BareMetalMachineReadyState() {
    }

    /**
     * Creates or finds a BareMetalMachineReadyState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BareMetalMachineReadyState.
     */
    public static BareMetalMachineReadyState fromString(String name) {
        return fromString(name, BareMetalMachineReadyState.class);
    }

    /**
     * Gets known BareMetalMachineReadyState values.
     * 
     * @return known BareMetalMachineReadyState values.
     */
    public static Collection<BareMetalMachineReadyState> values() {
        return values(BareMetalMachineReadyState.class);
    }
}
