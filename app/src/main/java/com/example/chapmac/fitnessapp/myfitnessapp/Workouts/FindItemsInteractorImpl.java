/*
 *
 *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.example.chapmac.fitnessapp.myfitnessapp.Workouts;

import android.os.Handler;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.MockData;
import com.example.chapmac.fitnessapp.myfitnessapp.Data.Workout;

import java.util.List;

public class FindItemsInteractorImpl implements FindItemsInteractor {

    private MockData mockData;

    @Override
    public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    private List<Workout> createArrayList() {
        mockData = new MockData();
        return mockData.getMockWorkout();
    }
}
