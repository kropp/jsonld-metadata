package org.schema.kotlin
import org.schema.Action

class MutableSeat {
  private val map = HashMap<String,Any>()
  var seatNumber: String by map
  var seatRow: String by map
  var seatSection: String by map
  var seatingType: Any by map
  fun seatingTypeQualitativeValue(builder: MutableQualitativeValue.() -> Unit) { seatingType = MutableQualitativeValue().apply(builder).build() }
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
  fun build() = org.schema.Seat.Builder(map).build()
}
