// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of backup, viz. Full, Differential, Log or CopyOnlyFull.
 */
public final class BackupType extends ExpandableStringEnum<BackupType> {
    /**
     * Static value Invalid for BackupType.
     */
    public static final BackupType INVALID = fromString("Invalid");

    /**
     * Static value Full for BackupType.
     */
    public static final BackupType FULL = fromString("Full");

    /**
     * Static value Differential for BackupType.
     */
    public static final BackupType DIFFERENTIAL = fromString("Differential");

    /**
     * Static value Log for BackupType.
     */
    public static final BackupType LOG = fromString("Log");

    /**
     * Static value CopyOnlyFull for BackupType.
     */
    public static final BackupType COPY_ONLY_FULL = fromString("CopyOnlyFull");

    /**
     * Static value Incremental for BackupType.
     */
    public static final BackupType INCREMENTAL = fromString("Incremental");

    /**
     * Static value SnapshotFull for BackupType.
     */
    public static final BackupType SNAPSHOT_FULL = fromString("SnapshotFull");

    /**
     * Static value SnapshotCopyOnlyFull for BackupType.
     */
    public static final BackupType SNAPSHOT_COPY_ONLY_FULL = fromString("SnapshotCopyOnlyFull");

    /**
     * Creates a new instance of BackupType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupType() {
    }

    /**
     * Creates or finds a BackupType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupType.
     */
    public static BackupType fromString(String name) {
        return fromString(name, BackupType.class);
    }

    /**
     * Gets known BackupType values.
     * 
     * @return known BackupType values.
     */
    public static Collection<BackupType> values() {
        return values(BackupType.class);
    }
}
