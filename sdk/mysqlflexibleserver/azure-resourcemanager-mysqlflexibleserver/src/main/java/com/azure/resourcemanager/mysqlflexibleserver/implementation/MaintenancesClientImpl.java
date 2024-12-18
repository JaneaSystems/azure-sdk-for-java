// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.MaintenancesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenanceInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceListResult;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in MaintenancesClient.
 */
public final class MaintenancesClientImpl implements MaintenancesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MaintenancesService service;

    /**
     * The service client containing this operation class.
     */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of MaintenancesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MaintenancesClientImpl(MySqlManagementClientImpl client) {
        this.service
            = RestProxy.create(MaintenancesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientMaintenances to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    public interface MaintenancesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/maintenances/{maintenanceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MaintenanceInner>> read(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("maintenanceName") String maintenanceName, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/maintenances/{maintenanceName}")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> update(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("maintenanceName") String maintenanceName,
            @BodyParam("application/json") MaintenanceUpdate parameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/maintenances")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MaintenanceListResult>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MaintenanceListResult>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Read maintenance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MaintenanceInner>> readWithResponseAsync(String resourceGroupName, String serverName,
        String maintenanceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (maintenanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter maintenanceName is required and cannot be null."));
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.read(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                resourceGroupName, serverName, maintenanceName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Read maintenance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MaintenanceInner>> readWithResponseAsync(String resourceGroupName, String serverName,
        String maintenanceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (maintenanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter maintenanceName is required and cannot be null."));
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.read(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName,
            serverName, maintenanceName, accept, context);
    }

    /**
     * Read maintenance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MaintenanceInner> readAsync(String resourceGroupName, String serverName, String maintenanceName) {
        return readWithResponseAsync(resourceGroupName, serverName, maintenanceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Read maintenance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MaintenanceInner> readWithResponse(String resourceGroupName, String serverName,
        String maintenanceName, Context context) {
        return readWithResponseAsync(resourceGroupName, serverName, maintenanceName, context).block();
    }

    /**
     * Read maintenance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MaintenanceInner read(String resourceGroupName, String serverName, String maintenanceName) {
        return readWithResponse(resourceGroupName, serverName, maintenanceName, Context.NONE).getValue();
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName,
        String maintenanceName, MaintenanceUpdate parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (maintenanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter maintenanceName is required and cannot be null."));
        }
        if (parameters != null) {
            parameters.validate();
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.update(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                    resourceGroupName, serverName, maintenanceName, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName,
        String maintenanceName, MaintenanceUpdate parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (maintenanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter maintenanceName is required and cannot be null."));
        }
        if (parameters != null) {
            parameters.validate();
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName,
            serverName, maintenanceName, parameters, accept, context);
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<MaintenanceInner>, MaintenanceInner> beginUpdateAsync(String resourceGroupName,
        String serverName, String maintenanceName, MaintenanceUpdate parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = updateWithResponseAsync(resourceGroupName, serverName, maintenanceName, parameters);
        return this.client.<MaintenanceInner, MaintenanceInner>getLroResult(mono, this.client.getHttpPipeline(),
            MaintenanceInner.class, MaintenanceInner.class, this.client.getContext());
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<MaintenanceInner>, MaintenanceInner> beginUpdateAsync(String resourceGroupName,
        String serverName, String maintenanceName) {
        final MaintenanceUpdate parameters = null;
        Mono<Response<Flux<ByteBuffer>>> mono
            = updateWithResponseAsync(resourceGroupName, serverName, maintenanceName, parameters);
        return this.client.<MaintenanceInner, MaintenanceInner>getLroResult(mono, this.client.getHttpPipeline(),
            MaintenanceInner.class, MaintenanceInner.class, this.client.getContext());
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<MaintenanceInner>, MaintenanceInner> beginUpdateAsync(String resourceGroupName,
        String serverName, String maintenanceName, MaintenanceUpdate parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = updateWithResponseAsync(resourceGroupName, serverName, maintenanceName, parameters, context);
        return this.client.<MaintenanceInner, MaintenanceInner>getLroResult(mono, this.client.getHttpPipeline(),
            MaintenanceInner.class, MaintenanceInner.class, context);
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<MaintenanceInner>, MaintenanceInner> beginUpdate(String resourceGroupName,
        String serverName, String maintenanceName) {
        final MaintenanceUpdate parameters = null;
        return this.beginUpdateAsync(resourceGroupName, serverName, maintenanceName, parameters).getSyncPoller();
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<MaintenanceInner>, MaintenanceInner> beginUpdate(String resourceGroupName,
        String serverName, String maintenanceName, MaintenanceUpdate parameters, Context context) {
        return this.beginUpdateAsync(resourceGroupName, serverName, maintenanceName, parameters, context)
            .getSyncPoller();
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MaintenanceInner> updateAsync(String resourceGroupName, String serverName, String maintenanceName,
        MaintenanceUpdate parameters) {
        return beginUpdateAsync(resourceGroupName, serverName, maintenanceName, parameters).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MaintenanceInner> updateAsync(String resourceGroupName, String serverName, String maintenanceName) {
        final MaintenanceUpdate parameters = null;
        return beginUpdateAsync(resourceGroupName, serverName, maintenanceName, parameters).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MaintenanceInner> updateAsync(String resourceGroupName, String serverName, String maintenanceName,
        MaintenanceUpdate parameters, Context context) {
        return beginUpdateAsync(resourceGroupName, serverName, maintenanceName, parameters, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MaintenanceInner update(String resourceGroupName, String serverName, String maintenanceName) {
        final MaintenanceUpdate parameters = null;
        return updateAsync(resourceGroupName, serverName, maintenanceName, parameters).block();
    }

    /**
     * Update maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param maintenanceName The name of the maintenance.
     * @param parameters The required parameters for update maintenance on a server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a maintenance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MaintenanceInner update(String resourceGroupName, String serverName, String maintenanceName,
        MaintenanceUpdate parameters, Context context) {
        return updateAsync(resourceGroupName, serverName, maintenanceName, parameters, context).block();
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MaintenanceInner>> listSinglePageAsync(String resourceGroupName, String serverName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                resourceGroupName, serverName, accept, context))
            .<PagedResponse<MaintenanceInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MaintenanceInner>> listSinglePageAsync(String resourceGroupName, String serverName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-10-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, serverName,
                accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MaintenanceInner> listAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MaintenanceInner> listAsync(String resourceGroupName, String serverName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, serverName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MaintenanceInner> list(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listAsync(resourceGroupName, serverName));
    }

    /**
     * List maintenances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MaintenanceInner> list(String resourceGroupName, String serverName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, serverName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MaintenanceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<MaintenanceInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenances along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MaintenanceInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
