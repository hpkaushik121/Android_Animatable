# Android_Animatable

[![](https://jitpack.io/v/hpkaushik121/Android_Animatable.svg)](https://jitpack.io/#hpkaushik121/Android_Animatable)


## `AnimatableExplorer` example

See [`Examples/AnimatableExplorer`]folder for an example project demoing animations available out of the box and more. 

![Animatable Explorer](https://user-images.githubusercontent.com/378279/36341974-f697e5d8-13f6-11e8-8e2a-21d8c2a4b340.gif)

## Animations

Animations are heavily inspired by [Animated.css](https://daneden.github.io/animate.css/).

### Attention Seekers

![animatable-attention](https://cloud.githubusercontent.com/assets/378279/10590307/ef73b1ba-767d-11e5-8fb9-9779d3a53a50.gif)

* `bounce`
* `flash`
* `jello`
* `pulse`
* `rotate`
* `rubberBand`
* `shake`
* `swing`
* `tada`
* `wobble`

### Bouncing Entrances

![animatable-bouncein](https://cloud.githubusercontent.com/assets/378279/10590306/ef572bbc-767d-11e5-8440-8e61d401537a.gif)

* `bounceIn`
* `bounceInDown`
* `bounceInUp`
* `bounceInLeft`
* `bounceInRight`

### Bouncing Exits

![animatable-bounceout](https://cloud.githubusercontent.com/assets/378279/10590305/ef56e4cc-767d-11e5-9562-6cd3210faf34.gif)

* `bounceOut`
* `bounceOutDown`
* `bounceOutUp`
* `bounceOutLeft`
* `bounceOutRight`

### Fading Entrances

![animatable-fadein](https://cloud.githubusercontent.com/assets/378279/10590304/ef4f09b4-767d-11e5-9a43-06e97e8ee2c1.gif)

* `fadeIn`
* `fadeInDown`
* `fadeInDownBig`
* `fadeInUp`
* `fadeInUpBig`
* `fadeInLeft`
* `fadeInLeftBig`
* `fadeInRight`
* `fadeInRightBig`

### Fading Exits

![animatable-fadeout](https://cloud.githubusercontent.com/assets/378279/10590303/ef3e9598-767d-11e5-83bc-bd48d6017131.gif)

* `fadeOut`
* `fadeOutDown`
* `fadeOutDownBig`
* `fadeOutUp`
* `fadeOutUpBig`
* `fadeOutLeft`
* `fadeOutLeftBig`
* `fadeOutRight`
* `fadeOutRightBig`

### Flippers

![animatable-flip](https://cloud.githubusercontent.com/assets/378279/10590296/ef3076ca-767d-11e5-9f62-6b9c696dad51.gif)

* `flipInX`
* `flipInY`
* `flipOutX`
* `flipOutY`

### Lightspeed

![animatable-lightspeed](https://cloud.githubusercontent.com/assets/378279/10590301/ef374c8e-767d-11e5-83ad-b249d2731f43.gif)

* `lightSpeedIn`
* `lightSpeedOut`

### Sliding Entrances

![animatable-slidein](https://cloud.githubusercontent.com/assets/378279/10590300/ef36dfe2-767d-11e5-932b-1cccce78087b.gif)

* `slideInDown`
* `slideInUp`
* `slideInLeft`
* `slideInRight`

### Sliding Exits

![animatable-slideout](https://cloud.githubusercontent.com/assets/378279/10590299/ef35a3ca-767d-11e5-94e0-441fd49b6444.gif)

* `slideOutDown`
* `slideOutUp`
* `slideOutLeft`
* `slideOutRight`

### Zooming Entrances

![animatable-zoomin](https://cloud.githubusercontent.com/assets/378279/10590302/ef37d438-767d-11e5-8480-a212e21c2192.gif)

* `zoomIn`
* `zoomInDown`
* `zoomInUp`
* `zoomInLeft`
* `zoomInRight`

### Zooming Exits

![animatable-zoomout](https://cloud.githubusercontent.com/assets/378279/10590298/ef33fa52-767d-11e5-80fe-6b8dbb5e53d0.gif)

* `zoomOut`
* `zoomOutDown`
* `zoomOutUp`
* `zoomOutLeft`
* `zoomOutRight`

## [Usage]

Add `	maven { url 'https://jitpack.io' }` in `build.gradle` 
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```
Add dependency in `build.gradle`
```
dependencies {
	        implementation 'com.github.hpkaushik121:Android_Animatable:1.0.1'
	}
```


```
<com.sourabh.animateable.Animateable
        android:layout_width="wrap_content"
        app:duration="1000"
        app:animation="bounceIn"
        app:autoStart="true"
        android:layout_height="wrap_content">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    </com.sourabh.animateable.Animateable>
```
    
* `durantion` -> Integer
* `autostart` -> Boolean
* `animation` -> `bounce | bounceInRight | bounceInLeft | bounceInUp | bounceInDown | flash | rubberBand | pulse | shake | swing | wobble | tada | standUp | wave | rollin | rollOut | bounceIn | fadeInUp | fadeInDown | fadeInLeft | fadeInRight | fadeOut | fadeOutUp | fadeOutDown | fadeOutRight | fadeOutLeft | flipInX | flipInY | flipOutX | flipOutY | rotateIn | rotateInDownLeft | rotateInDownRight | rotateInUpLeft | rotateInUpRight`
* `repeatCount` -> Integer
* `repeatMode`  -> `INFINITE | RESTART | REVERSE | START_ON_FIRST_FRAME | ABSOLUTE | RELATIVE_TO_SELF | RELATIVE_TO_PARENT | ZORDER_NORMAL | ZORDER_TOP | ZORDER_BOTTOM`

* `startDelay` -> Integer
## License

[MIT License]
