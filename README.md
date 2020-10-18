# <i>Observable</i> and <i>LiveData</i> in Android data binding
In the case for MVVM + data binding, both LiveData or Observable can be used.
However to use LiveData with data binding we should add one more line of code: ```myBinding.lifecycleOwner = this```
If ```lifecycleOwner``` is not registered on binding object the views will not properly update.

What happens without ```lifecycleOwner```:


After registering ```lifecycleOwner```:


## <i>Observable</i> vs <i>LiveData</i> in data binding?
Only LiveData is lifecycle aware so it'd be better in many cases. Still, it depends. (Some say the advantage of lifecycle-awareness is not huge)