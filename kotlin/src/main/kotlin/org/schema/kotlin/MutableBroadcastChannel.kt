package org.schema.kotlin
import org.schema.Action
import org.schema.BroadcastService
import org.schema.CableOrSatelliteService

class MutableBroadcastChannel {
  private val map = HashMap<String,Any>()
  var broadcastChannelId: String by map
  var inBroadcastLineup: CableOrSatelliteService by map
  fun inBroadcastLineup(builder: MutableCableOrSatelliteService.() -> Unit) { inBroadcastLineup = MutableCableOrSatelliteService().apply(builder).build() }
  var broadcastServiceTier: String by map
  var providesBroadcastService: BroadcastService by map
  fun providesBroadcastService(builder: MutableBroadcastService.() -> Unit) { providesBroadcastService = MutableBroadcastService().apply(builder).build() }
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
  fun build() = org.schema.BroadcastChannel.Builder(map).build()
}
