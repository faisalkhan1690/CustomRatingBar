Custom Rating Bar
===================================

>Cuatom Rating bar for avoid blooding problem in native Rating bar


How to use
--------------
Set
```xml
android:indeterminateDrawable="@drawable/unselected_star"
```
   unselected_star is the unselected drawable
   
Set 
```xml 
android:progressDrawable="@drawable/rating_stars"
```
   rating_stars is the selector drawable
   
Set in parent of your layout 
```xml 
xmlns:rating_bar_custom="http://schemas.android.com/apk/res-auto"
```
   
Set number of stars in 
```xml 
rating_bar_custom:customNumStars 
``` 
instead of  
```xml 
android:numStars 
```

Example 
--------------
```xml
 <com.example.faisalkhan.customratingbarlib.RatingBarCustom
      android:id="@+id/rating_bar_custom"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:indeterminateDrawable="@drawable/unselected_star"
      android:progressDrawable="@drawable/rating_stars"
      rating_bar_custom:customNumStars="5" />
```
 
 Pre-requisites
--------------

- Android SDK v23
- Android Build Tools v23.0.2

License
--------------
Copyright 2015 Faisal Khan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


Screenshots
--------------
![device-2016-06-18-175441](https://cloud.githubusercontent.com/assets/7554816/16170896/76caac5c-357f-11e6-8ded-d05cf3e39ef7.png)

