package app.sinanyilmaz.sampleflavorwithmap

import android.app.Application
import com.huawei.hms.maps.MapsInitializer

class SampleFlavorWithMap : Application() {
    override fun onCreate() {
        super.onCreate()
        // Set the API key.
        MapsInitializer.setApiKey("CgB6e3x9XalCIK4+RBLM+HnAzmjqQn39LVPQ+/AoxDQWrSlsQ/cM25AELvyLi4khrDyJm+LLRzm0V5HcSs1xMysI")
    }
}