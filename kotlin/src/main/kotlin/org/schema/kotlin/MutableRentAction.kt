package org.schema.kotlin
import org.schema.*
class MutableRentAction {
  private val map = HashMap<String,Any>()
  var landlord: Any by map
  fun landlordOrganization(builder: MutableOrganization.() -> Unit) { landlord = MutableOrganization().apply(builder).build() }
  fun landlordPerson(builder: MutablePerson.() -> Unit) { landlord = MutablePerson().apply(builder).build() }
  var realEstateAgent: RealEstateAgent by map
  fun realEstateAgent(builder: MutableRealEstateAgent.() -> Unit) { realEstateAgent = MutableRealEstateAgent().apply(builder).build() }
  var price: Any by map
  var priceSpecification: PriceSpecification by map
  fun priceSpecification(builder: MutablePriceSpecification.() -> Unit) { priceSpecification = MutablePriceSpecification().apply(builder).build() }
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
  fun build() = org.schema.RentAction.Builder(map).build()
}
