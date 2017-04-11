package org.schema.kotlin
import org.schema.Action
import org.schema.AdministrativeArea
import org.schema.QuantitativeValue

class MutableBusinessAudience {
  private val map = HashMap<String,Any>()
  var numberOfEmployees: QuantitativeValue by map
  fun numberOfEmployees(builder: MutableQuantitativeValue.() -> Unit) { numberOfEmployees = MutableQuantitativeValue().apply(builder).build() }
  var yearlyRevenue: QuantitativeValue by map
  fun yearlyRevenue(builder: MutableQuantitativeValue.() -> Unit) { yearlyRevenue = MutableQuantitativeValue().apply(builder).build() }
  var yearsInOperation: QuantitativeValue by map
  fun yearsInOperation(builder: MutableQuantitativeValue.() -> Unit) { yearsInOperation = MutableQuantitativeValue().apply(builder).build() }
  var audienceType: String by map
  var geographicArea: AdministrativeArea by map
  fun geographicArea(builder: MutableAdministrativeArea.() -> Unit) { geographicArea = MutableAdministrativeArea().apply(builder).build() }
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
  fun build() = org.schema.BusinessAudience.Builder(map).build()
}
