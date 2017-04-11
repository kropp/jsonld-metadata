package org.schema.kotlin
import org.schema.*
class MutableServiceChannel {
  private val map = HashMap<String,Any>()
  var availableLanguage: Any by map
  fun availableLanguageLanguage(builder: MutableLanguage.() -> Unit) { availableLanguage = MutableLanguage().apply(builder).build() }
  var processingTime: Duration by map
  var providesService: Service by map
  fun providesService(builder: MutableService.() -> Unit) { providesService = MutableService().apply(builder).build() }
  var serviceLocation: Place by map
  fun serviceLocation(builder: MutablePlace.() -> Unit) { serviceLocation = MutablePlace().apply(builder).build() }
  var servicePhone: ContactPoint by map
  fun servicePhone(builder: MutableContactPoint.() -> Unit) { servicePhone = MutableContactPoint().apply(builder).build() }
  var servicePostalAddress: PostalAddress by map
  fun servicePostalAddress(builder: MutablePostalAddress.() -> Unit) { servicePostalAddress = MutablePostalAddress().apply(builder).build() }
  var serviceSmsNumber: ContactPoint by map
  fun serviceSmsNumber(builder: MutableContactPoint.() -> Unit) { serviceSmsNumber = MutableContactPoint().apply(builder).build() }
  var serviceUrl: String by map
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
  fun build() = org.schema.ServiceChannel.Builder(map).build()
}
