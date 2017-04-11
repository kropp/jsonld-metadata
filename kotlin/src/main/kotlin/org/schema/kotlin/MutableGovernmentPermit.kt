package org.schema.kotlin
import org.schema.*
class MutableGovernmentPermit {
  private val map = HashMap<String,Any>()
  var issuedThrough: Service by map
  fun issuedThrough(builder: MutableService.() -> Unit) { issuedThrough = MutableService().apply(builder).build() }
  var permitAudience: Audience by map
  fun permitAudience(builder: MutableAudience.() -> Unit) { permitAudience = MutableAudience().apply(builder).build() }
  var validFor: Duration by map
  var validFrom: java.util.Date by map
  var validIn: AdministrativeArea by map
  fun validIn(builder: MutableAdministrativeArea.() -> Unit) { validIn = MutableAdministrativeArea().apply(builder).build() }
  var validUntil: java.util.Date by map
  var issuedBy: Organization by map
  fun issuedBy(builder: MutableOrganization.() -> Unit) { issuedBy = MutableOrganization().apply(builder).build() }
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
  fun build() = org.schema.GovernmentPermit.Builder(map).build()
}
