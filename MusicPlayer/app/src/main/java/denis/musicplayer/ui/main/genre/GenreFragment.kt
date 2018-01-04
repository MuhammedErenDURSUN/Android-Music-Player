package denis.musicplayer.ui.main.genre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import denis.musicplayer.R
import denis.musicplayer.data.media.model.Genre
import denis.musicplayer.ui.main.base.MainBaseFragment
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by denis on 01/01/2018.
 */
class GenreFragment : MainBaseFragment(), GenreMvpView {

    companion object {
        fun newInstance(): GenreFragment {
            val args = Bundle()
            val fragment = GenreFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject lateinit var presenter: GenreMvpPresenter<GenreMvpView>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        activityComponent?.inject(this)
        presenter.onAttach(this)

        return view
    }

    override fun setUp(view: View?) {
    }
}