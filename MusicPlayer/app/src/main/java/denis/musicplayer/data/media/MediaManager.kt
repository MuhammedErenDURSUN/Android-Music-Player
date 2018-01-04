package denis.musicplayer.data.media

import denis.musicplayer.data.media.model.*
import denis.musicplayer.data.playlist.model.Playlist

/**
 * Created by denis on 01/01/2018.
 */
interface MediaManager {
    fun scanTracks(): ArrayList<Track>
    fun scanAlbums(): ArrayList<Album>
    fun scanArtists(): ArrayList<Artist>
    fun scanGenres(): ArrayList<Genre>
}