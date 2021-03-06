/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.mindorks.framework.mvvm.data.remote;

import com.mindorks.framework.mvvm.BuildConfig;

public final class ApiEndPoint {

    public static final String ENDPOINT_IG_MARKETS = BuildConfig.BASE_IG_URL + "/deal/samples/markets/ANDROID_PHONE";

    private ApiEndPoint() {
        // This class is not publicly instantiable
    }
}
