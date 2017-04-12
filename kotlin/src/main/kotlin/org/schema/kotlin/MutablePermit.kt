package org.schema.kotlin
import org.schema.*
class MutablePermit {
  private val map = HashMap<String,Any>()
  var issuedThrough: Service
    get() = map["issuedThrough"] as Service
    set(value) { map["issuedThrough"] = value }
  fun issuedThrough(builder: MutableService.() -> Unit) { map["issuedThrough"] = MutableService().apply(builder).build() }
  var permitAudience: Audience
    get() = map["permitAudience"] as Audience
    set(value) { map["permitAudience"] = value }
  fun permitAudience(builder: MutableAudience.() -> Unit) { map["permitAudience"] = MutableAudience().apply(builder).build() }
  var validFor: Duration
    get() = map["validFor"] as Duration
    set(value) { map["validFor"] = value }
  var validFrom: java.util.Date
    get() = map["validFrom"] as java.util.Date
    set(value) { map["validFrom"] = value }
  var validIn: AdministrativeArea
    get() = map["validIn"] as AdministrativeArea
    set(value) { map["validIn"] = value }
  fun validIn(builder: MutableAdministrativeArea.() -> Unit) { map["validIn"] = MutableAdministrativeArea().apply(builder).build() }
  var validUntil: java.util.Date
    get() = map["validUntil"] as java.util.Date
    set(value) { map["validUntil"] = value }
  var issuedBy: Organization
    get() = map["issuedBy"] as Organization
    set(value) { map["issuedBy"] = value }
  fun issuedBy(builder: MutableOrganization.() -> Unit) { map["issuedBy"] = MutableOrganization().apply(builder).build() }
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
  fun build() = org.schema.Permit.Builder(map).build()
}
