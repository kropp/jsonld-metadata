package org.schema.kotlin
import org.schema.Action
import org.schema.DayOfWeek

class MutableOpeningHoursSpecification {
  private val map = HashMap<String,Any>()
  var closes: java.util.Date by map
  var dayOfWeek: DayOfWeek by map
  var opens: java.util.Date by map
  var validFrom: java.util.Date by map
  var validThrough: java.util.Date by map
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
  fun build() = org.schema.OpeningHoursSpecification.Builder(map).build()
}
