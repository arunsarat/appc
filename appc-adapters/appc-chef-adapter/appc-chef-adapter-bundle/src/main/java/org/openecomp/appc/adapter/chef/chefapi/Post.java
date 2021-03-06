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

package org.openecomp.appc.adapter.chef.chefapi;

import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;

public class Post extends ApiMethod{

	public Post(HttpRequestBase method) {
		super("POST");
		this.method = method;
	}
	
	public ApiMethod body(String body){
		this.reqBody = body;
		StringEntity params =new StringEntity (body,"UTF-8");
		params.setContentType("application/json");	 
		HttpPost post = (HttpPost) method;
		post.setEntity(params);
		return this;
	}

}
