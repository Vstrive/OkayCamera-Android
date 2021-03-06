/*
 * Copyright (c) 2017, Jianguo Yang.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.example.databindingdemo.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Mi on 2017/9/16.
 */

public class DetailedInformation {
    public final ObservableField<String> userName = new ObservableField<>();
    public final ObservableInt userAge = new ObservableInt();
}
