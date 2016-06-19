Custom Rating Bar
===================================

>Cuatom Rating bar for avoid blooding problem in native Rating bar


How to use
--------------
1. set
```xml
android:indeterminateDrawable="@drawable/unselected_star"
```
   unselected_star is the unselected drawable
   
2. set 
```xml 
android:progressDrawable="@drawable/rating_stars"
```
   rating_stars is the selector drawable
   
4. set in parent of your layout 
```xml 
xmlns:rating_bar_custom="http://schemas.android.com/apk/res-auto"
```
   
5. set number of stars in 
```xml 
rating_bar_custom:customNumStars 
``` instead of  
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
 
Screenshots
--------------
![device-2016-06-18-175441](https://cloud.githubusercontent.com/assets/7554816/16170896/76caac5c-357f-11e6-8ded-d05cf3e39ef7.png)

