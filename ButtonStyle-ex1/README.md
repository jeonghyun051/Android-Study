![image](https://user-images.githubusercontent.com/74044292/107911251-7fd3c400-6f9f-11eb-9ea0-307e7011ad8c.png)
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:state_pressed="true">
        <shape>
            <solid android:color="@color/design_default_color_primary"/>
            <stroke android:color="@android:color/darker_gray"
                android:width="1dp"/>
            <corners android:radius="50dp"/>
        </shape>
    </item>

    <item>
        <shape>
            <solid android:color="@android:color/white"/>
            <stroke android:color="@android:color/darker_gray"
                android:width="1dp"/>
            <corners android:radius="50dp"/>
        </shape>
    </item>

</selector>

```
