// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elastic.fluent.models.ElasticMonitorResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of ElasticMonitorResource.
 */
public interface ElasticMonitorResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: SKU of the monitor resource.
     * 
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * Gets the properties property: Properties of the monitor resource.
     * 
     * @return the properties value.
     */
    MonitorProperties properties();

    /**
     * Gets the identity property: Identity properties of the monitor resource.
     * 
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.elastic.fluent.models.ElasticMonitorResourceInner object.
     * 
     * @return the inner object.
     */
    ElasticMonitorResourceInner innerModel();

    /**
     * The entirety of the ElasticMonitorResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The ElasticMonitorResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ElasticMonitorResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the ElasticMonitorResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSku,
            DefinitionStages.WithProperties, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ElasticMonitorResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ElasticMonitorResource create(Context context);
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the monitor resource..
             * 
             * @param sku SKU of the monitor resource.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceSku sku);
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the monitor resource..
             * 
             * @param properties Properties of the monitor resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(MonitorProperties properties);
        }

        /**
         * The stage of the ElasticMonitorResource definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity properties of the monitor resource..
             * 
             * @param identity Identity properties of the monitor resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
    }

    /**
     * Begins update for the ElasticMonitorResource resource.
     * 
     * @return the stage of resource update.
     */
    ElasticMonitorResource.Update update();

    /**
     * The template for ElasticMonitorResource update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ElasticMonitorResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ElasticMonitorResource apply(Context context);
    }

    /**
     * The ElasticMonitorResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ElasticMonitorResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: elastic monitor resource tags..
             * 
             * @param tags elastic monitor resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ElasticMonitorResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ElasticMonitorResource refresh(Context context);
}
