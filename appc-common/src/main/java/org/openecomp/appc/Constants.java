/*-
 * ============LICENSE_START=======================================================
 * APPC
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * Copyright (C) 2017 Amdocs
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 * ECOMP is a trademark and service mark of AT&T Intellectual Property.
 */



package org.openecomp.appc;

/**
 * This class contains the definitions of all constant values used in the APPC provider, adapters, and other components.
 * These constants define properties, settings, and context variables. The context variables can be referenced from
 * within the directed graph(s) to access information placed their by the provider and adapters.
 * <p>
 * Context properties are set in the graph context by the various adapters and the provider, or by the graph itself.
 * These properties may also be accessed by the graph, adapters, or the provider. It is these properties that allow
 * communication of state through the directed graph. All context properties have a symbolic name that starts with
 * "CONTEXT_".
 * </p>
 *
 */

public final class Constants {

    /**
     * The name for the error code attribute to be set in the context
     */
    @SuppressWarnings("nls")
    public static final String ATTRIBUTE_ERROR_CODE = "error_code";

    /**
     * The name for the error message attribute to be set in the context
     */
    @SuppressWarnings("nls")
    public static final String ATTRIBUTE_ERROR_MESSAGE = "error-message";

    /**
     * The name for the success message attribute to be set in the context
     */
    @SuppressWarnings("nls")
    public static final String ATTRIBUTE_SUCCESS_MESSAGE = "success-message";

    public static final String DG_ATTRIBUTE_STATUS = "SvcLogic.status";
    public static final String DG_OUTPUT_STATUS_CODE = "output.status.code";
    public static final String DG_OUTPUT_STATUS_MESSAGE = "output.status.message";

    /**
     * The property that defines the name of the DG service logic to be loaded
     */
    public static final String PROPERTY_MODULE_NAME = "appc.service.logic.module.name";

    /**
     * The property that defines the topology restart DG version to be used
     */
    public static final String PROPERTY_TOPOLOGY_VERSION = "appc.topology.dg.version";

    /**
     * The method name of the DG that is used to perform topology restart operations
     */
    public static final String PROPERTY_TOPOLOGY_METHOD = "appc.topology.dg.method";

    /**
     * The property that supplies the application name
     */
    public static final String PROPERTY_APPLICATION_NAME = "appc.application.name";

    /**
     * The execution mode for the directed graph
     */
    public static final String SYNC_MODE = "sync";

    /**
     * The name of the property that contains the service request enumerated value in the graph's context
     */
    public static final String CONTEXT_SERVICE = "org.openecomp.appc.service";

    /**
     * The name of the property that contains the VM id value in the graph's context
     */
    public static final String CONTEXT_VMID = "org.openecomp.appc.vmid";

    /**
     * The name of the property that contains the VM id value in the graph's context
     */
    public static final String CONTEXT_IDENTITY_URL = "org.openecomp.appc.identity.url";

    /**
     * The name of the property that contains the service request id value in the graph's context
     */
    public static final String CONTEXT_REQID = "org.openecomp.appc.reqid";

    /**
     * The name of the property that indicates which method of the IaaS adapter to call
     */
    public static final String CONTEXT_ACTION = "org.openecomp.appc.action";

    /**
     * The enumerated value for restart of a VM. This is a constant for one possible value of CONTEXT_SERVICE.
     */
    public static final String SERVICE_RESTART = "RESTART";

    /**
     * The enumerated value for rebuild of a VM. This is a constant for one possible value of CONTEXT_SERVICE.
     */
    public static final String SERVICE_REBUILD = "REBUILD";

    /**
     * The name of the adapter. We get the name from a property file so that it can be changed easily if needed.
     */
    public static final String PROPERTY_ADAPTER_NAME = "org.openecomp.appc.provider.adaptor.name";

    /**
     * The minimum number of contexts to cache in each provider/tenant pool
     */
    public static final String PROPERTY_MIN_POOL_SIZE = "org.openecomp.appc.provider.min.pool";

    /**
     * The maximum number of contexts to cache in each provider/tenant pool
     */
    public static final String PROPERTY_MAX_POOL_SIZE = "org.openecomp.appc.provider.max.pool";

    /**
     * The amount of time, in seconds, that the application waits for a change of state of a server to a known valid
     * state before giving up and failing the request.
     */
    public static final String PROPERTY_SERVER_STATE_CHANGE_TIMEOUT = "org.openecomp.appc.server.state.change.timeout";

    /**
     * The amount of time, in seconds, between subsequent polls to the openstack provider to update the state of a
     * resource
     */
    public static final String PROPERTY_OPENSTACK_POLL_INTERVAL = "org.openecomp.appc.openstack.poll.interval";

    /**
     * The amount of time, in seconds, to wait between retry attempts when a connection to a provider fails.
     */
    public static final String PROPERTY_RETRY_DELAY = "org.openecomp.appc.provider.retry.delay";

    /**
     * The maximum number of times a connection retry will be attempted before the application fails the request
     */
    public static final String PROPERTY_RETRY_LIMIT = "org.openecomp.appc.provider.retry.limit";
    /**
     * The amount of time, in seconds, that the application waits for a change of state of a stacj to a known valid
     * state before giving up and failing the request.
     */
    public static final String PROPERTY_STACK_STATE_CHANGE_TIMEOUT ="org.openecomp.appc.stack.state.change.timeout" ;

    @SuppressWarnings("nls")
    public static final String STATUS_GETTER = "status-getter";

	@SuppressWarnings("nls")
    public static final String VM_FUSION_STATUS_GETTER = "fusion-vm-status-getter";

	/**
     * The name for the status vm attribute to be set in the context when executing a vmstatuscheck.
     */

    @SuppressWarnings("nls")
    public static final String STATUS_OF_VM = "status-vm";

    /**
     * Yang revision value to be used while generating YANG module
     */
    public static final String YANG_REVISION = "2017-03-03";
    /**
     * Yang revision format to be used while formatting YANG revision date
     */
    public static final String YANG_REVISION_FORMAT = "YYYY-MM-DD";

    /**
     * Base container for  yang that is generated to store in MD-SAL datastore
     */
    public static final String YANG_BASE_CONTAINER = "vnf-config-repo";

    /**
     *VNF config list for yang that is generated to store in MD-SAL datastore
     */
    public static final String YANG_VNF_CONFIG_LIST = "vnf-config-list";

    /**
     *Base container of VNF configuration data for yang that is generated to store in MD-SAL datastore
     */
    public static final String YANG_VNF_CONFIG = "vnf-config";

    /**
     * Private default constructor prevents instantiation
     */

    private Constants() {

    }
}
