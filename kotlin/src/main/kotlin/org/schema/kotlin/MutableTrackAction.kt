package org.schema.kotlin
import org.schema.*
class MutableTrackAction {
  private val map = HashMap<String,Any>()
  var deliveryMethod: DeliveryMethod
    get() = map["deliveryMethod"] as DeliveryMethod
    set(value) { map["deliveryMethod"] = value }
  var agent: Any
    get() = map["agent"]!!
    set(value) { map["agent"] = value }
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { map["agent"] = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { map["agent"] = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date
    get() = map["endTime"] as java.util.Date
    set(value) { map["endTime"] = value }
  var startTime: java.util.Date
    get() = map["startTime"] as java.util.Date
    set(value) { map["startTime"] = value }
  var actionStatus: ActionStatusType
    get() = map["actionStatus"] as ActionStatusType
    set(value) { map["actionStatus"] = value }
  var error: Thing
    get() = map["error"] as Thing
    set(value) { map["error"] = value }
  fun error(builder: MutableThing.() -> Unit) { map["error"] = MutableThing().apply(builder).build() }
  var target: EntryPoint
    get() = map["target"] as EntryPoint
    set(value) { map["target"] = value }
  fun target(builder: MutableEntryPoint.() -> Unit) { map["target"] = MutableEntryPoint().apply(builder).build() }
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
  fun build() = org.schema.TrackAction.Builder(map).build()
}
