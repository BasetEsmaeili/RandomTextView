# RandomTextView
[![](https://jitpack.io/v/BasetEsmaeili/RandomTextView.svg)](https://jitpack.io/#BasetEsmaeili/RandomTextView)

a Android library for pickup random text from list and show in textview

![](images/screen.gif)

**all TextView attributes work because the library extends TextView**

# How to Download
**gradle**

**step 1:**
add below code in your root build.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**step 2:**
add below code in build.gradle dependency of app module
```gradle
dependencies {
	        implementation 'com.github.BasetEsmaeili:RandomTextView:v1.0'
	}

```
***
# How use this library

**step 1:**

**XML**
```xml
    <com.baset.randomtv.RandomTextView
        android:id="@+id/randomtv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textColor="#4dc164"
        android:textSize="19dp"/>
```
**step 2:**

**initialize**

**kotlin**
```kotlin
var myRandonView:RandomTextView=findViewById(R.id.randomtv)
```
**java**
```java
RandomTextView myRandomView=findViewById(R.id.randomtv);
```
**step 3:**

**Cuatomization**

**you can use two types of lists String[] or ArrayList<String>**

1- set texts list
```java
myRandomView.setTextList(textList);
```


# Licence
Copyright 2018 Baset Esmaeili

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
```text
http://www.apache.org/licenses/LICENSE-2.0
```
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# Author

**Baset Esmaeili**

Email: baset.esmaili0@gmail.com

Telegram: https://telegram.me/ikurdish
