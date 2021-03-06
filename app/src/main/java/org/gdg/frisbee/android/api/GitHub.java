/*
 * Copyright 2013-2015 The GDG Frisbee Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gdg.frisbee.android.api;

import org.gdg.frisbee.android.api.model.ContributorList;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface GitHub {

    @GET("/repos/{owner}/{repo}/contributors")
    void getContributors(@Path("owner") String user, 
                         @Path("repo") String repo,
                         Callback<ContributorList> callback);

//    @GET("/users/{username}")
//    void getUserDetail(@Path("username") String username, Callback<EventFullDetails> callback);
}
