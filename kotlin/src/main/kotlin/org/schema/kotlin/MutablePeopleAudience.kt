package org.schema.kotlin
import org.schema.Action
import org.schema.AdministrativeArea

class MutablePeopleAudience {
  private val map = HashMap<String,Any>()
  var requiredGender: String
    get() = map["requiredGender"] as String
    set(value) { map["requiredGender"] = value }
  var requiredMaxAge: Int
    get() = map["requiredMaxAge"] as Int
    set(value) { map["requiredMaxAge"] = value }
  var requiredMinAge: Int
    get() = map["requiredMinAge"] as Int
    set(value) { map["requiredMinAge"] = value }
  var suggestedGender: String
    get() = map["suggestedGender"] as String
    set(value) { map["suggestedGender"] = value }
  var suggestedMaxAge: Any
    get() = map["suggestedMaxAge"]!!
    set(value) { map["suggestedMaxAge"] = value }
  var suggestedMinAge: Any
    get() = map["suggestedMinAge"]!!
    set(value) { map["suggestedMinAge"] = value }
  var audienceType: String
    get() = map["audienceType"] as String
    set(value) { map["audienceType"] = value }
  var geographicArea: AdministrativeArea
    get() = map["geographicArea"] as AdministrativeArea
    set(value) { map["geographicArea"] = value }
  fun geographicArea(builder: MutableAdministrativeArea.() -> Unit) { map["geographicArea"] = MutableAdministrativeArea().apply(builder).build() }
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
  fun build() = org.schema.PeopleAudience.Builder(map).build()
}
