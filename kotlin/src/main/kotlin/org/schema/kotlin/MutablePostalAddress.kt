package org.schema.kotlin
import org.schema.Action
import org.schema.ContactPointOption
import org.schema.OpeningHoursSpecification

class MutablePostalAddress {
  private val map = HashMap<String,Any>()
  var addressCountry: Any
    get() = map["addressCountry"]!!
    set(value) { map["addressCountry"] = value }
  fun addressCountryCountry(builder: MutableCountry.() -> Unit) { map["addressCountry"] = MutableCountry().apply(builder).build() }
  var addressLocality: String
    get() = map["addressLocality"] as String
    set(value) { map["addressLocality"] = value }
  var addressRegion: String
    get() = map["addressRegion"] as String
    set(value) { map["addressRegion"] = value }
  var postalCode: String
    get() = map["postalCode"] as String
    set(value) { map["postalCode"] = value }
  var postOfficeBoxNumber: String
    get() = map["postOfficeBoxNumber"] as String
    set(value) { map["postOfficeBoxNumber"] = value }
  var streetAddress: String
    get() = map["streetAddress"] as String
    set(value) { map["streetAddress"] = value }
  var availableLanguage: Any
    get() = map["availableLanguage"]!!
    set(value) { map["availableLanguage"] = value }
  fun availableLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["availableLanguage"] = MutableLanguage().apply(builder).build() }
  var contactOption: ContactPointOption
    get() = map["contactOption"] as ContactPointOption
    set(value) { map["contactOption"] = value }
  var contactType: String
    get() = map["contactType"] as String
    set(value) { map["contactType"] = value }
  var email: String
    get() = map["email"] as String
    set(value) { map["email"] = value }
  var faxNumber: String
    get() = map["faxNumber"] as String
    set(value) { map["faxNumber"] = value }
  var hoursAvailable: OpeningHoursSpecification
    get() = map["hoursAvailable"] as OpeningHoursSpecification
    set(value) { map["hoursAvailable"] = value }
  fun hoursAvailable(builder: MutableOpeningHoursSpecification.() -> Unit) { map["hoursAvailable"] = MutableOpeningHoursSpecification().apply(builder).build() }
  var productSupported: Any
    get() = map["productSupported"]!!
    set(value) { map["productSupported"] = value }
  fun productSupportedProduct(builder: MutableProduct.() -> Unit) { map["productSupported"] = MutableProduct().apply(builder).build() }
  var telephone: String
    get() = map["telephone"] as String
    set(value) { map["telephone"] = value }
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
  fun build() = org.schema.PostalAddress.Builder(map).build()
}
