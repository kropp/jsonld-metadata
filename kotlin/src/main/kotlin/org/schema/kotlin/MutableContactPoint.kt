package org.schema.kotlin
import org.schema.Action
import org.schema.ContactPointOption
import org.schema.OpeningHoursSpecification

class MutableContactPoint {
  private val map = HashMap<String,Any>()
  var availableLanguage: Any by map
  fun availableLanguageLanguage(builder: MutableLanguage.() -> Unit) { availableLanguage = MutableLanguage().apply(builder).build() }
  var contactOption: ContactPointOption by map
  var contactType: String by map
  var email: String by map
  var faxNumber: String by map
  var hoursAvailable: OpeningHoursSpecification by map
  fun hoursAvailable(builder: MutableOpeningHoursSpecification.() -> Unit) { hoursAvailable = MutableOpeningHoursSpecification().apply(builder).build() }
  var productSupported: Any by map
  fun productSupportedProduct(builder: MutableProduct.() -> Unit) { productSupported = MutableProduct().apply(builder).build() }
  var telephone: String by map
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
  fun build() = org.schema.ContactPoint.Builder(map).build()
}
