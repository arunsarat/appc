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



package org.openecomp.appc.pool;

import java.io.Closeable;

/**
 * This interface is used to supply an object that will be called by the pool manager whenever a new widget must be
 * allocated.
 * @param <T>
 *            The generic type that we are caching.
 */

public interface Allocator<T extends Closeable> {

    /**
     * Allocate an object of type <T> and return it to the pool
     *
     * @param pool
     *            The pool that the object is to be allocated to
     * @return An object of type T
     */
    T allocate(Pool<T> pool);
}
