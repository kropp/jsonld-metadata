package org.schema.kotlin
import org.schema.Action
import org.schema.ActionStatusType
import org.schema.EntryPoint
import org.schema.Thing

class MutableSearchAction {
  private val map = HashMap<String,Any>()
  var query: String by map
  var agent: Any by map
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { agent = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { agent = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date by map
  var startTime: java.util.Date by map
  var actionStatus: ActionStatusType by map
  var error: Thing by map
  fun error(builder: MutableThing.() -> Unit) { error = MutableThing().apply(builder).build() }
  var target: EntryPoint by map
  fun target(builder: MutableEntryPoint.() -> Unit) { target = MutableEntryPoint().apply(builder).build() }
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
  fun build() = org.schema.SearchAction.Builder(map).build()
}
