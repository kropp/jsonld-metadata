package org.schema.kotlin
import org.schema.Action

class MutableGeoCoordinates {
  private val map = HashMap<String,Any>()
  var address: Any by map
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { address = MutablePostalAddress().apply(builder).build() }
  var addressCountry: Any by map
  fun addressCountryCountry(builder: MutableCountry.() -> Unit) { addressCountry = MutableCountry().apply(builder).build() }
  var elevation: Any by map
  var latitude: Any by map
  var longitude: Any by map
  var postalCode: String by map
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
  fun build() = org.schema.GeoCoordinates.Builder(map).build()
}
