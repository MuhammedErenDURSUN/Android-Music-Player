package denis.musicplayer.ui.main.track

import android.content.Context
import denis.musicplayer.data.DataManager
import denis.musicplayer.data.media.model.Track
import denis.musicplayer.di.ActivityContext
import denis.musicplayer.ui.main.base.MainBasePresenter
import denis.musicplayer.ui.main.base.MainRxBus
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import denis.musicplayer.ui.main.base.MainEnumRxBus.*
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by denis on 31/12/2017.
 */
class TrackPresenter<V : TrackMvpView>
    @Inject constructor(@ActivityContext context: Context,
                        dataManager: DataManager,
                        compositeDisposable: CompositeDisposable,
                        rxBus: MainRxBus)
    : MainBasePresenter<V, Track>(context, dataManager, compositeDisposable, rxBus), TrackMvpPresenter<V> {

    private val TAG = "TrackPresenter"



    override fun getItems() {
        compositeDisposable.add(Observable.fromCallable {
            dataManager.scanTracks()
        }.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    mvpView?.updateArray(it)
                })
    }

    override fun getItemsForPlaylist() {
        mvpView?.showUpdatePlaylist(getArray())
    }

}