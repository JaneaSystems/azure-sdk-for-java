// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

/**
 * Samples for SqlVirtualMachines ListByResourceGroup.
 */
public final class SqlVirtualMachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2022-08-01-preview/examples/
     * ListByResourceGroupSqlVirtualMachine.json
     */
    /**
     * Sample code: Gets all SQL virtual machines in a resource group.
     * 
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void getsAllSQLVirtualMachinesInAResourceGroup(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager.sqlVirtualMachines().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
