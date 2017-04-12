package org.schema.kotlin
import org.schema.*
class MutableRsvpAction {
  private val map = HashMap<String,Any>()
  var additionalNumberOfGuests: Any
    get() = map["additionalNumberOfGuests"]!!
    set(value) { map["additionalNumberOfGuests"] = value }
  var rsvpResponse: RsvpResponseType
    get() = map["rsvpResponse"] as RsvpResponseType
    set(value) { map["rsvpResponse"] = value }
  var comment: Comment
    get() = map["comment"] as Comment
    set(value) { map["comment"] = value }
  fun comment(builder: MutableComment.() -> Unit) { map["comment"] = MutableComment().apply(builder).build() }
  var event: Event
    get() = map["event"] as Event
    set(value) { map["event"] = value }
  fun event(builder: MutableEvent.() -> Unit) { map["event"] = MutableEvent().apply(builder).build() }
  var about: Thing
    get() = map["about"] as Thing
    set(value) { map["about"] = value }
  fun about(builder: MutableThing.() -> Unit) { map["about"] = MutableThing().apply(builder).build() }
  var inLanguage: Any
    get() = map["inLanguage"]!!
    set(value) { map["inLanguage"] = value }
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["inLanguage"] = MutableLanguage().apply(builder).build() }
  var recipient: Any
    get() = map["recipient"]!!
    set(value) { map["recipient"] = value }
  fun recipientAudience(builder: MutableAudience.() -> Unit) { map["recipient"] = MutableAudience().apply(builder).build() }
  fun recipientOrganization(builder: MutableOrganization.() -> Unit) { map["recipient"] = MutableOrganization().apply(builder).build() }
  fun recipientPerson(builder: MutablePerson.() -> Unit) { map["recipient"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.RsvpAction.Builder(map).build()
}
