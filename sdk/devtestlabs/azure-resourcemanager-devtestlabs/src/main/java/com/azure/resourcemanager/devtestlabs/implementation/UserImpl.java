// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.UserInner;
import com.azure.resourcemanager.devtestlabs.models.User;
import com.azure.resourcemanager.devtestlabs.models.UserFragment;
import com.azure.resourcemanager.devtestlabs.models.UserIdentity;
import com.azure.resourcemanager.devtestlabs.models.UserSecretStore;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class UserImpl implements User, User.Definition, User.Update {
    private UserInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public UserIdentity identity() {
        return this.innerModel().identity();
    }

    public UserSecretStore secretStore() {
        return this.innerModel().secretStore();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public UserInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    private UserFragment updateUser;

    public UserImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public User create() {
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public User create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), context);
        return this;
    }

    UserImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new UserInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public UserImpl update() {
        this.updateUser = new UserFragment();
        return this;
    }

    public User apply() {
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .updateWithResponse(resourceGroupName, labName, name, updateUser, Context.NONE)
            .getValue();
        return this;
    }

    public User apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .updateWithResponse(resourceGroupName, labName, name, updateUser, context)
            .getValue();
        return this;
    }

    UserImpl(UserInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "users");
    }

    public User refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public User refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getUsers()
            .getWithResponse(resourceGroupName, labName, name, localExpand, context)
            .getValue();
        return this;
    }

    public UserImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public UserImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public UserImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateUser.withTags(tags);
            return this;
        }
    }

    public UserImpl withIdentity(UserIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public UserImpl withSecretStore(UserSecretStore secretStore) {
        this.innerModel().withSecretStore(secretStore);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
