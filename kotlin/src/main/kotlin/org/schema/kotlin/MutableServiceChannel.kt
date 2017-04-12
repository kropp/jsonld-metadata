package org.schema.kotlin
import org.schema.*
class MutableServiceChannel {
  private val map = HashMap<String,Any>()
  var availableLanguage: Any
    get() = map["availableLanguage"]!!
    set(value) { map["availableLanguage"] = value }
  fun availableLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["availableLanguage"] = MutableLanguage().apply(builder).build() }
  var processingTime: Duration
    get() = map["processingTime"] as Duration
    set(value) { map["processingTime"] = value }
  var providesService: Service
    get() = map["providesService"] as Service
    set(value) { map["providesService"] = value }
  fun providesService(builder: MutableService.() -> Unit) { map["providesService"] = MutableService().apply(builder).build() }
  var serviceLocation: Place
    get() = map["serviceLocation"] as Place
    set(value) { map["serviceLocation"] = value }
  fun serviceLocation(builder: MutablePlace.() -> Unit) { map["serviceLocation"] = MutablePlace().apply(builder).build() }
  var servicePhone: ContactPoint
    get() = map["servicePhone"] as ContactPoint
    set(value) { map["servicePhone"] = value }
  fun servicePhone(builder: MutableContactPoint.() -> Unit) { map["servicePhone"] = MutableContactPoint().apply(builder).build() }
  var servicePostalAddress: PostalAddress
    get() = map["servicePostalAddress"] as PostalAddress
    set(value) { map["servicePostalAddress"] = value }
  fun servicePostalAddress(builder: MutablePostalAddress.() -> Unit) { map["servicePostalAddress"] = MutablePostalAddress().apply(builder).build() }
  var serviceSmsNumber: ContactPoint
    get() = map["serviceSmsNumber"] as ContactPoint
    set(value) { map["serviceSmsNumber"] = value }
  fun serviceSmsNumber(builder: MutableContactPoint.() -> Unit) { map["serviceSmsNumber"] = MutableContactPoint().apply(builder).build() }
  var serviceUrl: String
    get() = map["serviceUrl"] as String
    set(value) { map["serviceUrl"] = value }
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
  fun build() = org.schema.ServiceChannel.Builder(map).build()
}
