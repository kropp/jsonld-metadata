package org.schema.kotlin
import org.schema.Action

class MutableGeoShape {
  private val map = HashMap<String,Any>()
  var address: Any
    get() = map["address"]!!
    set(value) { map["address"] = value }
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["address"] = MutablePostalAddress().apply(builder).build() }
  var addressCountry: Any
    get() = map["addressCountry"]!!
    set(value) { map["addressCountry"] = value }
  fun addressCountryCountry(builder: MutableCountry.() -> Unit) { map["addressCountry"] = MutableCountry().apply(builder).build() }
  var box: String
    get() = map["box"] as String
    set(value) { map["box"] = value }
  var circle: String
    get() = map["circle"] as String
    set(value) { map["circle"] = value }
  var elevation: Any
    get() = map["elevation"]!!
    set(value) { map["elevation"] = value }
  var line: String
    get() = map["line"] as String
    set(value) { map["line"] = value }
  var polygon: String
    get() = map["polygon"] as String
    set(value) { map["polygon"] = value }
  var postalCode: String
    get() = map["postalCode"] as String
    set(value) { map["postalCode"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var name: String
    get() = map["name"] as String
    set(value) { map["name"] = value }
  var sameAs: String
    get() = map["sameAs"] as String
    set(value) { map["sameAs"] = value }
  var url: String
    get() = map["url"] as String
    set(value) { map["url"] = value }
  var potentialAction: Action
    get() = map["potentialAction"] as Action
    set(value) { map["potentialAction"] = value }
  fun potentialAction(builder: MutableAction.() -> Unit) { map["potentialAction"] = MutableAction().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.GeoShape.Builder(map).build()
}
