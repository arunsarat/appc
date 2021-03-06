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

package org.opendaylight.yang.gen.v1.org.openecomp.appc.provider.lcm.impl.rev160108;

import org.openecomp.appc.provider.AppcProviderLcm;

public class AppcProviderLcmModule extends org.opendaylight.yang.gen.v1.org.openecomp.appc.provider.lcm.impl.rev160108.AbstractAppcProviderLcmModule {
    public AppcProviderLcmModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AppcProviderLcmModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.org.openecomp.appc.provider.lcm.impl.rev160108.AppcProviderLcmModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        final AppcProviderLcm provider =
                        new AppcProviderLcm(getDataBrokerDependency(), getNotificationServiceDependency(), getRpcRegistryDependency());
        return new AutoCloseable() {

            @Override
            public void close() throws Exception {
                provider.close();
            }
        };
    }

}
