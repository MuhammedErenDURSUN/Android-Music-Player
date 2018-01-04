package denis.musicplayer.ui.main.artist

import denis.musicplayer.ui.main.base.MainBaseMvpPresenter
import denis.musicplayer.ui.main.base.MainBasePresenter

/**
 * Created by denis on 01/01/2018.
 */
interface ArtistMvpPresenter<V: ArtistMvpView> : MainBaseMvpPresenter<V> {
    fun getArtists()
}