package org.schema.kotlin
import org.schema.Action
import org.schema.GameServerStatus
import org.schema.VideoGame

class MutableGameServer {
  private val map = HashMap<String,Any>()
  var serverStatus: GameServerStatus by map
  var playersOnline: Int by map
  var game: VideoGame by map
  fun game(builder: MutableVideoGame.() -> Unit) { game = MutableVideoGame().apply(builder).build() }
  var additionalType: String by map
  var alternateName: String by map
  var disambiguatingDescription: String by map
  var mainEntityOfPage: Any by map
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { mainEntityOfPage = MutableCreativeWork().apply(builder).build() }
  var name: String by map
  var sameAs: String by map
  var url: String by map
  var potentialAction: Action by map
  fun potentialAction(builder: MutableAction.() -> Unit) { potentialAction = MutableAction().apply(builder).build() }
  var id: String by map
  fun build() = org.schema.GameServer.Builder(map).build()
}
