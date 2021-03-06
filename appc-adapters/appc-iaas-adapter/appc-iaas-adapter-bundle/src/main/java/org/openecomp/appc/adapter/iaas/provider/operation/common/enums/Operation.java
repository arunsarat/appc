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

package org.openecomp.appc.adapter.iaas.provider.operation.common.enums;

/**
 * @since September 26, 2016
 */
public enum Operation {
    EVACUATE_SERVICE {
        public String toString(){
            return "evacuateServer";
        }
    },
    MIGRATE_SERVICE {
        public String toString(){
            return "migrateServer";
        }
    },
    REBUILD_SERVICE {
        public String toString(){
            return "rebuildServer";
        }
    },
    RESTART_SERVICE {
        public String toString(){
            return "restartServer";
        }
    },
    VMSTATUSCHECK_SERVICE {
        public String toString(){
            return "vmStatuschecker";
        }
    },
    SNAPSHOT_SERVICE {
        public String toString(){
            return "createSnapshot";
        }
    },
    TERMINATE_STACK {
        public String toString(){
            return "terminateStack";
        }
    },
    SNAPSHOT_STACK {
        public String toString(){
            return "snapshotStack";
        }
    },
    START_SERVICE {
        public String toString(){
            return "startServer";
        }
    },
    STOP_SERVICE {
        public String toString(){
            return "stopServer";
        }
    },
    TERMINATE_SERVICE {
        public String toString(){
            return "terminateServer";
        }
    },
    LOOKUP_SERVICE {
        public String toString(){
            return "lookupServer";
        }
    },
    RESTORE_STACK{
        public String toString(){
            return "restoreStack";
        }
    }
}
